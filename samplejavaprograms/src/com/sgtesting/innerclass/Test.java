package com.sgtesting.innerclass;
class Outer
{
	Outer()
	{
		System.out.println("it is a outer class constructor");
	}
	static class Inner
	{
		Inner()
		{
			System.out.println("it is a inner class constructor");
		}
	}
}
public class Test {
	public static void main(String[] args) {
		Outer obj=new Outer();
		Outer.Inner obj2=new Outer.Inner();
	}
}
