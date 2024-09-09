package day5;

import java.util.Scanner;

public class UserInterface {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Gpay idfc=new IDFC();
		Gpay sbi=new SBI();
		Gpay bank=idfc;
		bank.commonFeature();
		int choice=0;
		do {
			System.out.println("-----------------------\n\t"+bank.getClass().getSimpleName()+"\n-----------------------");
			System.out.println("1.Make Payment");
			System.out.println("2.Check Balance");
			System.out.println("3.Switch Your Account");
			System.out.println("4.Exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Amount:");
				double amount=sc.nextDouble();
				bank.makePayment(amount);
				
				break;
			case 2:
				bank.checkBalance();
				break;
			case 3:
				System.out.println("Your Accounts");
				System.out.println("1.IDFC");
				System.out.println("2.SBI");
				System.out.println("Choose Your Account");
				int selectBank=sc.nextInt();
				if(selectBank==1) {
					System.out.println("You're Now in IDFC Bank Account");
					bank=idfc;
				}
				else if(selectBank==2) {
					System.out.println("You're Now in SBI Bank Account");
					bank=sbi;
				}				
			}
			
		}while(choice!=4);
	
			
		
	}
}

