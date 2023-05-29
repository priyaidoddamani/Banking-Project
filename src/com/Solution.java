package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args)
	{
		System.out.println("welocme to bank");
		System.out.println("--------------------");
		Scanner sc=new Scanner(System.in);

		Bank b=new BankImpl(5000);

		while(true)
		{
			System.out.println("1:deposite\n2:withdraw\n3:checkbalance\n4:exit");
			System.out.println("enter choice");
			int choice=sc.nextInt();
			
		switch(choice)
		{
		case 1:
			System.out.println("enter amount to be despoited:");
			int amountTodeposite=sc.nextInt();
			b.deposite(amountTodeposite);			//b.deposite(sc.nextInt());
			break;
			
		case 2:
			System.out.println("enter amount to be withdraw:");
			int amountTowithdraw=sc.nextInt();
			b.withdraw(amountTowithdraw);			//b.withdraw(sc.nextInt());
			break;
			
		case 3:
			System.out.println("available balance: Rs. "+b.checkBalanace());
			break;
			
		case 4:
			System.out.println("thank you visiting");
			System.exit(0);
			
		default:
			System.out.println("invalid choice");
		}
		System.out.println("-----------");
	}
	}
}
