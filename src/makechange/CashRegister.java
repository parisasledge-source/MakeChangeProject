package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		
		/*
		 * In the cash register we will calculate the amount of change returned to a
		 * customer based on the purchase price and the amount tendered. We will also
		 * notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1,
		 * .25c, .10c, .05c, .01c) is needed to make the change for the customer. 
		 * Change should be provided using the largest bill and coin denominations as possible.
		 * Denominations that are not used should not be displayed.
		 */
		 
		Scanner sc = new Scanner(System.in);
		double price = 0.0;
		double amountPaid = 0.0;
		
//		The user is prompted asking for the price of the item.
		System.out.println("How much is the item? ");
		price = sc.nextDouble();
		
//		The user is then prompted asking how much money was tendered by the customer.
		System.out.println("How much money was tendered by the customer? ");
		amountPaid = sc.nextDouble();
		
//		Display an appropriate message if the customer provided the exact amount.
		if(amountPaid == price) {
			System.out.println("Thanks! Have a nice day!");
		}
//		Display an appropriate message if the customer provided too little money.
		else if(amountPaid < price) {
			System.out.println("You provided too little money. The price is more than what you paid.");	
		}
		
//		If the amount tendered is more than the cost of the item, 
		else {
			//double change = amountPaid - price;
			//System.out.println("The money that should be given to the customer is $" + change);
			
//			Call the method to calculate & display the number of bills and coins that should be given to the customer.
			calculateChange(amountPaid, price);
		}
		
		
	}

	public static void calculateChange(double amountPaid, double price) {
		
		double change = amountPaid - price;
		
		
		double divisor1 = change / 20;
		int twentyDollarBill = (int) divisor1;
		double remainer1 = change % 20;
		
		
		double divisor2 = remainer1 / 10;
		int tenDollarBill = (int) divisor2;
		double remainer2 = remainer1 % 10;
		
		
		double divisor3 = remainer2 / 5;
		int fiveDollarBill = (int) divisor3;
		double remainer3 = remainer2 % 5;
		
		
		double divisor4 = remainer3 / 1;
		int oneDollarBill = (int) divisor4;
		double remainer4 = remainer3 % 1;
		
		
		double divisor5 = remainer4 / 0.25;
		int quarter = (int) divisor5;
		double remainer5 = remainer4 % 0.25;
		
		
		double divisor6 = remainer5 / 0.1;
		int dime = (int) divisor6;
		double remainer6 = remainer5 % 0.1;
		
		
		double divisor7 = remainer6 / 0.05;
		int nickel = (int) divisor7;
		double remainer7 = remainer6 % 0.05;
		
		
		double divisor8 = remainer7 / 0.01;
		int penny = (int) divisor8 + 1;
		//double remainer8 = remainer7 % 0.01;
		
		System.out.println(twentyDollarBill + " Twenty Dollar Bill, " + tenDollarBill + " Ten Dollar Bill, " + fiveDollarBill + " Five Dollar Bill, " 
		+ oneDollarBill + " One Dollar Bill, " + quarter + " quarter, " + dime + " dime, " + nickel + " nickel, " + penny + " penny.");
		
			
	
	}

}
