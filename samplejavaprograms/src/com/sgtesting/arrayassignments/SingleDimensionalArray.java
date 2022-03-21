package com.sgtesting.arrayassignments;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int ar[][]= {{1,2,3},{2,3,4}};
		int a[]=new int[ar.length];
		int k=0;
		for(int i=0;i<ar.length;i++) 
		{
			for(int j=0;j<ar[i].length;j++)
			{
			  a[k]=ar[i][j];
			  System.out.print(a[k]+"  ");
			}
		}
	}
}
