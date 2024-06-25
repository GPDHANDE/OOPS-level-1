package org.ContractPod.OopsL1;

public class Program7_AreaUsingMethodOverloading 
{
	public static double Area(double length,double breadth)
	{
		return length*breadth;
	}
	
	public static double Area(double length)
	{
		double a =  length*length;
		return a;
	}
	
	public static float Area(float radius)
	{
		return (float) (3.14 *radius*radius);
	}
	public static void main(String[] args) 
	{
		System.out.println("Area Of Rectangle:- "+ Area(12,10));
		System.out.println("Area Of Square:- "+ Area(12.0));
		System.out.println("Area Of Circle:- "+ Area(12));
	}

}
