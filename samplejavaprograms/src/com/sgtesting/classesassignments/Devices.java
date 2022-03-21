package com.sgtesting.classesassignments;

class Desktop{
	String name;
	int ram;
	String model;
	String panelcolour;
}
class Laptop{
	String name;
	int ram;
	String model;
	int harddisk;
}
class Mobile{
	String name;
	int ram;
	String model;
	int price;
}

public class Devices {
	public static void main(String[] args) {
		Desktop acer=new Desktop();
		acer.name="Acer";
		acer.model="ac15";
		acer.ram=4;
		acer.panelcolour="graycolour";
		System.out.println("name of desktop   "+acer.name);
		System.out.println("model of desktop   "+acer.model);
		System.out.println("ram of desktop   "+acer.ram);
		System.out.println("panel colour of desktop   "+acer.panelcolour);

		Laptop hp=new Laptop();
		hp.name="HP";
		hp.model="pavilion";
		hp.ram=8;
		hp.harddisk=500;
		System.out.println("name of laptop   "+hp.name);
		System.out.println("model of laptop   "+hp.model);
		System.out.println("ram of laptop   "+hp.ram);
		System.out.println("harddisk of laptop   "+hp.harddisk);

		Mobile vivo=new Mobile();
		vivo.name="VIVO";
		vivo.model="y9";
		vivo.ram=6;
		vivo.price=15000;
		System.out.println("name of mobile   "+vivo.name);
		System.out.println("model of mobile   "+vivo.model);
		System.out.println("ram of mobile   "+vivo.ram);
		System.out.println("price of mobile   "+vivo.price);

	}
}
