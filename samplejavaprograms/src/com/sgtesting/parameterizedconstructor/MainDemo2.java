
package com.sgtesting.parameterizedconstructor;

class Fruits
{
	String Firstname;	
	String Kingdom;
	String Colour;
	String Family;
	public Fruits(String firstname,String kingdom,String colour,String family) {
		Firstname=firstname;
		Kingdom=kingdom;
		Colour=colour;
		Family=family;
		System.out.println("First name:"+Firstname);
		System.out.println("Kingdom:"+Kingdom);
		System.out.println("Colour:"+Colour);
		System.out.println("Family:"+Family);
		System.out.println("++++++++");
	}
}
class Flower
{
	String Firstname;
	String Genus;
	String Colour;
	String Kingdom;
	Flower(String firstname,String genus,String colour,String kingdom) {
		Firstname=firstname;
		Genus=genus;
		Colour=colour;
		Kingdom=kingdom;
		System.out.println("First name:"+Firstname);
		System.out.println("Genus1:"+Genus);
		System.out.println("Colour:"+Colour);
		System.out.println("kingdom:"+Kingdom);
		System.out.println("+++++++");
	}
}
class Vegetable
{
	String Firstname;
	String Family;
	String Species;
	String Genus;
	Vegetable(String firstname,String family,String species,String genus) {
		System.out.println("First name:"+Firstname);
		System.out.println("Family:"+Family);
		System.out.println("Species:"+Species);
		System.out.println("Genus:"+Genus);
		System.out.println("++++++++");
	}
}
public class MainDemo2{
	public static void main(String[] args){
		Fruits apple=new Fruits("Apple","applia","Red","plantae");
		Flower Rose=new Flower("Rose","rosi","Pink","romeria");
		Vegetable onion=new Vegetable("Onion","oni","onies","onees");
	}
}
