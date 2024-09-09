package day4;

public class SavingsAccount extends BankAccount {
	double interestRate;
	double interest;
	public SavingsAccount() {
		
	}
	public SavingsAccount(int accountNumber,double balance,double interestRate,double interest) {
		super(accountNumber,balance);
		this.interestRate=interestRate;
		this.interest=interest;
	}
	public void interestRate() {
		interestRate=balance*interest/100;
		System.out.println("Your interestRate is:"+interestRate);
	}
	public void toDisplay() {
		super.toDisplay();
		interestRate();
	}
}
