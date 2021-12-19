package com.traveller.driver;

import java.util.Scanner;

import com.traveller.model.Paymentapproch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int curDenominations=sc.nextInt();
		int denominations[]=new int[curDenominations];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<curDenominations;i++)
			denominations[i]=sc.nextInt();
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		Paymentapproch py=new Paymentapproch();
			py.paymentApproch(amount,denominations,curDenominations);
		sc.close();
	}
}
