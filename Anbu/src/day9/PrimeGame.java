package day9;

import java.util.Scanner;

public class PrimeGame 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int[] firstArray= {};
		int[] secondArray= {};
		int[] thirdArray= {};
		int sumOfLastDigitThirdArray=0;
		System.out.println("Enter the size of first Array:");
		int sizeFirst=sc.nextInt();
		if(sizeFirst<0) 
		{
			System.out.println(sizeFirst+" size of first Array is Invalid");
			return;
		}
		firstArray=new int[sizeFirst];
		System.out.println("Enter the array elements:");
		for(int i=0;i<sizeFirst;i++) 
		{
			firstArray[i]=sc.nextInt();
			if(firstArray[i]<0) {
				System.out.println("Elements of first Array is Invalid:");
				return;
			}
		}
		System.out.println("Enter the size of second array:");
		int sizeSecond=sc.nextInt();
		if(sizeFirst!=sizeSecond) 
		{
			System.out.println("Both Elements are in Different Size");
			return;
		}
		if(sizeSecond<0) 
		{
			System.out.println(sizeSecond+" size of Second Array is Invalid");
			return;
		}
		secondArray=new int[sizeSecond];
		System.out.println("Enter the array elements:");
		for(int i=0;i<sizeSecond;i++) 
		{
			secondArray[i]=sc.nextInt();
			if(secondArray[i]<0)
			{
				System.out.println("Elements of Second Array is Invalid:");
				return;
			}
		}
		thirdArray=new int[sizeFirst];	
		for(int i=0;i<sizeFirst;i++) 
		{
			thirdArray[i]=firstArray[i]+secondArray[i];
			sumOfLastDigitThirdArray+=thirdArray[i]%10;
		}	
		if(sumOfLastDigitThirdArray>=2) 
		{
			int count=0;
			for(int i=2;i<sumOfLastDigitThirdArray;i++) 
			{
				if(sumOfLastDigitThirdArray%i==0)
				{
					count++;
				}
			}
			if(count==0) 
			{
				System.out.println(sumOfLastDigitThirdArray+" Prime number");
			}
			else
			{
				System.out.println(sumOfLastDigitThirdArray+" Not a Prime Number");
			}
		}	
		}
	
}
