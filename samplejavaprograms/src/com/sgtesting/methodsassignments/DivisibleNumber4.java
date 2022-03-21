package com.sgtesting.methodsassignments;
// These numbers are divisible by 4 from 100 to 1
class Divisible4
{
	void divisible(int x,int y)
	{
		for(int i=x;i>=y;i--)
		{
			if(i%4==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class DivisibleNumber4 {
	public static void main(String[] args) {
		Divisible4 div=new Divisible4();
		div.divisible(100, 1);
	}
}
