package day7;

import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer name");
		String customerName=sc.nextLine();
		System.out.println("Enter the phone number");
		String phoneNumber=sc.nextLine();	
		System.out.println("Enter the street name");
		String streetName=sc.nextLine();
		System.out.println("Enter the bill amount");
		double billAmount=sc.nextDouble();
		System.out.println("Enter the distance");
		int distance=sc.nextInt();
		sc.nextLine();
		CustomerDetails c=new CustomerDetails(customerName,phoneNumber,streetName,billAmount,distance);
		System.out.println(c);
		sc.close();
	}
}
