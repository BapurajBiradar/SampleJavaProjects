package com.sgtesting.inheritance;
class State
{
	void place(String name)
	{
		System.out.println("Details of districts are: ");
	}
}
class District extends State
{
	String nm;
	public District()
	{
		super.place(nm);
	}
	void place(String name)
	{
		this.nm=name;
		System.out.println("This is first district:  "+nm);
	}
}
class District1 extends State
{
	String nam;
	void place(String name)
	{
		this.nam=name;
		System.out.println("This is second district:  "+nam);
	}
}
public class HierarchicalWithSameMethod {
	public static void main(String[] args) {
		District1 obj=new District1();
		District obj1=new District();
		obj.place("bijapur");
		obj1.place("bangalore");
	}
}
