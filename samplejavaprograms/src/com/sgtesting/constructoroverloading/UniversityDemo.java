package com.sgtesting.constructoroverloading;
class University{
	public University(String name) {
		System.out.println("University name: "+name);
	}
	public University(int jones) {
		System.out.println("No of jones under university: "+jones);
	}
	public University(long students) {
		System.out.println("No of students in university: "+students);
	}
	public University(int jones,int clges) {
		System.out.println("No of jones: "+jones+" No of colleges: "+clges);
	}
}
public class UniversityDemo {
	public static void main(String[] args) {
		University university=new University("VTU");
		University university1=new University(4);	
		University university2=new University(255000l);
		University university3=new University(4,25);
	}
}
