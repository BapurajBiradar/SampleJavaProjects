package com.sgtesting.methods;
class PrimeMain
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
	boolean prime1(int x)
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
			return false;
		}
		else
		{
			return true;
		}
	}
}
public class PrimeMainDemo {
	public static void main(String[] args) {
		PrimeMain obj=new PrimeMain();
		obj.prime(11);
		obj.prime(21);
		System.out.println("--------------");
		boolean s1=obj.prime1(11);
		System.out.println(s1);
		boolean s2=obj.prime1(21);
		System.out.println(s2);

	}
}
