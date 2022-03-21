package com.sgtesting.methodassignment;
class NumberOfDigits
{
	int digits(int num)
	{
		int count=0;
		int n=num;
		while(n>0)
		{
			int i=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
}
public class NumberOfDigitsDemo {
	public static void main(String[] args) {
		NumberOfDigits dig=new NumberOfDigits();
		int s=dig.digits(1456);
		System.out.println("Number of digits in that number is:"+s);
	}
}
