package org.ContractPod.OopsL1;

public class Program6_MethodOverloading 
{
	public static double add(double a,double b)
	{
		return a+b;
	}
	
	public static double add(double a,double b,double c)
	{
		return a+b+c;
	}
	
	public static double add(double a,double b,double c,double d)
	{
		return a+b+c+d;
	}
	public static void main(String[] args) 
	{
		System.out.println("Add Method using 2 argument :- "+add(15,75));
		System.out.println("Add Method using 3 argument :- "+add(25,35,45));
		System.out.println("Add Method using 4 argument :- "+add(13,39,27,55));
	}

}
