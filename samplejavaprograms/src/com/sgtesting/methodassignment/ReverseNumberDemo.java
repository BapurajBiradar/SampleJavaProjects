package com.sgtesting.methodassignment;
class ReverseNumber
{
	int reverse(int num)
	{
		int	n=num;
		int rev=0;
		while(n>0)
		{
			int i=n%10;
			rev=(rev*10)+i;
			n=n/10;
		}
		return rev;
	}
}
public class ReverseNumberDemo {
	public static void main(String[] args) {
		ReverseNumber number=new ReverseNumber();
		int n=number.reverse(156248);
		System.out.println("The reverse number is: "+n);
	}
}
