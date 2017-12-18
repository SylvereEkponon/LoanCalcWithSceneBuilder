package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField AnnualInterestRate;
	@FXML
	private TextField numberofyear;
	@FXML
	private TextField loanamount;
	@FXML
	private TextField monthlypayment;
	@FXML
	private TextField totalpayment;
	
	private Loan loan;
	
    public void calculateLoanPayment(ActionEvent e) {
        // Get values from text fields
        double interestRate = Double.parseDouble(AnnualInterestRate.getText());
        int numberOfYear = Integer.parseInt(numberofyear.getText());
        double loanAmount = Double.parseDouble(loanamount.getText());

        // Create a loan object
        loan = new Loan(interestRate, numberOfYear, loanAmount);

        // Display monthly payment and total payment
        monthlypayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        totalpayment.setText(String.format("$%.2f",loan.getTotalPayment()));
    }


}
