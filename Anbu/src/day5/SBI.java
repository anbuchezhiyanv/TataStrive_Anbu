package day5;

import java.util.Scanner;

public class SBI extends Gpay {
	private double balance=300;
	private int upiPin=2207;
	static Scanner sc=new Scanner(System.in);
	public void makePayment(double amount) {
		if(balance>=amount) {
			balance-=amount;
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
