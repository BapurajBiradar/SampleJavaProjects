package com.sgtesting.inheritance;
class BookShop
{
	void book(String name) 
	{
		System.out.println("Details of books available are :");
	}
}
class Notebooks extends BookShop
{
	String name;
	public Notebooks() 
	{
		super.book(name);
	}
	void book(String name)
	{
	
	}

}
class Papers extends Notebooks
{
//	public Papers()
//	{
//		super.book(name);
//	}
	void book(String name)
	{

	}
}
public class MultilevelWithSameMethod {
	public static void main(String[] args) {
		Papers obj=new Papers();
//		obj.book("King size");
//		obj.book("Exam papers");
	}
}
