package com.sgtesting.noargsconstructor;

class Metrocity
{
	String firstname;
	String founded;
	int noofward;
	String state;
    int noofwards;
    public Metrocity() {

		firstname="Bangalore";
		founded="Kempegouda";
		noofwards=198;
		state="Karnataka";
		System.out.println("FirstName:"+firstname);
		System.out.println("Founded:"+founded);
		System.out.println("Noofwards:"+noofwards);
		System.out.println("State:"+state);
		System.out.println("++++++");
    }
}
class Districts
{
	String firstname;
	int nooftaluks;
	int pincode;
	String state;
	public Districts() {
		firstname="Raichur";
		nooftaluks=7;
		pincode=584101;
		state="Karnataka";
		System.out.println("FirstName:"+firstname);
		System.out.println("Nooftaluks:"+nooftaluks);
		System.out.println("Pincode:"+pincode);
		System.out.println("State:"+state);
		System.out.println("+++++++");
	}
}
class Taluk
{
	String firstname;
	int noofvillages;
	int pincode;
	String district;
	public Taluk() {
		firstname="Sindhnur";
		noofvillages=164;
		pincode=584128;
	    district="Raichur";
		System.out.println("FirstName:"+firstname);
		System.out.println("Noofvillages:"+noofvillages);
		System.out.println("Pincode:"+pincode);
		System.out.println("District:"+district);
		System.out.println("+++++");
	}
}
	public class MainDemo4{
	public static void main(String[] args){
		Metrocity bangalore=new Metrocity();
		Districts raichur=new Districts();
		Taluk sindhnur=new Taluk();
	}
	}


