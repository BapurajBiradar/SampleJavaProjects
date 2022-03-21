package com.sgtesting.interfaces;
interface Rose
{
	void rosePrice(int price);
}
interface Lilly extends Rose
{
	void lillyPrice(int price);
}
interface Jasmine extends Lilly
{
	void jasminePrice(int price);
}
class Flowers implements Jasmine
{
	public Flowers()
	{
		System.out.println("These are prices of flowers");
	}
	public void lillyPrice(int price)
	{
		System.out.println("Price of Lilly: "+price);
	}
	public void jasminePrice(int price) 
	{
		System.out.println("Price of Jasmine: "+price);
	}
	public void rosePrice(int price) 
	{
		System.out.println("Price of Rose: "+price);
	}
}
public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		Flowers obj=new Flowers();
		obj.lillyPrice(40);
		obj.jasminePrice(30);
		obj.rosePrice(50);
	}
}
