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
		double amount = 0.0;
		
//		The user is prompted asking for the price of the item.
		System.out.println("How much is the item? ");
		price = sc.nextDouble();
		
		
		
		
//		The user is then prompted asking how much money was tendered by the customer.
		System.out.println("How much money was tendered by the customer? ");
		amount = sc.nextDouble();
		
		
		
//		Display an appropriate message if the customer provided too little money or the exact amount.
		if(amount == price) {
			System.out.println("Thanks! Have a nice day!");
		}
		else if(amount < price) {
			System.out.println("Too short! The price is more than what you paid.");
			
		}
		
		
		
		
//		If the amount tendered is more than the cost of the item, 
//		display the number of bills and coins that should be given to the customer.
	}

}
