package math;

import javax.swing.JOptionPane;

public class Controller {
	
	private Model model;
	private View view;
	public Controller(Model m, View v) {
	  model = m;
	  view = v;
	  initView();
	}

	public void initView() {
		view.getCashTextfield().setText(model.getCashString());
		view.getIncomeTextfield().setText(model.getIncomeString());
		view.getExpensesTextField().setText(model.getExpensesString());
		view.getInvestmentTextField().setText(model.getInvestmentPercString());
	}
	
	public void initController() {
		  view.getCashSaveButton().addActionListener(e -> saveCash());
		  view.getIncomeSaveButton().addActionListener(e -> saveIncome());
		  view.getExpensesSaveButton().addActionListener(e -> saveExpenses());
		  view.getInvestmentSaveButton().addActionListener(e -> saveInvestmentPerc());
		  view.getHello().addActionListener(e -> showDetails());
		  view.getBye().addActionListener(e -> sayBye());
		 }
		 private void saveCash() {
		  model.setCashFromString(view.getCashTextfield().getText());
		  JOptionPane.showMessageDialog(null, "Cash saved : $" + model.getCashString(), "Info", JOptionPane.INFORMATION_MESSAGE);
		 }
		 private void saveIncome() {
		  model.setIncomeFromString(view.getIncomeTextfield().getText());
		  JOptionPane.showMessageDialog(null, "Income saved : $" + model.getIncomeString(), "Info", JOptionPane.INFORMATION_MESSAGE);
		 }
		 private void saveExpenses() {
			 model.setExpensesFromString(view.getExpensesTextField().getText());
			 JOptionPane.showMessageDialog(null, "Expenses saved : $" + model.getExpensesString(), "Info", JOptionPane.INFORMATION_MESSAGE);
		 }
		 private void saveInvestmentPerc() {
			 model.setInvestmentPercFromString(view.getInvestmentTextField().getText());
			 JOptionPane.showMessageDialog(null, "Investment % saved : " + model.getInvestmentPercString(), "Info", JOptionPane.INFORMATION_MESSAGE);
		 }
		 private void showDetails() {
		  JOptionPane.showMessageDialog(null, 
				  "Cash: $" + model.getCashString() + "\n" + 
				  "Weekly Income: $" + model.getIncomeString() + "\n" +
				  "Weekly Expenses: $" + model.getExpensesString() + "\n" +
				  "Investment %: " + model.getInvestmentPercString() + "\n" +
				  "Weekly Cash Invested: $" + model.getCashInvestedString() + "\n" +
				  "Left Over Cash After Investments: $" + model.getLeftOverCashString(), "Details", JOptionPane.INFORMATION_MESSAGE);
		 }
		 private void sayBye() {
		  System.exit(0);
		 }
}
