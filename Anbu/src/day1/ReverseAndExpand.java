package day1;

import java.util.Scanner;

public class ReverseAndExpand {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the Number:");
	int num=sc.nextInt();
	int numberOfDigits=String.valueOf(num).length();
	if(numberOfDigits!=4) {
		System.out.println(num+"is an invalid number");
		return;
	}
	String reversed="";
	int multipler=1;
	String expanded="";
	for(int i=1;i<=numberOfDigits;i++) {
		int digit=num%10;
		reversed=reversed+digit;
		if(digit!=0) {
			expanded=(digit*multipler)+(expanded.isEmpty() ? "":"+"+expanded);
		}
		num=num/10;
		multipler*=10;
	}
	System.out.println("Reversed number is:"+reversed);
	System.out.println(expanded);
}
}
