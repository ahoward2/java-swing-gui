package math;
import java.sql.*;

public class RunFinanceProgram {
	
	//Replace url with the path to your project's directory 
	//Mac OS /path/to/directory/test.db
	//Windows C:/path/to/directory/test.db
	final public static String DATABASE_URL = "/Users/austinhoward/Othello/FinanceProgram/src/test.db";

	public static void main(String[] args) {
		
		Connection c = null;
		Statement stmt = null;
	      
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:" + DATABASE_URL);
	         
	         
	         stmt = c.createStatement();
	         String sqlDropTable = "DROP TABLE FINANCES";
	         String sqlCreateTable = "CREATE TABLE FINANCES " +
	                        "(ID INT PRIMARY  KEY     NOT NULL," +
	                        " INCOME          CHAR(50)    , " + 
	                        " EXPENSES        CHAR(50)    , " + 
	                        " INVESTMENTPERC  CHAR(10), " + 
	                        " CASH            CHAR(50))"; 
	         String sqlInsert = "INSERT INTO FINANCES (ID,CASH,INCOME,EXPENSES,INVESTMENTPERC) " +
                     			"VALUES (1, 0.0, 0.0, 0.0, 0.0 );"; 
	         
	         stmt.executeUpdate(sqlCreateTable); //comment out after first run
	         stmt.executeUpdate(sqlInsert);  //comment out after first run
	         //stmt.executeUpdate(sqlDropTable);
	         stmt.close();
	         
	         c.close();
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   
		
		Model model = new Model();
		View view = new View("Finance App");
		Controller controller = new Controller(model, view);
		controller.initController();
	}

	
}
