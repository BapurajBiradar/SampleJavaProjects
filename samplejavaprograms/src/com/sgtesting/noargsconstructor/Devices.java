package com.sgtesting.noargsconstructor;

class Desktop{
	String name;
	int ram;
	String model;
	String panelcolour;
	Desktop(){
		name="Acer";
		model="ac15";
		ram=4;
		panelcolour="graycolour";
		System.out.println("name of desktop   "+name);
		System.out.println("model of desktop   "+model);
		System.out.println("ram of desktop   "+ram);
		System.out.println("panel colour of desktop   "+panelcolour);
	}
	
}
class Laptop{
	String name;
	int ram;
	String model;
	int harddisk;
	public Laptop() {
		name="HP";
		model="pavilion";
		ram=8;
		harddisk=500;
		System.out.println("name of laptop   "+name);
		System.out.println("model of laptop   "+model);
		System.out.println("ram of laptop   "+ram);
		System.out.println("harddisk of laptop   "+harddisk);
	}
}
class Mobile{
	String name;
	int ram;
	String model;
	int price;
	public Mobile() {
		name="VIVO";
		model="y9";
		ram=6;
		price=15000;
		System.out.println("name of mobile   "+name);
		System.out.println("model of mobile   "+model);
		System.out.println("ram of mobile   "+ram);
		System.out.println("price of mobile   "+price);
	}
}

public class Devices {
	public static void main(String[] args) {
		Desktop acer=new Desktop();
		Laptop hp=new Laptop();
		Mobile vivo=new Mobile();
	}
}
