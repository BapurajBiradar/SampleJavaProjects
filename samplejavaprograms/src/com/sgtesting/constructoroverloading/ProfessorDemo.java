package com.sgtesting.constructoroverloading;
class Professor{
	public Professor(String name) {
		System.out.println("Name : "+name);
	}
	public Professor(String subject,String dept) {
		System.out.println("Subject : "+subject+" Department is: "+dept);
	}

	public Professor(int salary) {
		System.out.println("Salary : "+salary );
	}

	public Professor(String name,int age) {
		System.out.println("Name : "+name+" Age: "+age);
	}

}
public class ProfessorDemo {
	public static void main(String[] args) {
		Professor professor=new Professor("Santosh");
		Professor professor1=new Professor("Maths","CSE");
		Professor professor2=new Professor(40000);
		Professor professor3=new Professor("Santosh",35);
	}
}
