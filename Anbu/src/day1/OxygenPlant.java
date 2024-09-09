package day1;

import java.util.Scanner;

public class OxygenPlant {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter the length in(m):");
		double length=sc.nextDouble();
		if(length<=0) {
			System.out.println("Invalid Length");
			return;
		}
		System.out.println("Enter the Breadth in(m):");
		double breadth=sc.nextDouble();
		if(breadth<=0) {
			System.out.println("Invalid Breadth");
			return;
		}
		System.out.println("Enter the Area in(cm)");
		double area=sc.nextDouble();
		if(area<=0) {
			System.out.println("Invalid Area");
			return;
		}
		double totalplants=(length*breadth/area)*100*100;
		totalplants-=totalplants%10;
		System.out.printf("Total Plants: %.0f \n",totalplants);
		double oxygen=totalplants*0.9;
		System.out.printf("Total Production of Oxygen: %.2f liters",oxygen);
		}

}
