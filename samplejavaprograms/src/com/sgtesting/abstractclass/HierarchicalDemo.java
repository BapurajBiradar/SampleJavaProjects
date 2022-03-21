package com.sgtesting.abstractclass;
abstract class College
{
	abstract void professor(String name);
	abstract void professor(int age);
}
class Blde extends College
{
	void professor(String name) {
		System.out.println(name+"  is Blde college professor");	
	}
	void professor(int age) {
		System.out.println(age+" is age of professor");		
	}
}
class Vsm extends College
{
	void professor(String name) {
		System.out.println(name+"  is Vsm college professor");	
	}
	void professor(int age) {
		System.out.println(age+" is age of professor");		
	}
}
public class HierarchicalDemo {
	public static void main(String[] args) {
		Blde obj=new Blde();
		obj.professor("Mallikarjun");
		obj.professor(50);
		Vsm obj1=new Vsm();
		obj1.professor("Mehta");
		obj1.professor(48);
	}
}
