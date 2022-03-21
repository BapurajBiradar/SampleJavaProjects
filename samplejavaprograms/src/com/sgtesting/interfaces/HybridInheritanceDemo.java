package com.sgtesting.interfaces;
interface GrandParents
{
	void faceColour(String colour);
}
interface Father extends GrandParents
{
	void faceColour(String colour);
}
interface Mother extends Father
{
	void faceColour(String colour);
}
class Parents implements GrandParents
{
	public void faceColour(String colour) 
	{
		System.out.println("Grand Parents Colour is: "+colour);
	}
}
class Childrens implements Mother
{
	public void faceColour(String colour) 
	{
		System.out.println("Grand Childrens Colour is Same as Parents: "+colour);
	}
}
public class HybridInheritanceDemo {
	public static void main(String[] args) {
		Parents parents=new Parents();
		parents.faceColour("Brown");
		Childrens child=new Childrens();
		child.faceColour("white");
	}
}
