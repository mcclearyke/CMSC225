/***************************
* Project 7 - Pizza Shop
****************************
* This project will use multiple classes to get a pizza order from a customer
*____________________________
* Kendall McCleary
* April 24th, 2019
* CMSC 255 Section 003
*****************************/

import java.util.ArrayList;

public class Customer {
	
	/**
	 * Declaring the instance variables to be used throughout the class
	 */
	private String lastName;
	private String firstName;
	private String phone;
	private String email;
	private String streetAddress;
	private int numPizzas;
	private ArrayList<Pizza> pizzas;
	
	/**
	* This default constructor sets the variables to their default value
	*/
	public Customer() { 
		lastName = null;
		firstName = null;
		phone = null;
		email = null;
		streetAddress = null;
		numPizzas = 0;
		pizzas = new ArrayList<Pizza>();	
	}	
	
	/**
	 * This parameterized constructor receives the values from the default constructor and sets them
	 * @param lastName
	 * @param firstName
	 * @param phone
	 * @param email
	 */
	public Customer(String lastName, String firstName, String phone, String email) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;	
		streetAddress = null;
		numPizzas = 0;
		pizzas = new ArrayList<Pizza>();	
	}
	
	/**
	 * This setter method receives the lastName and sets it to this.lastName
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	
	}
	
	/**
	 * This setter method receives the firstName and sets it to this.firstName
	 * @param lastName
	 */
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	
	}
	
	/**
	 * This setter method receives the phone value and sets it to this.phone
	 * @param phone
	 */
	public void setPhone(String phone) {
		
		this.phone = phone;
	
	}
	
	/**
	 * This setter method receives the email value and sets it to this.email
	 * @param email
	 */
	public void setEmail(String email ) {
		
		this.email = email;
	
	}
	
	/**
	 * This setter method receives the streetAddress value and sets it to this.streetAddress
	 * @param streetAddress
	 */
	public void setStreetAddress(String streetAddress) {
		
		this.streetAddress = streetAddress;
	
	}
	
	/**
	 * This getter method returns the lastName
	 * @return
	 */
	public String getLastName() {
		
		return lastName;

	}
	
	/**
	 * This getter method returns the firstName
	 * @return
	 */
	public String getFirstName() {
		
		return firstName;
	
	}
	
	/**
	 * This getter method returns phone
	 * @return
	 */
	public String getPhone() {
		
		return phone;
	
	}
	
	/**
	 * This getter method return email
	 * @return
	 */
	public String getEmail() {
		
		return email;
	
	}
	
	/**
	 * This  getter method returns the streetAddress
	 * @return
	 */
	public String getStreetAddress() {
		
		return streetAddress;
	
	}
	
	/**
	 * This method adds pizza into the array list and increments the numPizzas ordered
	 * @param pizza
	 */
	public void orderPizza(Pizza pizza) {
		
		pizzas.add(pizza); //Adding pizza into the array list
		
		numPizzas++; //Incrementing the number of pizzas ordered
	
	}
	
	/**
	 * This getter method returns the numPizzas
	 * @return
	 */
	public int getNumPizzas() {
		
		return numPizzas;
	
	}
	
	/**
	 * This getter method returns the array list pizzas
	 * @return
	 */
	public ArrayList <Pizza> getPizzas() {
		
		return pizzas;	
	
	}
	
	/**
	 * This toString method returns the customers info and pizzas ordered
	 */
	public String toString() {
		
		String customerInfo = firstName + " " + lastName + "\n" + phone + "\n" + email + "\n" + streetAddress + "\n" ;
		
		//To pass WithPizzasTest
		if (numPizzas != 0) {
	
			//To add Pizza List: after the customers info
			customerInfo = customerInfo + "Pizza List:\n";
			
				//adding the pizza in the array list to the customers info
				for (Pizza pizza : pizzas) {
					
					customerInfo += pizza;
				}
		}
		
		//To pass NoPizzasTest
		else {
			
			customerInfo = firstName + " " + lastName + "\n" + phone + "\n" + email + "\n" + streetAddress + "\n" ; //Only return customer info
		}

		return customerInfo;
	}
	
}
