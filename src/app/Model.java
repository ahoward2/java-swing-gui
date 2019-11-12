package app;

import java.sql.*;

public class Model {
	
	private double cash;
	private double income;
	private double expenses;
	private double investmentPerc;
	private double cashInvested;
	private double leftOverCash;
	private Math math = new Math();
	

	public Model() {
		
	}

	public double getCash() {
		return cash;
	}
	
	public String getCashString() {
		Connection c = null;
		Statement stmt = null;
		String cashFromDB = "0.0";
		   
		try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:" + RunFinanceProgram.DATABASE_URL);
		      c.setAutoCommit(false);
		      System.out.println("Opened database successfully");

		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM FINANCES;" );
		      
		      while ( rs.next() ) {
		          int id = rs.getInt("id");
		          cashFromDB = rs.getString("cash");
		          
		          
		          System.out.println( "ID = " + id );
		          System.out.println( "CASH = " + cashFromDB );
		          
		          System.out.println();
		       }
		       rs.close();
		       stmt.close();
		       c.close();
		    } catch ( Exception e ) {
		       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		       System.exit(0);
		    }
		    System.out.println("Operation done successfully");
		   
		return cashFromDB;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}
	
	public void setCashFromString(String cash) {
		Connection c = null;
	    Statement stmt = null;
	    
	    try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:" + RunFinanceProgram.DATABASE_URL);
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "UPDATE FINANCES set CASH = " + cash + " where ID=1;";; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.commit();
	         c.close();
	     } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	     }
	     System.out.println("Records created successfully");
	   
	    
		this.cash = Double.valueOf(cash);
	}

	public double getIncome() {
		return income;
	}
	
	public String getIncomeString() {
		Connection c = null;
		Statement stmt = null;
		String incomeFromDB = "0.0";
		   
		try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:" + RunFinanceProgram.DATABASE_URL);
		      c.setAutoCommit(false);
		      System.out.println("Opened database successfully");

		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM FINANCES;" );
		      
		      while ( rs.next() ) {
		          int id = rs.getInt("id");
		          incomeFromDB = rs.getString("income");
		          
		          
		          System.out.println( "ID = " + id );
		          System.out.println( "INCOME = " + incomeFromDB );
		          
		          System.out.println();
		       }
		       rs.close();
		       stmt.close();
		       c.close();
		    } catch ( Exception e ) {
		       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		       System.exit(0);
		    }
		    System.out.println("Operation done successfully");
		return incomeFromDB;
	}
	
	public void setIncomeFromString(String income) {
		Connection c = null;
	    Statement stmt = null;
	    
	    try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:" + RunFinanceProgram.DATABASE_URL);
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "UPDATE FINANCES set INCOME = " + income + " where ID=1;";; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.commit();
	         c.close();
	     } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	     }
	     System.out.println("Records created successfully");
		this.income = Double.valueOf(income);
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getExpenses() {
		return expenses;
	}
	
	public String getExpensesString() {
		Connection c = null;
		Statement stmt = null;
		String expensesFromDB = "0.0";
		   
		try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:" + RunFinanceProgram.DATABASE_URL);
		      c.setAutoCommit(false);
		      System.out.println("Opened database successfully");

		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM FINANCES;" );
		      
		      while ( rs.next() ) {
		          int id = rs.getInt("id");
		          expensesFromDB = rs.getString("expenses");
		          
		          
		          System.out.println( "ID = " + id );
		          System.out.println( "EXPENSES = " + expensesFromDB );
		          
		          System.out.println();
		       }
		       rs.close();
		       stmt.close();
		       c.close();
		    } catch ( Exception e ) {
		       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		       System.exit(0);
		    }
		    System.out.println("Operation done successfully");
		return expensesFromDB;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	public void setExpensesFromString(String expenses) {
		Connection c = null;
	    Statement stmt = null;
	    
	    try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:" + RunFinanceProgram.DATABASE_URL);
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "UPDATE FINANCES set EXPENSES = " + expenses + " where ID=1;";; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.commit();
	         c.close();
	     } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	     }
	     System.out.println("Records created successfully");
		this.expenses = Double.valueOf(expenses);
	}
	
	public double getInvestmentPerc() {
		return investmentPerc;
	}
	
	public String getInvestmentPercString() {
		Connection c = null;
		Statement stmt = null;
		String investmentFromDB = "0.0";
		   
		try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:" + RunFinanceProgram.DATABASE_URL);
		      c.setAutoCommit(false);
		      System.out.println("Opened database successfully");

		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM FINANCES;" );
		      
		      while ( rs.next() ) {
		          int id = rs.getInt("id");
		          investmentFromDB = rs.getString("investmentperc");
		          
		          
		          System.out.println( "ID = " + id );
		          System.out.println( "INVESTMENTPERC = " + investmentFromDB );
		          
		          System.out.println();
		       }
		       rs.close();
		       stmt.close();
		       c.close();
		    } catch ( Exception e ) {
		       System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		       System.exit(0);
		    }
		    System.out.println("Operation done successfully");
		return investmentFromDB;
	}

	public void setInvestmentPerc(double investmentPerc) {
		this.investmentPerc = investmentPerc;
	}
	
	public void setInvestmentPercFromString(String investmentPerc) {
		Connection c = null;
	    Statement stmt = null;
	    
	    try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:" + RunFinanceProgram.DATABASE_URL);
	         c.setAutoCommit(false);
	         System.out.println("Opened database successfully");

	         stmt = c.createStatement();
	         String sql = "UPDATE FINANCES set INVESTMENTPERC = " + investmentPerc + " where ID=1;";; 
	         stmt.executeUpdate(sql);
	         stmt.close();
	         c.commit();
	         c.close();
	     } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	     }
	     System.out.println("Records created successfully");
		this.investmentPerc = Double.valueOf(investmentPerc);
	}

	public double getLeftOverCash() {
		updateLeftOverCash();
		return leftOverCash;
	}
	
	public String getLeftOverCashString() {
		updateLeftOverCash();
		return Double.toString(leftOverCash);
	}

	private void updateLeftOverCash() {
		Double expenses = Double.valueOf(getExpensesString());
		Double income = Double.valueOf(getIncomeString());
		Double investmentPerc = Double.valueOf(getInvestmentPercString());
		if (investmentPerc > 0.0) {
			this.leftOverCash = math.round((income - (income*(investmentPerc*0.01))) - expenses,2);
		}	
		
		else if (investmentPerc == 0.0) {
			this.leftOverCash = (income - expenses);
		}
	}
	
	public double getCashInvested() {
		updateCashInvested();
		return cashInvested;
	}

	public String getCashInvestedString() {
		updateCashInvested();
		return Double.toString(cashInvested);
	}
	
	private void updateCashInvested() {
		double income = Double.valueOf(getIncomeString());
		double investmentPerc = Double.valueOf(getInvestmentPercString());
		if (investmentPerc > 0.0) {
			this.cashInvested = math.round((income*(investmentPerc*0.01)),2);
		}
		else if (investmentPerc == 0.0) {
			this.cashInvested = 0;
		}
	}
	
	
}
