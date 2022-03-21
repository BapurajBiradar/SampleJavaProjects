package com.sgtesting.noargsconstructor;

class Birds
{
	String firstname;
	String color;
	int noofwings;
	String kingdom;
	public Birds() {
		firstname="Parriot";
		color="Green";
		noofwings=2;
		kingdom="Animalia";
		System.out.println("First Name "+firstname);
		System.out.println("Color "+color);
		System.out.println("Noofwings "+noofwings);
		System.out.println("Kingdom "+kingdom);
		System.out.println("++++++");
		
	}
}
class Animals
{
	String firstname;
	String kingdom;
	String genus;
	String species;
	public Animals() {
		firstname="Bengal tiger";
		kingdom="Animalia";
		genus="Panthera";
		species="Tigris";
		System.out.println("First Name: "+firstname);
		System.out.println("Kingdom: "+kingdom);
		System.out.println("Genus: "+genus);
		System.out.println("Species: "+species);
		System.out.println("+++++++");

	}
}
 class Plants
 {
	 String firstname;
	 String kingdom;
	 String family;
	 String order;
	 public Plants() {
		 firstname="Bamboo";
			kingdom="Plantae";
			family="Poaceae";
			order="Poales";
			System.out.println("First Name "+firstname);
			System.out.println("Kingdom "+kingdom);
			System.out.println("Family: "+family);
			System.out.println("Order: "+order);
			System.out.println("+++++");
	 }
}
 public class MainDemo5{
 public static void main(String[] args){
	Birds parrot=new Birds();
	Animals tiger=new Animals();
	Plants bamboo=new Plants();
	
	 }
 
 }
 
 

	


