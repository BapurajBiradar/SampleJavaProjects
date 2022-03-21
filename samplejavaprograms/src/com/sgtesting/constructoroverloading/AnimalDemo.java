package com.sgtesting.constructoroverloading;
class Animal{
	public Animal(String name) {
	System.out.println("Name: "+name);	
	}
	public Animal(int legs) {
	System.out.println("No of legs: "+legs);
	}
	public Animal(String colour,String type) {
	System.out.println("Colour: "+colour+" Type is: "+type);
	}
	public Animal(int height,int baby) {
	System.out.println("Height animal: "+height+" No of babies: "+baby);
	}
}
public class AnimalDemo{
	public static void main(String[] args) {
	Animal animal=new Animal("Elephant");
	Animal animal1=new Animal(4);
	Animal animal2=new Animal("Black","mammal");
	Animal animal3=new Animal(8,2);

	}
}
