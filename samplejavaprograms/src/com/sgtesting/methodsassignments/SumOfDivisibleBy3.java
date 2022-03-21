package com.sgtesting.methodsassignments;
//sum of first 100 numbers which are divisible by 3
class Divisible3
{
	void sum(int x,int y)
	{
		int sum=0;
		for(int i=x;i<=y;i++)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Total sum of numbers which are divisible by 3 is : "+sum);
	}
}
public class SumOfDivisibleBy3 {
	public static void main(String[] args) {
		Divisible3 div=new Divisible3();
		div.sum(1, 100);
	}
}
