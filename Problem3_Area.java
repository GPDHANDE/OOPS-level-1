package org.ContractPod.OopsL1;
import java.util.*;
class Rectangle
{
    double length;
	double breadth;
	Rectangle(double length, double breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double CalculateRectangleArea()
	{
		return length* breadth;
	}
		
}
class Triangle
{
	double base;
	double height;
	Triangle(double base, double height) 
	{
		this.base = base;
		this.height = height;
	}
	 public double CalculateTriangleArea()
	 {
		 return 0.5*base*height;
	 }
	
}
public class Problem3_Area 
{
	public static Rectangle CreateRectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle");
		double length = sc.nextDouble();
		System.out.println("Enter the Breadth of Rectangle");
		double breadth = sc.nextDouble();
		
		
		return new Rectangle(length,breadth);
	}
	
	
	public static Triangle CreateTriangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base of Triangle");
		double base = sc.nextDouble();
		System.out.println("Enter the Height of Triangle");
		double height = sc.nextDouble();
		
		return new Triangle(base,height);
	}

	public static void main(String[] args) 
	{
		Rectangle rectangle = CreateRectangle();
		System.out.println("Area of Rectangle :- "+ rectangle.CalculateRectangleArea());
		
		
		Triangle triangle = CreateTriangle();
	    System.out.println("Area of Triagle :- "+ triangle.CalculateTriangleArea());
	   
	}

}
