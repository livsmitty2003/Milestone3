package app;

/* 
 * The Product class is a superclass that creates a generic product. It's constructor creates a product with an ID, 
 * name, description, price, quantity. A lineSeparator is created for formatting purposes. The toString() method
 * allows for the display of product details; the reduceQuantity() method reduces a products quantity when a purchase
 * is made; the increaseQuantity() method increases a products quantity when an item is returned.
 */
public class Product implements Comparable<Product>, Discount{
	
	//Declare Variables
	public String name;
	public String description;
	public double price;
	public int quantity;
	String lineSeparator = System.lineSeparator();

	//Construct a product
	public Product(String name, String description, double price, int quantity) 
	{
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Allows an object's details to be printed to screen
	@Override
	public String toString() 
	{
		String listItem = "Name: " + this.name + "\t" +"Description: " + this.description + "\t" + "Price: " + this.price + "\t" + "Quantity: " + this.quantity + "\t" + lineSeparator;
		return listItem; 
	}
	
	//Reduces quantity of an item, after purchase
	public void reduceQuantity() {
		this.quantity = this.quantity - 1;
	}		
	
	//Increases quantity of an item, after return
	public void increaseQuantity()
	{
		this.quantity = this.quantity + 1;
		System.out.println("The  " + this.name + " has been returned."); 
	}

	//Sort Array (ignore case)
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.name);
	}

	
	public void onSale(String i) {
		// TODO Auto-generated method stub
		System.out.println(i + lineSeparator);
	}
	
 }



	

