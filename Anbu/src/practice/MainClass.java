package practice;

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	public String toString() {
		return name;
	}
	public void display(String name) {
		this.name=name;
		System.out.println(name);
	}
}

class Employee extends Person{
	int id;
	Employee(String name,int id) {
		super(name);
		this.id=id;
	}
	public int getId(int id) {
		return id;
	}
	public void display() {
		super.display(this.name);
		System.out.println(this.id);
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		Employee e1=new Employee("Anbu",12);
		e1.display();
	}

}
