package day7;

public class CustomerDetails implements BounsPoints,DoorDelivery {
	private String customerName;
	private String phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;
	
	
	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}
	public CustomerDetails() {
		super();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public double calculateBonusPoints() {
		if(billAmount>=250) {
			System.out.println("Customer Eligible to get Bouns Points");
			double bonus=billAmount/10;
			return bonus;
		}
		else
		{
			return 0;
		}
		
	}
	@Override
	public double deliveryCharge(){
		if(distance>=25) {
			double deliveryCharges=distance*8;
			return deliveryCharges;
		}
		else if(distance>=15 && distance<25){
			double deliveryCharges=distance*5;
			return deliveryCharges;
		}
		else if(distance<15) {
			double deliveryCharges=distance*2;
			return deliveryCharges;
		}
		return distance;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", streetName="
				+ streetName + ", billAmount=" + billAmount + ", distance=" + distance + ", calculateBonusPoints="
				+ calculateBonusPoints() + ", deliveryCharge=" + deliveryCharge() + "]";
	}
	@Override
	public double calculateBounsPoints() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
