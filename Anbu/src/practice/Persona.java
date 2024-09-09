package practice;

public class Persona {
	public String name;
	protected int age;
//	private String socialSecurityNumber;
	String address;
	
	Persona(String name,int age,String socialSecurityNumber,String address) {
		this.name=name;
		this.age=age;
//		this.socialSecurityNumber=socialSecurityNumber;
		this.address=address;
	
}
}

class Employees extends Persona
{
	Employees(String name,int age,String socialSecurityNumber,String address){
		super(name,age,socialSecurityNumber,address);
	}
}

class MainCls{
	public static void main(String[] args) {
		Employees e1=new Employees("Anbu",21,"Xy324","South");
		System.out.println(e1.name);
		System.out.println(e1.age);
//		System.out.println(e1.socialSecurityNumber);
		System.out.println(e1.address);

		
		
	}
}
