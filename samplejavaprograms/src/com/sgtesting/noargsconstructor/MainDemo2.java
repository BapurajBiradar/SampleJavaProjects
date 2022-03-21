
package com.sgtesting.noargsconstructor;

class Fruits
{
	String firstname;
	String kingdom;
	String colour;
	String family;
	public Fruits() {

		firstname="apple";
		kingdom="Plantae";
		colour="Red";
		family="Rosaceae";
		System.out.println("First name:"+firstname);
		System.out.println("Kingdom:"+kingdom);
		System.out.println("Colour:"+colour);
		System.out.println("Family:"+family);
		System.out.println("++++++++");
	}
}
class Flower
{
	String firstname;
	String genus1;
	String colour;
	String kingdom;
	String genus;
	 Flower() {
		firstname="Rose";
		genus1="Rosa";
		colour="Red";
		kingdom="Plantae";
		System.out.println("First name:"+firstname);
		System.out.println("Genus1:"+genus1);
		System.out.println("Colour:"+colour);
		System.out.println("kingdom:"+kingdom);
		System.out.println("+++++++");
	}
}
class Vegetable
{
	String firstname;
	String family;
	String species;
	String genus;
	 Vegetable() {
		firstname="Onion";
		family="Amaryllidaceae";
		species="Cepa";
		genus="Allium";
		System.out.println("First name:"+firstname);
		System.out.println("Family:"+family);
		System.out.println("Species:"+species);
		System.out.println("Genus:"+genus);
		System.out.println("++++++++");
	}
}
public class MainDemo2{
	public static void main(String[] args){
		Fruits apple=new Fruits();
		Flower Rose=new Flower();
		Vegetable onion=new Vegetable();
	}
}
