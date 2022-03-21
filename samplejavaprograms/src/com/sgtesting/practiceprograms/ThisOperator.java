package com.sgtesting.practiceprograms;

public class ThisOperator {
	int i=20;
	public ThisOperator() {
		int i=30;
		
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		ThisOperator operator=new ThisOperator();

	}

}
