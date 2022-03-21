package com.sgtesting.arrayassignments;
public class DivisibleBy7 {
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%7==0) 
			{
				count++;
			}
		}
		System.out.println("# of odd numbers"+count);
		int a[]=new int[count];
		int k=0;
		for (int j =1; j<=100;j++) 
		{
			if(j%7==0) 
			{
				a[k]=j;
				k++;
			}
		}

		for (int c = a.length-1; c >= 0; c--) {
			System.out.println(a[c]);
		}
	}
}
