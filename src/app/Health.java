package app;

/*
 * The Health class is an extension of the product class and implements Discount class.
 */

public class Health extends Product implements Discount{

	//Constructs a health product
	public Health(String name, String description, double price, int quantity) {
		super(name, description, price, quantity);
	}

	public void onSale(String i) {
		//OnSale method prints discounted items to screen.
		System.out.println(i + lineSeparator);
	}
	
}
