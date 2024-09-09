package practice;

import java.util.Scanner;

public class NumberPlay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int rem=0;
		int q=0;
		if(num>=10 && num<=99) {
			rem+=num%10;
			q+=num/10;
			int ans=q-rem;
			if(num>50) 
			{
				System.out.println("greater than 50	: " +ans);
			}
			else if(num<50)
			{
				ans=rem-q;
				System.out.println("less than 50	: " +ans);
			}
		}
		else
		{
			System.out.println("Invalid Number!");
		}
		sc.close();
	}

}
