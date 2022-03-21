package com.sgtesting.methodsassignments;
//These are even numbers from 40 to 20
class Even{
	void even(int x,int y)
	{
		for(int i=x;i>=y;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class EvenDemo {
	public static void main(String[] args) {
		Even e=new Even();
		e.even(40, 20);
	}
}
