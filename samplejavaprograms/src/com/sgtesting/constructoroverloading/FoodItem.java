package com.sgtesting.constructoroverloading;
class Food{
	public Food(String name) {
		System.out.println("Name of food item: "+name);
	}
	public Food(int order) {
		System.out.println("No of items ordered: "+order);
	}
	public Food(String type,int pieces) {
		System.out.println("Type of food: "+type+" no of pieces: "+pieces);
	}
	public Food(int price,String size) {
		System.out.println("Price of food item: "+price+" size of food: "+size);
	}
}
public class FoodItem {
	public static void main(String[] args) {
		Food food=new Food("Pizza");
		Food food1=new Food(2);
		Food food2=new Food("Veg",4);
		Food food3=new Food(230,"Large");
	}
}
