package com.sgtesting.classesassignments;

class Metrocity
{
	String firstname;
	String founded;
	int noofward;
	String state;
	public int noofwards;
}
class Districts
{
	String firstname;
	int nooftaluks;
	int pincode;
	String state;
}
class Taluk
{
	String firstname;
	int noofvillages;
	int pincode;
	String district;
}
	public class MainDemo4{
	public static void main(String[] args){
		Metrocity bangalore=new Metrocity();
		bangalore.firstname="Bangalore";
		bangalore.founded="Kempegouda";
		bangalore.noofwards=198;
		bangalore.state="Karnataka";
		System.out.println("FirstName:"+bangalore.firstname);
		System.out.println("Founded:"+bangalore.founded);
		System.out.println("Noofwards:"+bangalore.noofwards);
		System.out.println("State:"+bangalore.state);
		System.out.println("++++++");
		Districts raichur=new Districts();
		raichur.firstname="Raichur";
		raichur.nooftaluks=7;
		raichur.pincode=584101;
		raichur.state="Karnataka";
		System.out.println("FirstName:"+raichur.firstname);
		System.out.println("Nooftaluks:"+raichur.nooftaluks);
		System.out.println("Pincode:"+raichur.pincode);
		System.out.println("State:"+raichur.state);
		System.out.println("+++++++");
		Taluk sindhnur=new Taluk();
		sindhnur.firstname="Sindhnur";
		sindhnur.noofvillages=164;
		sindhnur.pincode=584128;
		sindhnur.district="Raichur";
		System.out.println("FirstName:"+sindhnur.firstname);
		System.out.println("Noofvillages:"+sindhnur.noofvillages);
		System.out.println("Pincode:"+sindhnur.pincode);
		System.out.println("District:"+sindhnur.district);
		System.out.println("+++++");
	}
	}


