package com.sgtesting.interfaces;
interface Cars
{
	void nameOfCar(String name);
}
interface Buses
{
	void nameOfBus(String name);
}
interface Bike
{
	void nameOfBike(String name);
}
abstract class Vehicles 
{
	void nameOfVehicle()
	{
		System.out.println("These are Name Vehicles");
	}
}
class Person extends Vehicles implements Buses,Cars,Bike
{
	public void nameOfCar(String name) 
	{
		System.out.println("Name of Car is: "+name);
	}
	public void nameOfBus(String name)
	{
		System.out.println("Name of Bus is: "+name);
	}
	public void nameOfBike(String name) 
	{
		System.out.println("Name of Bike is: "+name);
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Person obj=new Person();
		obj.nameOfVehicle();
		obj.nameOfBus("Volvo");
		obj.nameOfCar("Audi");
		obj.nameOfBike("KTM");
	}
}
