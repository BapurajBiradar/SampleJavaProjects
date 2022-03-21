package com.sgtesting.inheritance;
class Fruits
{
	public Fruits(String colour,int price)
	{

	}
	public Fruits(int price,String colour)
	{

	}
	void friuts()
	{
		System.out.println("Details of fruits");
	}
}
class Mango extends Fruits
{
	String col;
	int pr;
	public Mango(String colour,int price)
	{
		super(colour,price);
		this.col=colour;
		this.pr=price;
	}
	public Mango(int price,String colour)
	{
		super(price,colour);
		this.pr=price;
		this.col=colour;
		this.mango();
	}
	void mango()
	{
		System.out.println("Colour of mango: "+col);
		System.out.println("price of mango: "+pr);
	}

}
class Papaya extends Fruits
{
	String col;
	int pr;
	public Papaya(String colour,int price)
	{
		super(colour,price);
		super.friuts();
		this.pr=price;
		this.col=colour;
	}
	public Papaya(int price,String colour)
	{
		super(price,colour);
		this.pr=price;
		this.col=colour;
	}
	void papaya()
	{
		System.out.println("Colour of papaya: "+col);
		System.out.println("price of papaya: "+pr);
	}
}
class Watermelon extends Papaya
{
	String col;
	int pr;
	public Watermelon(String colour,int price)
	{
		super(colour,price);
		this.pr=price;
		this.col=colour;
		this.watermelon();
	}
	public Watermelon(int price,String colour)
	{
		super(price,colour);
		this.pr=price;
		this.col=colour;
		super.papaya();
	}
	void watermelon()
	{
		System.out.println("Colour of watermelon: "+col);
		System.out.println("price of watermelon: "+pr);
	}
}
public class HybridConstructorOverloading {
	public static void main(String[] args) {
		Watermelon obj=new Watermelon("Green",30);
		Watermelon obj1=new Watermelon(40,"Greenish");
		Mango obj2=new Mango(80,"yellow");
	}
}
