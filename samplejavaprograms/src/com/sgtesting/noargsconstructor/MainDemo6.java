package com.sgtesting.noargsconstructor;

class Maths
{
	String Firstname;
	String father;
	int noofoperaters;
	String addition;
	public Maths() {
		Firstname="Maths";
		 father="Archimedes";
		 noofoperaters=4;
		 addition="Plus";
		 System.out.println("FirstName:"+Firstname);
		 System.out.println("Father:"+father);
		 System.out.println("Noofoperater:"+noofoperaters);
		 System.out.println("Addition:"+addition);
		 System.out.println("++++++");
		 
	}
	}
class Physics
{
	String firstname;
	String scientist;
	String equation;
	String law;
	public Physics() {
		firstname="Physic";
		 scientist="Newton";
		 equation="F=ma";
		 law="Faraday";
		 System.out.println("FirstName:"+firstname);
		 System.out.println("Scientist:"+scientist);
		 System.out.println("Equation:"+equation);
		 System.out.println("Law:"+law);
		 System.out.println("++++++");
	}
}
class Chemistry
{
	String firstname;
	String scientist;
	String chemical;
	String formula;
	public Chemistry() {
		firstname="chemistrys";
		 scientist="Albert";
		 chemical="Hydrochloricacid";
		 formula="Hcl";
		 System.out.println("FirstName:"+firstname);
		 System.out.println("Scientist:"+scientist);
		 System.out.println("Chemical:"+chemical);
		 System.out.println("Formula:"+formula);
		 System.out.println("++++++");
	}
}
 public class MainDemo6{
 public static void main(String[] args){
 Maths maths=new Maths();
  Physics physic=new Physics();
 
 Chemistry chemistrys=new Chemistry();
 
  }
 
 }
	

	


