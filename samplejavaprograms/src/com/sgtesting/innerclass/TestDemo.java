package com.sgtesting.innerclass;
class Big
{
	Big()
	{
		Inner obj1=new Inner();
		System.out.println("it is a outer class constructor");
	}
	private class Inner
	{
		Inner()
		{
			System.out.println("it is a private inner class constructor");
		}
	}
}
public class TestDemo {
	public static void main(String[] args) {
		Big obj=new Big();
	}
} 
