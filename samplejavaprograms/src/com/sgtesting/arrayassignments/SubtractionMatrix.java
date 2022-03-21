package com.sgtesting.arrayassignments;

public class SubtractionMatrix {

	public static void main(String[] args) {
		int arr[][]= {{9,8,7},{6,5,4}};
		int brr[][]= {{1,2,3},{3,2,1}};

		int crr[][]=new int[arr.length][arr[0].length];

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				crr[i][j]=arr[i][j]-brr[i][j];
			}
		}
		System.out.println("substraction of matrix in sequence order");
		for(int m=0;m<crr.length;m++)
		{
			for(int n=0;n<crr[m].length;n++)
			{
				System.out.println(crr[m][n]+"  ");
			}
		}
		System.out.println("substraction of matrix in reverse order");
		for(int x=crr.length-1;x>=0;x--)
		{
			for(int y=crr[x].length-1;y>=0;y--)
			{
				System.out.println(crr[x][y]);
			}
		}

	}

}
