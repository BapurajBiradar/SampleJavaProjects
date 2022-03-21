package com.sgtesting.methods;
class OddArray
{
	void odd()
	{
		for(int i=121;i>=91;i--)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

	int[] odd1()
	{  
		int count=0;
		for(int i=121;i>=91;i--)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		int a[]=new int[count];
		int j=0;
		for(int i=121;i>=91;i--)
		{
			if(i%2!=0)
			{
				a[j]=i;
				j++;
			}
		}
		return a;
	}
}
public class OddArrayDemo {
	public static void main(String[] args) {
		OddArray obj=new OddArray();
		obj.odd();
		System.out.println("-----------");
		int total[]=obj.odd1();
		for(int i=0;i<total.length;i++)
		{
			System.out.print(total[i]+"  ");
		}
	}
}
