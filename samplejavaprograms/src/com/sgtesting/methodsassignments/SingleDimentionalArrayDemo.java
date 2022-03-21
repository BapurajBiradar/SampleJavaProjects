package com.sgtesting.methodsassignments;
//Read single dimensional array in reverse order
class ArrayDemo
{
	void reverse(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}

public class SingleDimentionalArrayDemo {
	public static void main(String[] args) {
		ArrayDemo demo=new ArrayDemo();
		int x[]= {1,2,3,4,5,6};
		demo.reverse(x);
	}
}
