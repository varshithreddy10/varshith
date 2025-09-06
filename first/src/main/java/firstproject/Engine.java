package firstproject;

import java.util.Scanner;

public class Engine 
{
	public Engine()
	{
		System.out.println("engine class contstuctor :: executed");
	}
	public int hello()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a ");
		int a =sc.nextInt();
		System.out.println("enter value of b");
		int b=sc.nextInt();
		return a+b;
	}
}
