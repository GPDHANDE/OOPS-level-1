package org.ContractPod.OopsL1;
import java.util.*;
public class Problem4_NestingOfMethod 
{
	//volume= length × breadth × height.
	//Area = length × breadth
	//perimeter = 2(length*breadth)
	double length;
	double breadth;
	double height;
	
	public void  area(double length,double breadth)
	{
		System.out.println("Area of rectangle is "+ length*breadth);
		perimeter(length,breadth);
	}
	
	public void perimeter(double length,double breadth)
	{
		System.out.println("Perimeter of Rectangle is "+ 2*(length*breadth));
	}
	
	public void volume(double length, double breadth, double height)
	{
		double volume = length * breadth * height;
		System.out.println("Volume of Rectangle " + volume);
		area(length, breadth);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length, breadth and height");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		double height = sc.nextDouble();
		
		Problem4_NestingOfMethod ref = new Problem4_NestingOfMethod();
		ref.volume(length, breadth, height);
		sc.close();
		
	}

}
