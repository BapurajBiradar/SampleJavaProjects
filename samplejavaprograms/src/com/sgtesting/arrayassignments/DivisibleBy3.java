package com.sgtesting.arrayassignments;

public class DivisibleBy3 {
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=150;i>=50;i--)
		{
			if(i%3==0) 
			{
				count++;
			}
		}
		System.out.println("# of odd numbers"+count);
		int a[]=new int[count];
		int k=0;
		for (int j =150; j>=50;j--) 
		{
			if(j%3==0) 
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
