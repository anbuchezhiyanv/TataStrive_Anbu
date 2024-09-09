package day1;

import java.util.Scanner;

public class BmiCalculator {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter Your Weight:");
	double weight=sc.nextDouble();
	System.out.println("Enter Your Height:");
    double height=sc.nextDouble();
	double bmi=weight/((height/100)*(height/100));
	System.out.printf("Your BMI is %.2f",bmi);
	if(bmi>=25) {
		double reduce=bmi-25;
		System.out.printf(".You are overweight \nReduce %.2f kg to be fit",reduce);
	}
	else if(bmi<=25 && bmi>=18.5) {
		System.out.println(".You are fit and healthy");
	}
	else if(bmi<=18.5) {
		double gain=18.5-bmi;
		System.out.printf(".You are underweight \nGain %.2f kg to be fit",gain);
	}
}
}
