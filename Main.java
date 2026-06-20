

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    double deliveryamount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount of a customer:");
		double purchaseamount=sc.nextDouble();
		System.out.println("Are you an Amazon prime member [true/false]:");
		boolean member=sc.nextBoolean();
		if(purchaseamount>2000){
		    deliveryamount=0;
			System.out.println("Delivery charges:Free");
		}
		else{
		    if(member){
		        deliveryamount=150*0.5;
				System.out.println("Delivery charges:" + deliveryamount);
		    }
		    else{
		        deliveryamount=150;
				System.out.println("Delivery charges:" + deliveryamount);
		    }
		}
		double totalamount=purchaseamount+deliveryamount;
		System.out.println("Total amount payable:"+totalamount);
	}
}