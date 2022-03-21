package com.sgtesting.arrayassignments;

public class ResultantArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,4,7,8};
		int b[]= {12,14,23,35,56,79,46};
		int c[]=new int[a.length+b.length];
		System.out.println(c.length);
//		int j=0;
//		for (int i = 0; i <= a.length-1; i++) {
//			c[j]=a[i];
//			j++;
//		}
//		for (int i = 0; i <= b.length-1; i++) {
//			c[j]=b[i];
//			j++;
//		}
//		for (int k : c) 
//		{
//			System.out.println(c[k]);
//		}
	}
}
