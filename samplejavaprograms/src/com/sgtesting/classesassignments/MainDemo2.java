
package com.sgtesting.classesassignments;
class Fruits
{
	String firstname;
	String kingdom;
	String colour;
	String family;
}
class Flower
{
	String firstname;
	String genus1;
	String colour;
	String kingdom;
	public String genus;
}
class Vegetable
{
	String firstname;
	String family;
	String species;
	String genus;
}
 public class MainDemo2{
 public static void main(String[] args){
	 Fruits apple=new Fruits();
	 apple.firstname="apple";
	 apple.kingdom="Plantae";
	 apple.colour="Red";
	 apple.family="Rosaceae";
	 System.out.println("First name:"+apple.firstname);
	 System.out.println("Kingdom:"+apple.kingdom);
	 System.out.println("Colour:"+apple.colour);
	 System.out.println("Family:"+apple.family);
	 System.out.println("++++++++");
	 Flower Rose=new Flower();
	 Rose.firstname="Rose";
	 Rose.genus1="Rosa";
	 Rose.colour="Red";
	 Rose.kingdom="Plantae";
	 System.out.println("First name:"+Rose.firstname);
	 System.out.println("Genus1:"+Rose.genus1);
	 System.out.println("Colour:"+Rose.colour);
	 System.out.println("kingdom:"+Rose.kingdom);
	 System.out.println("+++++++");
	 Vegetable onion=new Vegetable();
	 onion.firstname="Onion";
	 onion.family="Amaryllidaceae";
	 onion.species="Cepa";
	 onion.genus="Allium";
	 System.out.println("First name:"+onion.firstname);
	 System.out.println("Family:"+onion.family);
	 System.out.println("Species:"+onion.species);
	 System.out.println("Genus:"+onion.genus);
	 System.out.println("++++++++");
	 }
 }




		

	


