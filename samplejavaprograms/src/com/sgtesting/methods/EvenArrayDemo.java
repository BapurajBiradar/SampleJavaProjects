package com.sgtesting.methods;
class EvenArray
{
	void even()
	{
		for(int i=51;i>=31;i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	int[] even1()
	{  
		int count=0;
		for(int i=51;i>=31;i--)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		int a[]=new int[count];
		int j=0;
		for(int i=51;i>=31;i--)
		{
			if(i%2==0)
			{
				a[j]=i;
				j++;
			}
		}
		return a;
	}
}
public class EvenArrayDemo {
	public static void main(String[] args) {
		EvenArray obj=new EvenArray();
		obj.even();
		System.out.println("-----------");
		int total[]=obj.even1();
		for(int i=0;i<total.length;i++)
		{
			System.out.print(total[i]+"  ");
		}
	}
}
