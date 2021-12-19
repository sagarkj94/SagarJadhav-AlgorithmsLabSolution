package com.paymoney.main;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int transactionSize=sc.nextInt();
		int transactions[]=new int[transactionSize];
		System.out.println("Enter the values of array");
		for(int i=0;i<transactionSize;i++)
			transactions[i]=sc.nextInt();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int target=sc.nextInt();
		for(int i=0;i<target;i++)
		{
			System.out.println("Enter the value of target");
			int targetValue=sc.nextInt();
			checkTransaction(targetValue,transactions,transactionSize);
		}
		sc.close();
	}
	private static void checkTransaction(int targetValue,int[] arr,int size)
	{
		int compareTran=0;
		int i,flag=0;
		for(i=0;i<size;i++)
		{
				compareTran=compareTran+arr[i];
				if(compareTran >= targetValue)
				{
					System.out.println("Target achieved after "+(i+1)+" transactions");
					flag=1;
					break;
				}
				
		}
		if(flag==0)
			System.out.println("Given target is not achieved");
	}
}
