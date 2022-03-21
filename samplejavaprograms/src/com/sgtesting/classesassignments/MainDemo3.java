package com.sgtesting.classesassignments;

class TwoWheelers
{
	String firstname;
	int noofwheeles;
	String country;
	String color;
}
 class Fourwheeles
 {
	 String firstname;
	 String color;
	 String country;
	 int noofwheeles;
 }
 public class MainDemo3{
 public static void main(String[] args){
	TwoWheelers honda=new TwoWheelers();
	honda.firstname="Herohonda";
	honda.noofwheeles=2;
	honda.color="India";
	honda.color="Red";
	System.out.println("Fisrt Name:"+honda.firstname);
	System.out.println("Noofwheeles:"+honda.noofwheeles);
	System.out.println("Country:"+honda.country);
	System.out.println("Color"+honda.color);
	System.out.println("++++++++");
	Fourwheeles bmw=new Fourwheeles();
	bmw.firstname="Bmw";
	bmw.color="White";
	bmw.country="Germany";
	bmw.noofwheeles=4;
	System.out.println("First Name"+bmw.firstname);
	System.out.println("Color:"+bmw.color);
	System.out.println("Country:"+bmw.country);
	System.out.println("Noofwheeles:"+bmw.noofwheeles);
	System.out.println("+++++++");
 }
 }
 
  


	


