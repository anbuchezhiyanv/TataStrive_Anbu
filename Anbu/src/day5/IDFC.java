package day5;

import java.util.Scanner;

public class IDFC extends Gpay {
	private double balance=10;
	private int upiPin=2003;
	Scanner sc=new Scanner(System.in);
	public void makePayment(double amount)
	{
		if(balance>=amount) {
			this.balance-=amount;
			System.out.println("Your Transaction is Success");
		}
		else
		{
			System.out.println("Insufficent Balance");
		}
		
	}
	public void checkBalance() {
		System.out.println("Enter a Valid PIN Number:");
		int pin=sc.nextInt();
		if(upiPin==pin) {
			System.out.println("Your Balance is:"+balance);
		}
		else
		{
			System.out.println("You Entered the incorrect PIN");
		}
	}
}
