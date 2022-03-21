package com.sgtesting.constructoroverloading;

class SoftwareEngineer{
	SoftwareEngineer(String designation) {
		System.out.println("Designation is:"+designation);
	}
	SoftwareEngineer(int salary){
		System.out.println("Salary is:"+salary);
	}
	SoftwareEngineer(long idno){
		System.out.println("ID Number is :"+idno);
	}
	SoftwareEngineer(String name,String company){
		System.out.println("Name: "+name+" Company name:"+company);
	}
}

public class SoftwareEngineerDemo {
	public static void main(String[] args) {
		SoftwareEngineer engineer=new SoftwareEngineer("Bapuraj","Google");
		SoftwareEngineer engineer1=new SoftwareEngineer("Tester");
		SoftwareEngineer engineer2=new SoftwareEngineer(2022000321l);
		SoftwareEngineer engineer3=new SoftwareEngineer(45000);
	}
}
