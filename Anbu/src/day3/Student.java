package day3;

public class Student {
	String name;
	int grade;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	public String toString(){
		return "Name:"+name+"\nGrade:"+grade;
	}
}
