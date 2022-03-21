package com.sgtesting.methodassignment;
class Transpose
{
	int[][]transpose(int a[][])
	{
		int b[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		return b;
	}
}
public class TranposeDemo {
	public static void main(String[] args) {
		Transpose tran=new Transpose();
		int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int y[][]=tran.transpose(x);
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				System.out.print(y[i][j]+"  ");
			}
			System.out.println();
		}

	}
}
