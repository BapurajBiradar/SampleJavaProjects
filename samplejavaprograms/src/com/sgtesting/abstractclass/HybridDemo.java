package com.sgtesting.abstractclass;
abstract class Science
{
	abstract void part1(String name);
	abstract void part2(String name);
	abstract void part3(String name);
}
abstract class Physics extends Science
{
	void part1(String name)
	{
		System.out.println("This is Science subject");
		System.out.println(name+": this is part1 of science");
	}
}
class Chemistry extends Physics
{
	void part2(String name)
	{
		System.out.println(name+": this is part1 of science");
	}
	void part3(String name) {

	}
}
class Biology extends Science
{
	void part1(String name) {

	}
	void part2(String name) {

	}
	void part3(String name) {
		System.out.println(name+": this is part3 of science");
	}
}
public class HybridDemo {
	public static void main(String[] args) {
		Chemistry obj=new Chemistry();
		obj.part1("physics");
		obj.part2("chemistry");
		Biology obj1=new Biology();
		obj1.part3("biology");
	}
}
