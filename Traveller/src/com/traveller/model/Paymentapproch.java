package com.traveller.model;

import com.traveller.sortdenomination.Mergesort;

public class Paymentapproch {
	static int amt=0;
	public void paymentApproch(int amount, int[] denominations, int curDenominations) {
		// TODO Auto-generated method stub
		Mergesort mg=new Mergesort();
		 mg.sort(denominations, 0, curDenominations - 1);
		 int[] counter = new int[curDenominations];
		try {
		 for (int i = curDenominations-1; i >= 0; i--) {
	            if (amount >= denominations[i]) {
	            	counter[i] = amount / denominations[i];
	                amount = amount - counter[i] * denominations[i];
	            }
	        }
		 if(amount>0)
		 {
			 System.out.println("Exact amount cannot be given with highest denomination");
		 }
		 else
		 {
		 System.out.println("Your payment approach in order to give min no of notes will be");
		 for (int i = curDenominations-1; i >= 0; i--){
	            if (counter[i] != 0) {
	                System.out.println(denominations[i] + " : "
	                    + counter[i]);
	            }
	        }
		 }
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Please enter correct amount or denomination"+ex);
		}
		
	}
}
