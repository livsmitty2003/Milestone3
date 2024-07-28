package app;

/*
 * The Weapon class is an extension of the product class and implements the Discount interface.
 */
public class Weapon extends Product implements Discount{

	//Constructs a weapon product
	public Weapon(String name, String description, double price, int quantity) {
		super(name, description, price, quantity);
	
	}
	public void onSale(String i) {
		//OnSale method prints discounted items to screen.
		System.out.println(i + lineSeparator);
	}
	
}


