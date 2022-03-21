package com.sgtesting.methods;
class OddMain
{
	void odd()
	{
		int sum=0;
		for (int i=100;i<=200;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Total sum of odd numbers: "+sum);
	}

	int odd1()
	{
		int sum=0;
		for (int i=100;i<=200;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class OddMainDemo {
	public static void main(String[] args) {
		OddMain obj=new OddMain();
		obj.odd();
		System.out.println("----------");
		int total=obj.odd1();
		System.out.println(total);
	}
}
