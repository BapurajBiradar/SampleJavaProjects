package com.sgtesting.methodassignment;
class SumOfDigits
{
	int sum(int num)
	{ 
		int tsum=0;
		int	n=num;
		while(n>0)
		{
			int i=n%10;
			tsum=tsum+i;
			n=n/10;
		}
		return tsum;
	}
}
public class SumOfDigitsDemo {
	public static void main(String[] args) {
		SumOfDigits digits=new SumOfDigits();
		int sum=digits.sum(456);
		System.out.println("sum of digits is: "+sum);
	}
}
