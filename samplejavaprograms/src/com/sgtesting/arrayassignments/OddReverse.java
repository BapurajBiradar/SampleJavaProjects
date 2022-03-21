package com.sgtesting.arrayassignments;

public class OddReverse {

	public static void main(String[] args) {
		int count=0;
		for(int i=121;i<=171;i++)
		{
			if(i%2!=0) 
			{
				count++;
			}
		}
		System.out.println("# of odd numbers"+count);
		int a[]=new int[count];
		int k=0;
		for (int j =121; j<=171;j++) 
		{
			if(j%2!=0) 
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
