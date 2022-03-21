package com.sgtesting.methodsassignments;
//Fibonanci Series
class Fibonanci
{
	void fibonanci()
	{
		int f1=0;
		int f2=1;
		for(int i=1;i<=10;i++)
		{
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}
}
public class FibonanciNumber {
	public static void main(String[] args) {
		Fibonanci fib=new Fibonanci();
		fib.fibonanci();
	}
}
