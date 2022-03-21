package com.sgtesting.abstractclass;
abstract class Flower
{
	static
	{
		System.out.println("List of flowers are:");
	}
}
class ListDemo extends Flower
{
	void flowers(String flower[])
	{
		for(String flowers:flower)
		{
			System.out.println(flowers);
		}
	}
}
public class StaticBlockDemo {
	public static void main(String[] args) {
		ListDemo obj=new ListDemo();
		String f[]= {"Rose","Jasmine","Lilly"};
		obj.flowers(f);
	}
}
