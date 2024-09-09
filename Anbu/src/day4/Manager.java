package day4;

public class Manager extends Employee {
	String department;
    Manager(){
		
	}
	Manager(String name,int id,double salary,String department) {
		super(name,id,salary);
		this.department=department;
	}
	public String toString() {
		return department;
	}
	public void displayDetails() {
		super.displayDetails();		
		System.out.println("dept:"+department);
	}
}
	

