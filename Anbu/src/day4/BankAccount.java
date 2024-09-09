package day4;

public class BankAccount {
	int accountNumber;
	double balance;
	public BankAccount() {
		
	}
	public BankAccount(int accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void deposit(double addedAmount){
		balance+=addedAmount;
	}
	public void withdraw(double detectedAmount){
		balance-=detectedAmount;
	}
	public void toDisplay(){
		System.out.println("Your Account Number is:"+accountNumber+"\nYour Balance is:"+balance);
	}
	
}	
