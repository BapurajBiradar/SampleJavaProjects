package com.sgtesting.inheritance;
class Science
{
	public Science() 
	{
		System.out.println("This is science subject");
	}
}
class Physics extends Science
{
	public Physics()
	{
		System.out.println("physics part of science");
	}
}
class Chemistry extends Physics
{
	public Chemistry()
	{
		System.out.println("chemitry part of science ");
	}
}
class Biology extends Science
{
	public Biology()
	{
		System.out.println("biology part ofscience ");
	}	
}
public class HybridDemo {
	public static void main(String[] args) {
		Biology obj=new Biology();
		Chemistry obj1=new Chemistry();
	}
}
