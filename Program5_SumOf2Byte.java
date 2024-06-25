package org.ContractPod.OopsL1;

import java.util.Scanner;

public class Program5_SumOf2Byte {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		byte b1 = sc.nextByte();
		byte b2 = sc.nextByte();
		int num1= (int)b1;
		int num2 = (int)b2;
		int result = num1 + num2;
		System.out.println("addtion of 2 no's after Typecasting is "+result);
		
	}

}
