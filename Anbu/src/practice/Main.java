package practice;

class Vehicle{
	String brand;
	int year;
	void startEngine() {
		
	}
}
class Car extends Vehicle{
	String fuelType;
	@Override
	void startEngine() {
		System.out.println("Car Engine Starts");
	}
	void drive() {
		System.out.println("Car is in drive mode");
	}
}
class Truck extends Vehicle{
	int loadCapcity;
	@Override
	void startEngine() {
		System.out.println("Truck engine Starts");
	}
	void hauling() {
		System.out.println("Truck is Hauling");
	}
}
public class Main {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="Roycee Royals";
		c1.year=1998;
		System.out.println(c1.brand+"\n"+c1.year);
		c1.startEngine();
		c1.drive();
		Truck t1=new Truck();
		t1.brand="Mahindra";
		t1.year=2023;
		System.out.println(t1.brand+"\n"+t1.year);
		t1.startEngine();
		t1.hauling();
	}
}
