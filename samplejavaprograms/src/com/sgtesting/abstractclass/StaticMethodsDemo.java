package com.sgtesting.abstractclass;
abstract class Vehicle
{
	static String colour;
	static void price(int price)
	{
		System.out.println("The price of vehicle is: "+price);
	}
}
class Bus extends Vehicle
{
	public Bus() 
	{
		System.out.println("Details of Vehicle");
	}

}
public class StaticMethodsDemo {
	public static void main(String[] args) {
		Bus obj=new Bus();
		obj.price(120000);
		obj.colour="Blue";
		System.out.println("Colour of vehicle is "+obj.colour);
	}
}
