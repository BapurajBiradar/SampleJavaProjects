package com.sgtesting.interfaces;
interface Vehicle
{
	void price(int price);
}
class Bus implements Vehicle
{
	public void price(int price) 
	{
		System.out.println("Price of Bus is: "+price);
	}
}
class Car implements Vehicle
{
	public void price(int price) 
	{
		System.out.println("Price of Car is: "+price);
	}
}
public class HirarchicalInheritanceDemo {
	public static void main(String[] args) {
		Bus bus=new Bus();
		bus.price(600000);
		Car car=new Car();
		car.price(2500000);
	}
}
