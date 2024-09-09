package day5;

public abstract class Gpay {
	public abstract void makePayment(double amount);
	public abstract void checkBalance();
	public void commonFeature() {
		System.out.println("Processing Payment Through Gpay ");
	}
	
}
