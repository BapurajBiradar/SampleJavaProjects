package com.sgtesting.methodassignment;
class ResultantArray
{
	int[] result(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			c[j]=a[i];
			j++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[j]=b[i];
			j++;
		}
		return c;
	}
}
public class ResultantArrayDemo {
	public static void main(String[] args) {
		ResultantArray array=new ResultantArray();
		int x[]= {1,2,3,4,5};
		int y[]= {3,4,5,6,7};
		int z[]=array.result(x, y);
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+"  ");
		}
	}
}
