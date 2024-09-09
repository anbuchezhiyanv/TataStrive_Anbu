package day6;

import java.util.Scanner;

public class Hosteller extends Student{
	static Scanner sc=new Scanner(System.in);
	private int roomNumber;
	private char blockName;
	private String roomType;
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int roomNumber,char blockName,String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber=roomNumber;
		this.blockName=blockName;
		this.roomType=roomType;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double calculateTotalFee() {
		double total=0;
		if(blockName==('A') && roomType.equalsIgnoreCase("AC")) {
			total=60000+8000;
		}
		else if(blockName==('B') && roomType.equalsIgnoreCase("AC")) {
			total=50000+5000;
		}
		else if(blockName==('C') && roomType.equalsIgnoreCase("AC")){
			total=40000+2500;
		}
		else if(blockName==('A') && roomType.equalsIgnoreCase("Non-AC")){
			total=60000;
		}
		else if(blockName==('B') && roomType.equalsIgnoreCase("Non-AC")) {
			total=50000;
		}
		else if(blockName==('C') && roomType.equalsIgnoreCase("Non-AC")){
			total=40000;
		}
		total=collegeFee+total;
		return total;
		
}
}
