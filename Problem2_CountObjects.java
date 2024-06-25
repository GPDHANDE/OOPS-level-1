package org.ContractPod.OopsL1;

public class Problem2_CountObjects 
{
	static int count=0;
	Problem2_CountObjects()
	{
		count++;
	}
	
	public static void main(String[] args) 
	{
		Problem2_CountObjects ref =  new Problem2_CountObjects();
		Problem2_CountObjects ref1 = new Problem2_CountObjects();
		Problem2_CountObjects ref2 = new Problem2_CountObjects();
		Problem2_CountObjects ref3 = new Problem2_CountObjects();
		//Problem2_CountObjects ref4 = new Problem2_CountObjects();
		
		System.out.println(count);
		
	}

}
