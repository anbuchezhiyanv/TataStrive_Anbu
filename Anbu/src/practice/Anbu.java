package practice;

abstract class Vehicles{
	final void startEngine(){
		System.out.println("Engine Started");
	}
	static String getVehicleType() {
		return "Generic ";
	}
	abstract void drive();
}

class Lorry extends Vehicles{
	@Override
	void drive() {
		System.out.println("Drive a Car");
	}
}

class Bike extends Vehicles{
	@Override
	void drive() {
		System.out.println("Drive a Bike");
	}
}

public class Anbu {
	public static void main(String[] args) {
		Lorry l=new Lorry();
		l.startEngine();
		System.out.println(Vehicles.getVehicleType());
		l.drive();
		Bike b=new Bike();
		b.startEngine();
		System.out.println(Vehicles.getVehicleType());
		b.drive();
		
		
		
	}
}
