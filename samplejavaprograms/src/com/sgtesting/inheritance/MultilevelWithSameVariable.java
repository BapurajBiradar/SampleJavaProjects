package com.sgtesting.inheritance;
class Flowers
{
	public Flowers() 
	{
		this.show();
	}
	void show()
	{
		System.out.println("These flowers prices are");
	}
}
class Rose extends Flowers
{
	int price;
	public Rose(int p) 
	{
		this.price=p;
		this.display();
	}
	void display()
	{
		System.out.println("The price of rose is: "+price);
	}
}
class Jasmine extends Rose
{
	int price;
	public Jasmine(int q) {
		super(q);
		this.price=q;
		this.see();
	}
	void see()
	{
		System.out.println("The price of jasmine is: "+price);
	}
}
public class MultilevelWithSameVariable {
	public static void main(String[] args) {
		Jasmine obj=new Jasmine(30);
	}
}
