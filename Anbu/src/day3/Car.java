package day3;

public class Car {
	String make;
	String model;
	int year;
	public Car() {
		
	}
	public Car(String make,String model,int year) {
		this.make=make;
		this.model=make;
		this.year=year;
	}
	public void displayDetails(String make,String model,int year) {
		System.out.printf("%-15s %-15s %-15s\n","Make","Model","Year");
		System.out.printf("%-15s %-15s %-15s\n",make,model,year);
	}
	public String toString() {
		return "Make:"+make+"\nModel:"+model+"\nYear:"+year;
	}
	
	
}
