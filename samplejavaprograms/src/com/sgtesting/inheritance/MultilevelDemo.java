package com.sgtesting.inheritance;
class GrandFather
{
	public GrandFather()
	{
		System.out.println("This is Grandfather class constructor");
	}
}
class Father extends GrandFather
{
	public Father() 
	{
		System.out.println("This is Father class constructor");
	}
}
class Son extends Father
{
	public Son() 
	{
		System.out.println("This is Son class constructor");
	}
}
public class MultilevelDemo {
	public static void main(String[] args) {
		Son obj=new Son();
	}
}
