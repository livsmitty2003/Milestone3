package app;

/*Creates a shopping cart that holds items added by user. */

public class ShoppingCart {
	//variable declaration
	private String name;
	private String description;
	private double price;
	
	
	//construct ShoppingCart item.
	public ShoppingCart(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	//Prints message to console, confirming item added to cart.
	public void addItem() {
		System.out.println("The following item has been added to your cart: " + this.name);
	}
	
	//Prints message to console, confirming cart is empty.
	public void emptyCart() {
		System.out.println("Your cart is empty.");
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() 
	{
		String listItem = this.name;
		return listItem; 
	}
}
