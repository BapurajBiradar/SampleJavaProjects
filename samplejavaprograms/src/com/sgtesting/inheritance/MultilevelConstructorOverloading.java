package com.sgtesting.inheritance;
class Vehicle
{
	public Vehicle(String colour,int price) {
		System.out.println("Vehicle details are below");
	}
	public Vehicle(int price,String colour) {

	}
//	void vehicle()
//	{
//		System.out.println("Vehicle Details are below");
//	}
}
class car extends Vehicle
{
	String col;
	int pr;
	public car(String colour,int price)
	{
		super(colour,price);
		this.col=colour;
		this.pr=price;
//		super.vehicle();
	}
	public car(int price,String colour)
	{
		super(price,colour);
		this.pr=price;
		this.col=colour;
	}
	void car() 
	{
		System.out.println("Car colour is: "+col);
		System.out.println("Car price is: "+pr);
	}
}
class Bus extends car
{
	String colour;
	int price;
	public Bus(String colour,int price) 
	{
		super(colour,price);
		this.colour=colour;
		this.price=price;
		super.car();
	}
	public Bus(int price,String colour) 
	{
		super(price,colour);
		this.price=price;
		this.colour=colour;
		this.Bus();
	}
	void Bus() 
	{
		System.out.println("Bus colour is: "+colour);
		System.out.println("Bus price is: "+price);
	}
}

public class MultilevelConstructorOverloading {
	public static void main(String[] args) {
		Bus obj=new Bus("Blue",120000);
		Bus obj1=new Bus(900000,"Red");
	}
}
