package com.sgtesting.parameterizedconstructor;

class Metrocity
{
	String Firstname;
	String Founder;
	int Noofwards;
	String State;
    public Metrocity(String firstname,String founder,int noofwards,String state) {
    	Firstname=firstname;
    	Founder=founder;
    	Noofwards=noofwards;
    	State=state;
		System.out.println("FirstName:"+Firstname);
		System.out.println("Founded:"+Founder);
		System.out.println("Noofwards:"+Noofwards);
		System.out.println("State:"+State);
		System.out.println("++++++");
    }
}
class Districts
{
	String Firstname;
	String State;
	public Districts(String firstname,int nooftaluks,int pincode,String state) {
		System.out.println("FirstName:"+firstname);
		System.out.println("Nooftaluks:"+nooftaluks);
		System.out.println("Pincode:"+pincode);
		System.out.println("State:"+state);
		System.out.println("+++++++");
	}
}
class Taluk
{
	public Taluk(String firstname,int noofvillages,int pincode,String district) {
		System.out.println("FirstName:"+firstname);
		System.out.println("Noofvillages:"+noofvillages);
		System.out.println("Pincode:"+pincode);
		System.out.println("District:"+district);
		System.out.println("+++++");
	}
}
	public class MainDemo4{
	public static void main(String[] args){
		Metrocity bangalore=new Metrocity("bangalore","kempegouda",10,"karnataka");
		Districts raichur=new Districts("bijapur",7,58613,"karnataka");
		Taluk sindhnur=new Taluk("ittangahal",5,586104,"bijapur");
	}
	}


