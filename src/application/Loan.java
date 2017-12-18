package application;

public class Loan {
	
	//PRIVATE INSTANCE VARIABLES
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	
	//CONSTRUCTORS
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}

	//PUBLIC GETTERS AND SETTERS
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	//PUBLIC METHOD
	public double getMonthlyPayment() {
		
		double monthlyInterestRate = annualInterestRate / 1200;

		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 /Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

		return monthlyPayment;

		
	}
	
	public double getTotalPayment() {
		
		return getMonthlyPayment() * numberOfYears * 12;
	}
	

}
