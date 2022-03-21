package com.sgtesting.interfaces;
interface University
{
	void displayUniversityName(String name);
}
interface EnggCollege
{
	void displayEnggCollegeName(String name);
}
class College implements University,EnggCollege
{
	public void displayEnggCollegeName(String name) 
	{
		System.out.println("Engineering College Name is: "+name);
	}
	public void displayUniversityName(String name)
	{
		System.out.println("University Name is: "+name);
	}
}
public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		College clg=new College();
		clg.displayUniversityName("VTU ");
		clg.displayEnggCollegeName("VSM ");
	}
}
