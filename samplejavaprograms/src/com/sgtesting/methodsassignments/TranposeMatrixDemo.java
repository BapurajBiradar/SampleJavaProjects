package com.sgtesting.methodsassignments;
//Transpose a matraix
class TransposeMatrix
{
	void transpose(int a[][])
	{
		int b[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class TranposeMatrixDemo {
	public static void main(String[] args) {
		TransposeMatrix tran=new TransposeMatrix();
		int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		tran.transpose(x);
	}
}
