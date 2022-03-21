package com.sgtesting.methodassignment;
class MultiplicationMatrix
{
	int[][] mul(int x[][],int y[][])
	{
		int a[][]=new int[y.length][y[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				a[i][j]=x[i][j]*y[i][j];
			}
		}
		return a;
	}
}
public class MultiplicationMatrixDemo {
	public static void main(String[] args) {
		MultiplicationMatrix matrix=new MultiplicationMatrix();
		int x[][]= {{1,2,3}};
		int y[][]= {{4,5,6},{7,8,9}};	
		int a[][]=matrix.mul(x,y);
		
		for (int i = 0; i < a.length; i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
