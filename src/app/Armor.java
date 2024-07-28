package app;

/*
 * The Armor class is an extension of the product class and implements the Discount Interface.
 */
public class Armor extends Product implements Discount {

	//Constructs an armor product
	public Armor(String name, String description, double price, int quantity) 
	{
		super(name, description, price, quantity);
	}

	//OnSale method prints discounted items to screen.
	public void onSale(String i) {
		System.out.println(i + lineSeparator);
	}

}
