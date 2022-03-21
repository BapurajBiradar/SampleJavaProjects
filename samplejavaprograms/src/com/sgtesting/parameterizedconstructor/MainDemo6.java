package com.sgtesting.parameterizedconstructor;

class Maths
{
	public Maths(String Firstname,String father,int noofoperaters,String addition) {
		System.out.println("FirstName:"+Firstname);
		System.out.println("Father:"+father);
		System.out.println("Noofoperater:"+noofoperaters);
		System.out.println("Addition:"+addition);
		System.out.println("++++++");
	}
}
class Physics
{
	public Physics(String firstname,String scientist,String equation,String law) {
		System.out.println("FirstName:"+firstname);
		System.out.println("Scientist:"+scientist);
		System.out.println("Equation:"+equation);
		System.out.println("Law:"+law);
		System.out.println("++++++");
	}
}
class Chemistry
{
	public Chemistry(String firstname,String scientist,String chemical,String formula) {
		System.out.println("FirstName:"+firstname);
		System.out.println("Scientist:"+scientist);
		System.out.println("Chemical:"+chemical);
		System.out.println("Formula:"+formula);
		System.out.println("++++++");
	}
}
public class MainDemo6{
	public static void main(String[] args){
		Maths maths=new Maths("maths","arkemedies",4,"addition");
		Physics physic=new Physics("physics","newton","2","newtons");
		Chemistry chemistrys=new Chemistry("chemistry","einstein","e==mc2","h20");
	}
}
