package com.sgtesting.abstractclass;
abstract class GrandFather
{
	abstract void behavior(String behave);
	abstract void look(String look);
}
abstract class Father extends GrandFather
{
	void behavior(String behave) 
	{
		System.out.println("Grandfather is: "+behave);
	}
}
class Son extends Father
{
	void look(String look) 
	{
		System.out.println("Grandfather looks: "+look);
	}
}
public class MultilevelDemo {
	public static void main(String[] args) {
		Son obj=new Son();
		obj.behavior("angry man");
		obj.look("smart");
	}
}
