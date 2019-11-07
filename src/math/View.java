package math;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View {
	
	 private JFrame frame;
	 private JLabel cashLabel;
	 private JLabel incomeLabel;
	 private JLabel expensesLabel;
	 private JLabel investmentLabel;
	 private JTextField cashTextfield;
	 private JTextField incomeTextfield;
	 private JTextField expensesTextField;
	 private JTextField investmentTextField;
	 private JButton cashSaveButton;
	 private JButton incomeSaveButton;
	 private JButton expensesSaveButton;
	 private JButton investmentSaveButton;
	 private JButton hello;
	 private JButton bye;
	 
	 public View(String title) {
		  frame = new JFrame(title);
		  frame.getContentPane().setLayout(new BorderLayout());
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(500, 200);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
		  // Create UI elements
		  cashLabel = new JLabel("cash :");
		  incomeLabel = new JLabel("weekly income :");
		  expensesLabel = new JLabel("weekly expenses : ");
		  investmentLabel = new JLabel("investment % : ");
		  cashTextfield = new JTextField();
		  incomeTextfield = new JTextField();
		  expensesTextField = new JTextField();
		  investmentTextField = new JTextField();
		  cashSaveButton = new JButton("Save cash");
		  incomeSaveButton = new JButton("Save income");
		  expensesSaveButton = new JButton("Save expenses");
		  investmentSaveButton = new JButton("Save investment %");
		  hello = new JButton("Show Details!");
		  bye = new JButton("Close");
		  // Add UI element to frame
		  GroupLayout layout = new GroupLayout(frame.getContentPane());
		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		  layout.setHorizontalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cashLabel)
		    .addComponent(incomeLabel).addComponent(expensesLabel).addComponent(investmentLabel))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cashTextfield)
		    .addComponent(incomeTextfield).addComponent(expensesTextField).addComponent(investmentTextField))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(cashSaveButton)
		    .addComponent(incomeSaveButton).addComponent(expensesSaveButton).addComponent(investmentSaveButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(hello)
		    .addComponent(bye)));
		  layout.setVerticalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(cashLabel)
		    .addComponent(cashTextfield).addComponent(cashSaveButton).addComponent(hello))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(incomeLabel)
		    .addComponent(incomeTextfield).addComponent(incomeSaveButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(expensesLabel)
		    .addComponent(expensesTextField).addComponent(expensesSaveButton))
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(investmentLabel)
			.addComponent(investmentTextField).addComponent(investmentSaveButton).addComponent(bye)));
		  	
		  layout.linkSize(SwingConstants.HORIZONTAL, cashSaveButton, incomeSaveButton, expensesSaveButton, investmentSaveButton);
		  layout.linkSize(SwingConstants.HORIZONTAL, hello, bye);
		  frame.getContentPane().setLayout(layout);
		 }

	public JLabel getExpensesLabel() {
		return expensesLabel;
	}

	public void setExpensesLabel(JLabel expensesLabel) {
		this.expensesLabel = expensesLabel;
	}

	public JTextField getExpensesTextField() {
		return expensesTextField;
	}

	public void setExpensesTextField(JTextField expensesTextField) {
		this.expensesTextField = expensesTextField;
	}

	public JButton getExpensesSaveButton() {
		return expensesSaveButton;
	}

	public void setExpensesSaveButton(JButton expensesSaveButton) {
		this.expensesSaveButton = expensesSaveButton;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JLabel getCashLabel() {
		return cashLabel;
	}

	public void setCashLabel(JLabel cashLabel) {
		this.cashLabel = cashLabel;
	}

	public JLabel getIncomeLabel() {
		return incomeLabel;
	}

	public void setIncomeLabel(JLabel incomeLabel) {
		this.incomeLabel = incomeLabel;
	}

	public JTextField getCashTextfield() {
		return cashTextfield;
	}

	public void setCashTextfield(JTextField cashTextfield) {
		this.cashTextfield = cashTextfield;
	}

	public JTextField getIncomeTextfield() {
		return incomeTextfield;
	}

	public void setIncomeTextfield(JTextField incomeTextfield) {
		this.incomeTextfield = incomeTextfield;
	}

	public JButton getCashSaveButton() {
		return cashSaveButton;
	}

	public void setCashSaveButton(JButton cashSaveButton) {
		this.cashSaveButton = cashSaveButton;
	}

	public JButton getIncomeSaveButton() {
		return incomeSaveButton;
	}

	public void setIncomeSaveButton(JButton incomeSaveButton) {
		this.incomeSaveButton = incomeSaveButton;
	}

	public JLabel getInvestmentLabel() {
		return investmentLabel;
	}

	public void setInvestmentLabel(JLabel investmentLabel) {
		this.investmentLabel = investmentLabel;
	}

	public JTextField getInvestmentTextField() {
		return investmentTextField;
	}

	public void setInvestmentTextField(JTextField investmentTextField) {
		this.investmentTextField = investmentTextField;
	}

	public JButton getInvestmentSaveButton() {
		return investmentSaveButton;
	}

	public void setInvestmentSaveButton(JButton investmentSaveButton) {
		this.investmentSaveButton = investmentSaveButton;
	}

	public JButton getHello() {
		return hello;
	}

	public void setHello(JButton hello) {
		this.hello = hello;
	}

	public JButton getBye() {
		return bye;
	}

	public void setBye(JButton bye) {
		this.bye = bye;
	}

}
