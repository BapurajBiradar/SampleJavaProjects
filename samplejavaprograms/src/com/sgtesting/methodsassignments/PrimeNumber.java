package com.sgtesting.methodsassignments;
//Prime Number
class Prime
{
	void prime(int x)
	{
		int temp=0;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(x+" It is not a prime number");
		}
		else
		{
			System.out.println(x+" It is a prime number");
		}
	}
}
public class PrimeNumber {
	public static void main(String[] args) {
		Prime p=new Prime();
		p.prime(11);
	}
}
