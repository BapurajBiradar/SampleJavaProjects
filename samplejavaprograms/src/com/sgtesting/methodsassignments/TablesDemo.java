package com.sgtesting.methodsassignments;
//Tables from 1 to 20
class Tables
{
	void table()
	{
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("-----------");
		}
	}
}
public class TablesDemo {
	public static void main(String[] args) {
		Tables tab=new Tables();
		tab.table();
	}
}
