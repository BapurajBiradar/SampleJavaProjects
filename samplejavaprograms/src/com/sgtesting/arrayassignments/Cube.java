package com.sgtesting.arrayassignments;

public class Cube {

	public static void main(String[] args) {
		int a[]=new int[10];
		int j=0;
		for(int i=1;i<=10;i++)
		{
			int k=i*i*i;
			a[j]=k;
			j++;
		}
		for (int z=a.length-1;z>=0;z--) {
			System.out.println(a[z]);
		}
	}

}
