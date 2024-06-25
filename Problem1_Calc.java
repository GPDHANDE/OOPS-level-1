package org.ContractPod.OopsL1;
import java.util.*;
public class Problem1_Calc 
{
	public static double input(Scanner sc,String prompt)
	{
		System.out.println(prompt);
		return sc.nextDouble();
	}
    
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double num1 = input(sc, "Enter the First Number");
		double num2 = input(sc, "Enter the second Number");
		
		System.out.println(add(num1,num2));
	}

}
