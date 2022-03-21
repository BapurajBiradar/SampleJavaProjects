package com.sgtesting.classesassignments;

class Birds
{
	String firstname;
	String color;
	int noofwings;
	String kingdom;
}
class Animals
{
	String firstname;
	String kingdom;
	String genus;
	String species;
}
 class Plants
 {
	 String firstname;
	 String kingdom;
	 String family;
	 String order;
}
 public class MainDemo5{
 public static void main(String[] args){
	Birds parrot=new Birds();
	parrot.firstname="Parrot";
	parrot.color="Green";
	parrot.noofwings=2;
	parrot.kingdom="Animalia";
	System.out.println("First Name");
	System.out.println("Color"+parrot.color);
	System.out.println("Noofwings"+parrot.noofwings);
	System.out.println("Kingdom"+parrot.kingdom);
	System.out.println("++++++");
	Animals tiger=new Animals();
	tiger.firstname="Bengal tiger";
	tiger.kingdom="Animalia";
	tiger.genus="Panthera";
	tiger.species="Tigris";
	System.out.println("First Name:"+tiger.firstname);
	System.out.println("Kingdom:"+tiger.kingdom);
	System.out.println("Genus:"+tiger.genus);
	System.out.println("Species:"+tiger.species);
	System.out.println("+++++++");
	Plants bamboo=new Plants();
	bamboo.firstname="Bamboo";
	bamboo.kingdom="Plantae";
	bamboo.family="Poaceae";
	bamboo.order="Poales";
	System.out.println("First Name"+bamboo.firstname);
	System.out.println("Kingdom"+bamboo.kingdom);
	System.out.println("Family:"+bamboo.family);
	System.out.println("Order:"+bamboo.order);
	System.out.println("+++++");
	 }
 
 }
 
 

	


