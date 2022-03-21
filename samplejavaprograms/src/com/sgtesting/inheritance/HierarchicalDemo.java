package com.sgtesting.inheritance;
class Maths
{
	public Maths() 
	{
		System.out.println("This is maths subject");
	}
}
class Algebra extends Maths
{
	public Algebra() 
	{
		System.out.println("This is algebra part of maths");
	}
}
class Geometry extends Maths
{
	public Geometry() 
	{
		System.out.println("This is geometry part of maths");
	}
}
public class HierarchicalDemo {
	public static void main(String[] args) {
		Geometry obj=new Geometry();
		Algebra obj1=new Algebra();
	}
}
