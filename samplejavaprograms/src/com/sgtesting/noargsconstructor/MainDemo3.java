package com.sgtesting.noargsconstructor;

class TwoWheelers
{
	String firstname;
	int noofwheeles;
	String country;
	String color;
	TwoWheelers() {
		firstname="Herohonda";
		noofwheeles=2;
		country="India";
		color="Red";
		System.out.println("Fisrt Name:"+firstname);
		System.out.println("Noofwheeles:"+noofwheeles);
		System.out.println("Country:"+country);
		System.out.println("Color:"+color);
		System.out.println("++++++++");
	}
}
class Fourwheeles
{
	String firstname;
	String color;
	String country;
	int noofwheeles;
	 Fourwheeles() {
		firstname="Bmw";
		color="White";
		country="Germany";
		noofwheeles=4;
		System.out.println("First Name"+firstname);
		System.out.println("Color:"+color);
		System.out.println("Country:"+country);
		System.out.println("Noofwheeles:"+noofwheeles);
		System.out.println("+++++++");
	}
}
public class MainDemo3{
	public static void main(String[] args){
		TwoWheelers honda=new TwoWheelers();
		Fourwheeles bmw=new Fourwheeles();
	}
}







