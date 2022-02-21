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
			
			//The user is prompted asking for the price of the item.
			System.out.println("How much is the item? ");
			price = sc.nextDouble();
			
			//The user is then prompted asking how much money was tendered by the customer.
			System.out.println("How much money was tendered by the customer? ");
			amountPaid = sc.nextDouble();
			
			//Display an appropriate message if the customer provided the exact amount.
			if(amountPaid == price) {
				System.out.println("Thanks! Have a nice day!");
			}
			//Display an appropriate message if the customer provided too little money.
			else if(amountPaid < price) {
				System.out.println("You provided too little money. The price is more than what you paid.");	
			}
	
			//If the amount tendered is more than the cost of the item, 
			//display the number of bills and coins that should be given to the customer.
			else 
			{
				double change = amountPaid - price;
				System.out.println("The money that should be given to the customer is $" + (Math.round (change * 100)) / 100.00);
				System.out.println("=======================================================");
				
				
				//Call the method to calculate & display the number of bills and coins that should be given to the customer.
				calculateChange(amountPaid, price);
			}
	
		}
	
		public static void calculateChange(double amountPaid, double price) {
	
			double change = amountPaid - price;
			
			String twentyDisplay = "";
			String tenDisplay = "";
			String fiveDisplay = "";
			String oneDisplay = "";
			String quarterDisplay = "";
			String dimeDisplay = "";
			String nickleDisplay = "";
			String pennyDisplay = "";
	
			double divisor1 = (Math.round (change / 20 * 100)) / 100.00;
			int twentyDollarBill = (int) divisor1;
			double remainer1 = (Math.round (change % 20 * 100)) / 100.00;
			
			if (twentyDollarBill == 0) {
					twentyDisplay = "";
			}else {
				twentyDisplay = twentyDollarBill + " twenty Dollar Bill, ";
			}
				
			double divisor2 = (Math.round (remainer1 / 10 * 100)) / 100.00;
			int tenDollarBill = (int) divisor2;
			double remainer2 = (Math.round (remainer1 % 10 * 100)) / 100.00;
			
			if (tenDollarBill == 0) {
				tenDisplay = "";
			}else {
				tenDisplay = tenDollarBill + " ten dollar bill, ";
			}
	
			double divisor3 = (Math.round (remainer2 / 5 * 100)) / 100.00;
			int fiveDollarBill = (int) divisor3;
			double remainer3 = (Math.round (remainer2 % 5 * 100)) / 100.00;
			
			if (fiveDollarBill == 0) {
				fiveDisplay = "";
			}else {
				fiveDisplay = fiveDollarBill + " five dollar bill, ";
			}
	
			double divisor4 = (Math.round (remainer3 / 1 * 100)) / 100.00;
			int oneDollarBill = (int) divisor4;
			double remainer4 = (Math.round (remainer3 % 1 * 100)) / 100.00;
			
			if (oneDollarBill == 0) {
				oneDisplay = "";
			}else {
				oneDisplay = oneDollarBill + " one dollar bill, ";
			}
	
			double divisor5 = (Math.round (remainer4 / 0.25 * 100)) / 100.00;
			int quarter = (int) divisor5;
			double remainer5 = (Math.round (remainer4 % 0.25 * 100)) / 100.00;
			
			if (quarter == 0) {
				quarterDisplay = "";
			}else {
				quarterDisplay = quarter + " quarter, ";
			}
	
			double divisor6 = (Math.round (remainer5 / 0.1 * 100)) / 100.00;	
			int dime = (int) divisor6;
			double remainer6 = (Math.round (remainer5 % 0.1 * 100)) / 100.00;
			
			if (dime == 0) {
				dimeDisplay = "";
			}else {
				dimeDisplay = dime + " dime, ";
			}
	
			double divisor7 = (Math.round (remainer6 / 0.05 * 100)) / 100.00;
			int nickel = (int) divisor7;
			double remainer7 = (Math.round (remainer6 % 0.05 * 100)) / 100.00;
			
			if (nickel == 0) {
				nickleDisplay = "";
			}else {
				nickleDisplay = nickel + " nickel, ";
			}
	
			double divisor8 = (Math.round (remainer7 / 0.01 * 100)) / 100.00;
			int penny = (int) divisor8;
			double remainer8 = (Math.round (remainer7 % 0.01 * 100)) / 100.00;
			
			if (penny == 0) {
				pennyDisplay = "";
			}else {
				pennyDisplay = penny + " penny.";
			}
			
	
			System.out.println(twentyDisplay + tenDisplay + fiveDisplay 
					+ oneDisplay + quarterDisplay + dimeDisplay + nickleDisplay + pennyDisplay);
					
	}
}