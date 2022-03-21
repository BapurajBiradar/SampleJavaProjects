package com.sgtesting.parameterizedconstructor;

class Birds
{
	public Birds(String firstname,String color,int noofwings,String kingdom) {
		System.out.println("First Name "+firstname);
		System.out.println("Color "+color);
		System.out.println("Noofwings "+noofwings);
		System.out.println("Kingdom "+kingdom);
		System.out.println("++++++");
	}
}
class Animals
{
	public Animals(String firstname,String kingdom,String genus,String species) {
		System.out.println("First Name: "+firstname);
		System.out.println("Kingdom: "+kingdom);
		System.out.println("Genus: "+genus);
		System.out.println("Species: "+species);
		System.out.println("+++++++");
	}
}
class Plants
{
	public Plants( String firstname,String kingdom,String family, String order) {
		System.out.println("First Name "+firstname);
		System.out.println("Kingdom "+kingdom);
		System.out.println("Family: "+family);
		System.out.println("Order: "+order);
		System.out.println("+++++");
	}
}
public class MainDemo5{
	public static void main(String[] args){
		Birds parrot=new Birds("peacock","pink",2,"peacokes");
		Animals tiger=new Animals("tiger","jungle","tigeris","cub");
		Plants bamboo=new Plants("bamboo","jungle","stick","row");
	}
}






