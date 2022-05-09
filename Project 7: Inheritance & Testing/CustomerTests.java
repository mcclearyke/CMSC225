import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerTests {

	@Test
	public void InstanceVariablesTest() {
		Customer testCustomer = new Customer();
		@SuppressWarnings("rawtypes")
		Class c = testCustomer.getClass();
		try {
			c.getDeclaredField("lastName");
			c.getDeclaredField("firstName");
			c.getDeclaredField("phone");
			c.getDeclaredField("email");
			c.getDeclaredField("streetAddress");
			c.getDeclaredField("numPizzas");
			c.getDeclaredField("pizzas");

			assertEquals(
					"You must only have the instance variables specified in the lab manual. When looking at the number of instance variables we",
					7, c.getDeclaredFields().length);

			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("lastName").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("firstName").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("phone").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("email").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("streetAddress").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("numPizzas").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("pizzas").getModifiers()));

			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("lastName").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("firstName").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("phone").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("email").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("streetAddress").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("numPizzas").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("pizzas").getModifiers()));

			assertEquals("You must make your lastName instance variable of type String.", (String.class),
					c.getDeclaredField("lastName").getType());
			assertEquals("You must make your firstName instance variable of type String.", (String.class),
					c.getDeclaredField("firstName").getType());
			assertEquals("You must make your phone instance variable of type String.", (String.class),
					c.getDeclaredField("phone").getType());
			assertEquals("You must make your email instance variable of type String.", (String.class),
					c.getDeclaredField("email").getType());
			assertEquals("You must make your streetAddress instance variable of type String.", (String.class),
					c.getDeclaredField("streetAddress").getType());
			assertEquals("You must make your numPizzas instance variable of type int.", (int.class),
					c.getDeclaredField("numPizzas").getType());
			assertEquals("You must make your pizzas instance variable of type ArrayList.", (ArrayList.class),
					c.getDeclaredField("pizzas").getType());

		} catch (NoSuchFieldException e) {
			fail("Could not find the " + e.getLocalizedMessage().toString() + " instance variable");
		} catch (Exception e) {
			fail("Something weird went wrong");
		}
	}

	@Test
	public void DefaultConstructor() {
		Customer testCustomer = new Customer();
		@SuppressWarnings("rawtypes")
		Class c = testCustomer.getClass();
		try {

			Field lastName = c.getDeclaredField("lastName");
			Field firstName = c.getDeclaredField("firstName");
			Field phone = c.getDeclaredField("phone");
			Field email = c.getDeclaredField("email");
			Field streetAddress = c.getDeclaredField("streetAddress");
			Field numPizzas = c.getDeclaredField("numPizzas");
			Field pizzas = c.getDeclaredField("pizzas");
			
			lastName.setAccessible(true);
			firstName.setAccessible(true);
			phone.setAccessible(true);
			email.setAccessible(true);
			streetAddress.setAccessible(true);
			numPizzas.setAccessible(true);
			pizzas.setAccessible(true);
			
			String lastNameValue = (String) lastName.get(testCustomer);
			assertEquals("When checking the value of lastName we",null, lastNameValue);
			
			String firstNameValue = (String) firstName.get(testCustomer);
			assertEquals("When checking the value of firstName we",null, firstNameValue);

			String phoneValue = (String) phone.get(testCustomer);
			assertEquals("When checking the value of phone we",null, phoneValue);
			
			String emailValue = (String) email.get(testCustomer);
			assertEquals("When checking the value of email we",null, emailValue);
			
			String streetAddressValue = (String) streetAddress.get(testCustomer);
			assertEquals("When checking the value of streetAddress we",null, streetAddressValue);
			
			int numPizzasValue = (int) numPizzas.get(testCustomer);
			assertEquals("When checking the value of numPizzas we",0, numPizzasValue);
			
			@SuppressWarnings("unchecked")
			ArrayList<Pizza> pizzasValue = (ArrayList<Pizza>) pizzas.get(testCustomer);
			
			assertEquals("When checking if the pizzas ArrayList is initalize and empty we,",true,pizzasValue.isEmpty());

		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void ParameterizedConstructor() {
		Customer testCustomer = new Customer("Otto", "Nikolaus", "221-555-1876", "otto.nikolaus@daimler.com");
		@SuppressWarnings("rawtypes")
		Class c = testCustomer.getClass();
		try {

			Field lastName = c.getDeclaredField("lastName");
			Field firstName = c.getDeclaredField("firstName");
			Field phone = c.getDeclaredField("phone");
			Field email = c.getDeclaredField("email");
			Field streetAddress = c.getDeclaredField("streetAddress");
			Field numPizzas = c.getDeclaredField("numPizzas");
			Field pizzas = c.getDeclaredField("pizzas");
			
			lastName.setAccessible(true);
			firstName.setAccessible(true);
			phone.setAccessible(true);
			email.setAccessible(true);
			streetAddress.setAccessible(true);
			numPizzas.setAccessible(true);
			pizzas.setAccessible(true);
			
			String lastNameValue = (String) lastName.get(testCustomer);
			assertEquals("When checking the value of lastName we","Otto", lastNameValue);
			
			String firstNameValue = (String) firstName.get(testCustomer);
			assertEquals("When checking the value of firstName we","Nikolaus", firstNameValue);

			String phoneValue = (String) phone.get(testCustomer);
			assertEquals("When checking the value of phone we","221-555-1876", phoneValue);
			
			String emailValue = (String) email.get(testCustomer);
			assertEquals("When checking the value of email we","otto.nikolaus@daimler.com", emailValue);
			
			String streetAddressValue = (String) streetAddress.get(testCustomer);
			assertEquals("When checking the value of streetAddress we",null, streetAddressValue);
			
			int numPizzasValue = (int) numPizzas.get(testCustomer);
			assertEquals("When checking the value of numPizzas we",0, numPizzasValue);
			
			@SuppressWarnings("unchecked")
			ArrayList<Pizza> pizzasValue = (ArrayList<Pizza>) pizzas.get(testCustomer);
			assertEquals("When checking if the pizzas ArrayList is initalize and empty we,",true,pizzasValue.isEmpty());

		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void getLastNameTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		assertEquals("When calling the Customer object's getLastName method, we", "Ford",
				customCustomer.getLastName());
	}
	
	@Test
	public void getFirstNameTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		assertEquals("When calling the Customer object's getFirstName method, we", "Henry",
				customCustomer.getFirstName());
	}
	
	@Test
	public void getPhoneTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		assertEquals("When calling the Customer object's getPhone method, we", "313-555-1908",
				customCustomer.getPhone());
	}
	
	@Test
	public void getEmailTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		assertEquals("When calling the Customer object's getEmail method, we", "ford.henry@ford.com",
				customCustomer.getEmail());
	}
	
	@Test
	public void getStreetAddressTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		assertEquals("When calling the Customer object's getOtherLastName method, we", "213 Elm Street",
				customCustomer.getStreetAddress());
	}
	
	@Test
	public void getNumPizzasTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		assertEquals("When calling the Customer object's getNumCars method, we", 0,
				customCustomer.getNumPizzas());
	}
	
	@Test
	public void getCars() {
		ArrayList<Pizza> thesePizzas = new ArrayList<Pizza>();
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,thesePizzas);
		assertEquals("When calling the Customer object's getCars method, we", thesePizzas,
				customCustomer.getPizzas());
	}

	@Test
	public void setLastNameTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		customCustomer.setLastName("Musk");
		@SuppressWarnings("rawtypes")
		Class c = customCustomer.getClass();
		try {
			Field lastName = c.getDeclaredField("lastName");
			lastName.setAccessible(true);
			String lastNameValue = (String) lastName.get(customCustomer);
			assertEquals("After calling Customer's setLastName method, for the value of lastName we", "Musk", lastNameValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setFirstNameTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		customCustomer.setFirstName("Elon");
		@SuppressWarnings("rawtypes")
		Class c = customCustomer.getClass();
		try {
			Field firstName = c.getDeclaredField("firstName");
			firstName.setAccessible(true);
			String firstNameValue = (String) firstName.get(customCustomer);
			assertEquals("After calling Customer's setFirstName method, for the value of firstName we", "Elon", firstNameValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setPhoneTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		customCustomer.setPhone("310-555-2003");
		@SuppressWarnings("rawtypes")
		Class c = customCustomer.getClass();
		try {
			Field phone = c.getDeclaredField("phone");
			phone.setAccessible(true);
			String phoneValue = (String) phone.get(customCustomer);
			assertEquals("After calling Customer's setPhone method, for the value of phone we", "310-555-2003", phoneValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setEmailTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		customCustomer.setEmail("musk.elon@tesla.com");;
		@SuppressWarnings("rawtypes")
		Class c = customCustomer.getClass();
		try {
			Field email = c.getDeclaredField("email");
			email.setAccessible(true);
			String emailValue = (String) email.get(customCustomer);
			assertEquals("After calling Customer's setEmail method, for the value of email we", "musk.elon@tesla.com", emailValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setStreetAddressTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		customCustomer.setStreetAddress("65 West Avenue");;
		@SuppressWarnings("rawtypes")
		Class c = customCustomer.getClass();
		try {
			Field streetAddress = c.getDeclaredField("streetAddress");
			streetAddress.setAccessible(true);
			String streetAddressValue = (String) streetAddress.get(customCustomer);
			assertEquals("After calling Customer's setStreetAddress method, for the value of streetAddress we", "65 West Avenue", streetAddressValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void toStringNoPizzasTest() {
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,new ArrayList<Pizza>());
		String result = customCustomer.toString();
		String expected = "Henry Ford\n" + 
				"313-555-1908\n" + 
				"ford.henry@ford.com\n" +
				"213 Elm Street\n";
		assertEquals(expected,result);
		
	}
	
	@Test
	public void toStringWithPizzasTest() {
		ArrayList<Pizza> thesePizzas = new ArrayList<Pizza>();
		Pizza testPizza = new Pizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		Pizza anotherTestPizza = new Pizza(Size.PERSONAL,Sauce.GARLIC_PARMESAN,Crust.THIN,Cheese.EXTRA,MeatTopping.ITALIAN_SAUSAGE,VeggieTopping.GREEN_PEPPERS);
		thesePizzas.add(testPizza);thesePizzas.add(anotherTestPizza);
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",2,thesePizzas);
		String result = customCustomer.toString();
		String expected = "Henry Ford\n" +  
				"313-555-1908\n" + 
				"ford.henry@ford.com\n" +
				"213 Elm Street\n" +
				"Pizza List:\n" + 
				"\tEXTRA_LARGE\n" + 
				"\tALFREDO\n" + 
				"\tHAND_TOSSED\n" + 
				"\tREGULAR\n" + 
				"\tBEEF\n" + 
				"\tSPINACH\n" + 
				"\n" +
				"\tPERSONAL\n" + 
				"\tGARLIC_PARMESAN\n" + 
				"\tTHIN\n" + 
				"\tEXTRA\n" + 
				"\tITALIAN_SAUSAGE\n" + 
				"\tGREEN_PEPPERS\n\n";
		assertEquals(expected,result);
		
	}

	@Test
	public void orderPizzaTest() {
		ArrayList<Pizza> thesePizzas = new ArrayList<Pizza>();
		Pizza testPizza = new Pizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,thesePizzas);
		customCustomer.orderPizza(testPizza);
		@SuppressWarnings("rawtypes")
		Class c = customCustomer.getClass();
		try {
			Field pizzas = c.getDeclaredField("pizzas");
			pizzas.setAccessible(true);
			@SuppressWarnings("unchecked")
			ArrayList<Pizza> pizzasValue = (ArrayList<Pizza>) pizzas.get(customCustomer);
			Field numPizzas = c.getDeclaredField("numPizzas");
			numPizzas.setAccessible(true);
			int numPizzasValue = (int) numPizzas.get(customCustomer);
			assertEquals("After calling Customer's orderPizza method a single time, for the value of numPizzas we", 1, numPizzasValue);
			assertEquals("After calling Customer's orderPizza method a single time, for the value of pizzas.size() we", 1, pizzasValue.size());
			assertEquals("After calling Customer's orderPizza method a single time, for the value of pizzas.get(0) we", testPizza, pizzasValue.get(0));
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void getPizzasTest() {
		ArrayList<Pizza> thesePizzas = new ArrayList<Pizza>();
		Pizza testPizza = new Pizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		Pizza anotherTestPizza = new Pizza(Size.PERSONAL,Sauce.GARLIC_PARMESAN,Crust.THIN,Cheese.EXTRA,MeatTopping.ITALIAN_SAUSAGE,VeggieTopping.GREEN_PEPPERS);
		Customer customCustomer = createCustomer("Ford","Henry","313-555-1908","ford.henry@ford.com","213 Elm Street",0,thesePizzas);
		customCustomer.orderPizza(testPizza);
		customCustomer.orderPizza(anotherTestPizza);
		@SuppressWarnings("rawtypes")
		Class c = customCustomer.getClass();
		try {
			Field pizzas = c.getDeclaredField("pizzas");
			pizzas.setAccessible(true);
			@SuppressWarnings("unchecked")
			ArrayList<Pizza> pizzasValue = (ArrayList<Pizza>) pizzas.get(customCustomer);
			Field numPizzas = c.getDeclaredField("numPizzas");
			numPizzas.setAccessible(true);
			int numPizzasValue = (int) numPizzas.get(customCustomer);
			assertEquals("After calling Customer's getPizzas method the value of pizzas we", customCustomer.getPizzas(), pizzasValue);
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	private Customer createCustomer(String aLastName, String aFirstName, String aPhone, String anEmail, String aStreetAddress, int aNumPizzas, ArrayList<Pizza> somePizzas) {
		Customer myCustomer = new Customer();
		@SuppressWarnings("rawtypes")
		Class c = myCustomer.getClass();
		try {
			Field lastName = c.getDeclaredField("lastName");
			Field firstName = c.getDeclaredField("firstName");
			Field phone = c.getDeclaredField("phone");
			Field email = c.getDeclaredField("email");
			Field streetAddress = c.getDeclaredField("streetAddress");
			Field numPizzas = c.getDeclaredField("numPizzas");
			Field pizzas = c.getDeclaredField("pizzas");
			
			lastName.setAccessible(true);
			firstName.setAccessible(true);
			phone.setAccessible(true);
			email.setAccessible(true);
			streetAddress.setAccessible(true);
			numPizzas.setAccessible(true);
			pizzas.setAccessible(true);
			
			lastName.set(myCustomer, aLastName);
			firstName.set(myCustomer, aFirstName);
			phone.set(myCustomer, aPhone);
			email.set(myCustomer, anEmail);
			streetAddress.set(myCustomer, aStreetAddress);
			numPizzas.set(myCustomer, aNumPizzas);
			pizzas.set(myCustomer, somePizzas);
			
		} catch (Exception e) {
			fail(e.toString());
		}
		return myCustomer;
	}
	
	
}
