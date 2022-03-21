package com.sgtesting.methods;
class DivisibleBy9
{
	void divisible()
	{
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			if(i%9==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Total sum which are divisible by 9: "+sum);
	}

	int  divisible1()
	{
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			if(i%9==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
public class DivisibleBy9Demo {
	public static void main(String[] args) {
		DivisibleBy9 div=new DivisibleBy9();
		div.divisible();
		System.out.println("----------");
		int total=div.divisible1();
		System.out.println(total);
	}
}
