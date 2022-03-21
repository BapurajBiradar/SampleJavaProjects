package com.sgtesting.arrayassignments;

public class AdditionMatrix {

	public static void main(String[] args) {
		int ar[][]= {{1,2,3},{3,6,9}};
		int br[][]= {{1,2,3},{3,6,9}};

		int crr[][]=new int[ar.length][ar[0].length];

		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				crr[i][j]=ar[i][j]+br[i][j];
			}
		}
		System.out.println("addition of matrix in sequence order");
		for(int m=0;m<crr.length;m++)
		{
			for(int n=0;n<crr[m].length;n++)
			{
				System.out.println(crr[m][n]+"  ");
			}
		}
		System.out.println("addition of matrix in reverse order");
		for(int x=crr.length-1;x>=0;x--)
		{
			for(int y=crr[x].length-1;y>=0;y--)
			{
				System.out.println(crr[x][y]);
			}
		}
	}
}
