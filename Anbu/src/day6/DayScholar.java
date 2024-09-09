package day6;

public class DayScholar extends Student {
	private int busNumber;
	private float distance;
	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int busNumber,float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber=busNumber;
		this.distance=distance;
	}
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public double calculateTotalFee() {
		double total=0;
		if(this.distance>30 && this.distance<=40) {
			total=this.collegeFee+28000;
		}
		else if(this.distance>20 && this.distance<=30) {
			total=this.collegeFee+20000;
		}
		else if(this.distance>10 && this.distance<=20) {
			total=this.collegeFee+12000;
		}
		else if(this.distance<=10) {
			total=this.collegeFee+6000;
		}
		return total;
	}

	
}
