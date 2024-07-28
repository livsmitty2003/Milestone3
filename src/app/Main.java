package app;

import java.util.Scanner;
import java.util.Arrays;


/*Main method creates 5 prodArray (armor, weapons, health) and interacts with user to allow purchase
 * and return of prodArray, point checking, and view of updated/sorted inventory list.*/

public class Main{

	public static void main(String[] args) {
		//Define Variables
		double points;
		int item = 0;
		Product[] prodArray;
		ShoppingCart[] cartArray;
        String choice;
        int choiceID;

		//Create a line separation for formatting
		String lineSeparator = System.lineSeparator();

		//Initialize user variables/arrays
		points = 100; 
		cartArray = new ShoppingCart[7];
		prodArray = new Product[7];
			
		
		//Populate array with inventory list
		prodArray[0] = new Armor("Super Suit", "Protects wearer from all types of devestation.", 50, 6);
		prodArray[1] = new Armor("Lazy Shell", "Hide under it for absolute invisibility.", 30, 4);
		prodArray[2] = new Weapon("Frying Pan", "Slay any attacker that comes your way.", 25, 7);
		prodArray[3] = new Weapon("Punch Glove", "Knock any foe down with a triple punch.", 30, 3);
		prodArray[4] = new Health("Chicken Leg", "Enjoy a protein punch.", 20, 2);
		prodArray[5] = new Health("Spinach", "Up your vitamins with rich greens.", 20, 2);
		prodArray[6] = new Health("Elixir", "Supercharge your tired self with a powerful potion", 20, 2);
		
		//Sort prodArray by name
		Arrays.sort(prodArray);
	    
		//Initialize shopping cart
		cartArray[0] = new ShoppingCart("null", "null", 0.00);
	 	    
		//User Greeting
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome to the Game Stop. Would you like to see a list of products? 'y' for yes; 'n' for no");
		choice = obj.nextLine();
		
		//Print inventory list to screen
		if (choice.equals("y"))
		{
			int i;
			for(i=0; i<prodArray.length; i++)
			{
			   System.out.print(i+1 +". " + prodArray[i].toString() + " " + lineSeparator);
			}

			//user options
			System.out.println(lineSeparator + "Press 'p' to purchase" + lineSeparator + "Press 'c' to check credits"  + lineSeparator + "Press 'e' to exit." + lineSeparator + "Press 's' to see what's on sale.");
			choice = obj.nextLine();
			
			//print user points to screen
			if (choice.equals("c")) 
			{
				System.out.println("You have " + points + " points.");
			}
			
			if (choice.equals("s"))
			{
				System.out.println("The following items are on sale: " + lineSeparator);
				Sale(prodArray[3]);
				Sale(prodArray[4]);
			}
			
			//Allows user to purchase item from inventory list, adjusts points
			if (choice.equals("p"))
			{
				System.out.println("Enter the ID of the prodArray you wish to purchase.");
				choiceID = obj.nextInt();
				item = choiceID - 1;
				points = points - prodArray[item].price;
				prodArray[item].reduceQuantity();
				
				//add item to cart
				cartArray[0] = new ShoppingCart(prodArray[item].name, prodArray[item].description, prodArray[item].price);
				System.out.println("The following item is in your cart: " + cartArray[0].getName() + ".  You're point balance is: " + points + System.lineSeparator());
			    
				//choice: return item or keep shopping
				System.out.println("Buyer's remorse? Click 'y' to return. Click 'l' to check out the inventory");
				choice = obj.next();
					
					//Returns prodArray, adjusts points, empty's shopping cart, prints summary to screen
					if (choice.equals("y"))
					{
						prodArray[item].increaseQuantity();
						points = points + prodArray[item].price;		
						cartArray[0] = new ShoppingCart("empty", "empty", 0);
						System.out.println("You're cart is: " + cartArray[0].getName() + ".  You're point balance is: " + points + System.lineSeparator());
					}
					//Allows user to keep shopping
					if (choice.equals("l"))
					{
						//Prints updated inventory list of prodArray to screen
						for(int d = 0; d<prodArray.length; d++)
							{
								System.out.print(d+1 +". " + prodArray[d].toString() + " ");
							}
					}
			
				//User exits application. Goodbye message printed to screen
				if (choice.equals("e"))
				{
					System.out.println("Thank you for checking out our inventory. Come back soon!");
				}	
						

			}
		}
		
		//User chose to not continue shopping once inventory list was printed to screen
		else
		{
			System.out.println("Thanks for stopping in. Check in later to see what new items are in stock!");
			
		}
	
	}
	
	//Calls on the Discount Interface that holds the saleItem() method
	public static void Sale(Product saleItem) {
		saleItem.onSale(saleItem.name);
		
	}
}


	



