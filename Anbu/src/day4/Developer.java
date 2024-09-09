package day4;

public class Developer extends Employee {
	private String programmingLanguage;
	Developer(){
		
	}
	Developer(String name,int id,double salary,String department,String programmingLanguage) {
		super(name,id,salary);
		this.programmingLanguage=programmingLanguage;
	}
	public String toString() {
		return programmingLanguage;
	}
	public void displayDetails() {
		super.displayDetails();		
		System.out.println("pl:"+programmingLanguage);
	}
}

