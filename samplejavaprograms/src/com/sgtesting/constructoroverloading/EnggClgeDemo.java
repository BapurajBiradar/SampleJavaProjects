package com.sgtesting.constructoroverloading;
class EnggClge{
	public EnggClge(String name) {
		System.out.println("Name of college: "+name);
	}
	public EnggClge(int lectures) {
		System.out.println("No of lectures in college: "+lectures);
	}
	public EnggClge(long students) {
		System.out.println("No of students: "+students);
	}
	public EnggClge(int sports,String sname) {
		System.out.println("No of sports: "+sports+" Sport name: "+sname);
	}
}
public class EnggClgeDemo {
	public static void main(String[] args) {
		EnggClge clge=new EnggClge("BLDE College");
		EnggClge clge1=new EnggClge(15);
		EnggClge clge2=new EnggClge(15);
		EnggClge clge3=new EnggClge(4,"Cricket");
	}
}
