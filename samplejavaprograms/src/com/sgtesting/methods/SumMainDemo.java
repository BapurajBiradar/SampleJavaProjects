package com.sgtesting.methods;
class SumMain
{
	int sum()
	{
		int tsum=0;
		for(int i=1;i<=10;i++)
		{
			tsum=tsum+i;
		}
		return tsum;
	}
	void sum1()
	{
		int tsum=0;
		for(int i=1;i<=10;i++)
		{
			tsum=tsum+i;
		}
		System.out.println("Total sum of first ten numbers: "+tsum);
	}
}
public class SumMainDemo {
	public static void main(String[] args) {
		SumMain obj=new SumMain();
		obj.sum1();
		System.out.println("-----------");
		int total=obj.sum();
		System.out.println(total);
	}
}
