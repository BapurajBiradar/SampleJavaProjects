package com.sgtesting.parameterizedconstructor;

class TwoWheelers
{
	String Firstname;
	int Noofwheeles;
	String Country;
	String Colour;
	TwoWheelers(String firstname,int noofwheeles,String country,String colour) {
		Firstname=firstname;
		Noofwheeles=noofwheeles;
		Country=country;
		Colour=colour;
		System.out.println("Fisrt Name:"+Firstname);
		System.out.println("Noofwheeles:"+Noofwheeles);
		System.out.println("Country:"+Country);
		System.out.println("Color:"+Colour);
		System.out.println("++++++++");
	}
}
class Fourwheeles
{
	String Firstname;
	String Colour;
	String Country;
	int Noofwheeles;
	 Fourwheeles(String firstname,String colour,String country,int noofwheeles) {
		 Firstname=firstname;
		 Colour=colour;
		 Country=country;
		 Noofwheeles=noofwheeles;
		System.out.println("First Name"+Firstname);
		System.out.println("Color:"+Colour);
		System.out.println("Country:"+Country);
		System.out.println("Noofwheeles:"+Noofwheeles);
		System.out.println("+++++++");
	}
}
public class MainDemo3{
	public static void main(String[] args){
		TwoWheelers honda=new TwoWheelers("HeroHonda",2,"India","black &red");
		Fourwheeles bmw=new Fourwheeles("bmw","white","russia",4);
	}
}







