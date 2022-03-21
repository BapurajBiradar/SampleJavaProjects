package com.sgtesting.methodassignment;
class SortedArray
{
	int[] sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
}
public class SortedArrayDemo {
	public static void main(String[] args) {
		SortedArray array=new SortedArray();
		int z[]= {44,10,3,65,23,13,7,29};
		int res[]=array.sort(z);
		System.out.println("Sorted matrix");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+"  ");
		}
		System.out.println();
		System.out.println("Sorted matrix in ascending order");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+"  ");
		}
		System.out.println();
		System.out.println("Sorted matrix in decending order");
		for(int i=res.length-1;i>=0;i--)
		{
			System.out.print(res[i]+"  ");
		}
	}
}
