package com.sgtesting.arrayassignments;
public class OddNumbers {
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=51;i>=31;i--)
		{
			if(i%2!=0) 
			{
				count++;
			}
		}
		System.out.println("# of odd numbers"+count);
		int a[]=new int[count];
		int k=0;
		for (int j =51; j>=31;j--) 
		{
			if(j%2!=0) 
			{
				a[k]=j;
				k++;
			}
		}
		for (int z : a)
		{
			System.out.println(z);
		}
	}
}
