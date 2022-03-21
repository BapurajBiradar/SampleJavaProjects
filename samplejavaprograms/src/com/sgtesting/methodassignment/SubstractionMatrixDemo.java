package com.sgtesting.methodassignment;
class SubstractionMatrix 
{
	int[][] sub(int x[][],int y[][])
	{
		int a[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				a[i][j]=x[i][j]-y[i][j];
			}
		}
		return a;
	}
}
public class SubstractionMatrixDemo {
	public static void main(String[] args) {
		SubstractionMatrix matrix=new SubstractionMatrix();
		int x[][]= {{1,2,3},{4,5,6}};
		int y[][]= {{4,5,6},{7,8,9}};	
		int a[][]=matrix.sub(x,y);
		
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
