package com.sgtesting.methodsassignments;
//Addition of two matrix
class AdditionMatrix
{
	void addition(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int k=0;k<c.length;k++)
		{
			for(int l=0;l<c[k].length;l++)
			{
				System.out.print(c[k][l]+"  ");
			}
			System.out.println();
		}
	}
}
public class AdditionMatrixDemo {
	public static void main(String[] args) {
		AdditionMatrix add=new AdditionMatrix();
		int x[][]= {{1,2,3},{4,5,6}};
		int y[][]= {{2,3,4},{5,6,9}};
		add.addition(x, y);
	}
}
