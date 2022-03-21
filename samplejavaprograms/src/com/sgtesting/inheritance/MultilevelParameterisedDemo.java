package com.sgtesting.inheritance;
class College
{
	String col;
	public College(String name)
	{
		this.col=name;
	}
	void college()
	{
		System.out.println("College name is: "+col);
	}
}
class Department extends College
{
	String dept;
	public Department(String name) 
	{
		super(name);
	}
	void dept() 
	{
		System.out.println("Department name is: "+dept);	
	}

}
class Student extends Department
{
	String std;
	public Student(String name) 
	{
		super(name);
	}
	void student()
	{
		System.out.println("Student name is: "+std);
	}

}
public class MultilevelParameterisedDemo {
	public static void main(String[] args) {
		Student obj=new Student("BLDE");
		obj.std="Bapuraj";
		obj.dept="Mechanical";
		obj.college();
		obj.dept();
		obj.student();
	}
}
