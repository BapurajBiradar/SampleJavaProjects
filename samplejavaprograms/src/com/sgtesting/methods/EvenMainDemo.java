package com.sgtesting.methods;
class EvenMain
{
	void even()
	{
		int sum=0;
		for (int i=100;i<=200;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Total sum of even numbers: "+sum);
	}

	int even1()
	{
		int sum=0;
		for (int i=100;i<=200;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class EvenMainDemo {
	public static void main(String[] args) {
		EvenMain obj=new EvenMain();
		obj.even();
		System.out.println("----------");
		int total=obj.even1();
		System.out.println(total);
	}
}
