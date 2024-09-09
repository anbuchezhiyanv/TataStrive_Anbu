package day6;

import java.util.Scanner;

public class StudentDemo {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
//		Student dayscholar=new DayScholar(01,"Anbu","CSE","Male","DayScholar",50000,10,10);
//		Student hosteller=new Hosteller(02,"Kamaraj","CSE","Male","Hosteller",50000,5,'B',"AC");
//		dayscholar.calculateTotalFee();
//		hosteller.calculateTotalFee();
//		System.out.println(hosteller);
		System.out.println("Enter Your Id:");
		int studentId=sc.nextInt();
		System.out.println("Enter Your Name:");
		String studentName=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Your Department:");
		String department=sc.nextLine();
		System.out.println("Enter Your Gender:");
		String gender=sc.nextLine();
		System.out.println("Enter Your Category:");
		String category=sc.nextLine();
		System.out.println("Enter Your College Fee:");
		int collegeFee=sc.nextInt();
		
		if(category.equalsIgnoreCase("Hosteller")) {
			System.out.println("Enter your Room Number:");
			int roomNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your Block Name:");
			char blockName=sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Enter your Room Type");
			String roomType=sc.nextLine();
			Student hosteller=new Hosteller(studentId, studentName, department, gender, category, collegeFee,roomNumber,blockName,roomType);
			System.out.println("Your Total Fee is:"+ hosteller.calculateTotalFee());
			}
		else if(category.equalsIgnoreCase("DayScholar")) {
			System.out.println("Enter your Bus Number:");
			int busNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Your Distance:");
			float distance=sc.nextFloat();
			Student daysholar=new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
			System.out.println("Your Total Fee is:"+daysholar.calculateTotalFee());
		}
		else {
			System.out.println("INVALID DETAILS!!!");
		}
	}
}
