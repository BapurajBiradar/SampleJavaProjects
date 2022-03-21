package com.sgtesting.parameterizedconstructor;

class Desktop{
	String Name;
	int Ram;
	String Model;
	String Panelcolour;
 public Desktop(String name,int ram,String model,String panelcolour)
	{
	    Name=name;
	    Ram=ram;
	    Model=model;
	    Panelcolour=panelcolour;
		System.out.println("name of desktop   "+Name);
		System.out.println("model of desktop   "+Model);
		System.out.println("ram of desktop   "+Ram);
		System.out.println("panel colour of desktop   "+Panelcolour);
	}
	
}
class Laptop{
	String Name;
	int Ram;
	String Model;
	int Harddisk;
	public Laptop(String name,int ram,String model,int harddisk) {
		Name=name;
		Ram=ram;
	    Model=model;
	    Harddisk=harddisk;
		System.out.println("name of laptop   "+Name);
		System.out.println("model of laptop   "+Model);
		System.out.println("ram of laptop   "+Ram);
		System.out.println("harddisk of laptop   "+Harddisk);
	}
}
class Mobile{
	String Name;
	int Ram;
	String Model;
	int Price;
	public Mobile(String name,int ram,String model,int price) {
		Name=name;
		Ram=ram;
	    Model=model;
	    Price=price;
		System.out.println("name of mobile   "+Name);
		System.out.println("model of mobile   "+Model);
		System.out.println("ram of mobile   "+Ram);
		System.out.println("price of mobile   "+Price);
	}
}

public class Devices {
	public static void main(String[] args) {
		Desktop acer=new Desktop("Hp",4,"ac15","gray");
		Laptop hp=new Laptop("Dell",6,"ac14",500);
		Mobile vivo=new Mobile("vivo",8,"y9",64);
	}
}
