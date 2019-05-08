/***************************
* Project 7 - Pizza Shop
****************************
* This project will use multiple classes and enums to get a pizza order from a customer
*____________________________
* Kendall McCleary
* April 24th, 2019
* CMSC 255 Section 003
*****************************/

public class Pizza {
	
	/**
	 * Declaring the instance variables to be used throughout the class
	 */
	private Size size;
	private Sauce sauce;
	private Crust crust;
	private Cheese cheese;
	private MeatTopping meatTopping;
	private VeggieTopping veggieTopping;
	
	/**
	 * This default constructor sets the enum variables to their default value
	 */
	public Pizza() {
		size = Size.PERSONAL;
		sauce = Sauce.MARINARA;
		crust = Crust.THIN;
		cheese = Cheese.REGULAR;
		meatTopping = MeatTopping.NULL;
		veggieTopping = VeggieTopping.NULL; 
	}
	
	/**
	 * This parameterized constructor receives the enum values from the default constructor and sets them
	 * @param size
	 * @param sauce
	 * @param crust
	 * @param cheese
	 * @param meatTopping
	 * @param veggieTopping
	 */
	public Pizza(Size size, Sauce sauce, Crust crust, Cheese cheese, MeatTopping meatTopping, VeggieTopping veggieTopping) {
		this.size = size;
		this.sauce = sauce;
		this.crust = crust;
		this.cheese = cheese;
		this.meatTopping = meatTopping;
		this.veggieTopping = veggieTopping;
	}
	

	/**
	 * This setter method receives the size and sets it to this.size
	 * @param size
	 */
	public void setSize(Size size) {
		
		this.size = size;
	
	}
	
	/**
	 * This setter method receives the sauce and sets it to this.sauce
	 * @param sauce
	 */
	public void setSauce(Sauce sauce) {
		
		this.sauce = sauce;
	
	}
	
	/**
	 * This setter method receives the crust and sets it to this.crust
	 * @param sauce
	 */
	public void setCrust(Crust crust) {
		
		this.crust = crust;
	
	}
	
	/**
	 * This setter method receives the cheese and sets it to this.cheese
	 * @param sauce
	 */
	public void setCheese(Cheese cheese) {
		
		this.cheese = cheese;
	
	}
	
	/**
	 * This setter method receives the meatTopping and sets it to this.meatTopping
	 * @param sauce
	 */
	public void setMeatTopping(MeatTopping meatTopping) {
		
		this.meatTopping = meatTopping;
	
	}
	
	/**
	 * This setter method receives the veggieTopping and sets it to this.veggieTopping
	 * @param sauce
	 */
	public void setVeggieTopping(VeggieTopping veggieTopping) {
		
		this.veggieTopping = veggieTopping;
	
	}
	
	/**
	 * This getter method returns the size
	 * @return
	 */
	public Size getSize() {
		
		return size;
	
	}
	
	/**
	 * This getter method returns the sauce
	 * @return
	 */
	public Sauce getSauce() {
		
		return sauce;
	
	}
	
	/**
	 * This getter method returns the crust
	 * @return
	 */
	public Crust getCrust() {
		
		return crust;
	
	}
	
	/**
	 * This getter method returns the cheese
	 * @return
	 */
	public Cheese getCheese() {
	
		return cheese;	
	
	}
	
	/**
	 * This getter method returns the meatTopping
	 * @return
	 */
	public MeatTopping getMeatTopping() {
		
		return meatTopping;
		
	}
	
	/**
	 * This getter method returns the veggieTopping
	 * @return
	 */
	public VeggieTopping getVeggieTopping() {
		
		return veggieTopping;
	
	} 
	
	/**
	 * This method will return the chosen pizza values
	 */
	public String toString() {
		 
		//Add string together the pizza objects with a new line and a tab between them	
		return "\t" + size + "\n" + "\t" + sauce + "\n" + "\t" + crust + "\n" + "\t" + cheese + "\n" + "\t" +  meatTopping + "\n" + "\t" + veggieTopping + "\n\n" ;
	}
}
