import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PizzaTests {

	@Test
	public void InstanceVariablesTest() {
		Pizza testPizza = new Pizza();
		@SuppressWarnings("rawtypes")
		Class c = testPizza.getClass();
		try {
			c.getDeclaredField("size");
			c.getDeclaredField("sauce");
			c.getDeclaredField("crust");
			c.getDeclaredField("cheese");
			c.getDeclaredField("meatTopping");
			c.getDeclaredField("veggieTopping");

			assertEquals(
					"You must only have the instance variables and constants specified in the lab manual. When looking at the number of instance variables we",
					6, c.getDeclaredFields().length);

			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("size").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("sauce").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("crust").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("cheese").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("meatTopping").getModifiers()));
			assertEquals("You must make your instance variables private.", true,
					Modifier.isPrivate(c.getDeclaredField("veggieTopping").getModifiers()));


			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("size").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("sauce").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("crust").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("cheese").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("meatTopping").getModifiers()));
			assertEquals("Your instance variables must NOT be static.", false,
					Modifier.isStatic(c.getDeclaredField("veggieTopping").getModifiers()));

			assertEquals("You must make your name instance variable of type Size.", (Size.class),
					c.getDeclaredField("size").getType());
			assertEquals("You must make your name instance variable of type Sauce.", (Sauce.class),
					c.getDeclaredField("sauce").getType());
			assertEquals("You must make your name instance variable of type Crust.", (Crust.class),
					c.getDeclaredField("crust").getType());
			assertEquals("You must make your name instance variable of type Cheese.", (Cheese.class),
					c.getDeclaredField("cheese").getType());
			assertEquals("You must make your name instance variable of type MeatTopping.", (MeatTopping.class),
					c.getDeclaredField("meatTopping").getType());
			assertEquals("You must make your name instance variable of type VeggieTopping.", (VeggieTopping.class),
					c.getDeclaredField("veggieTopping").getType());
			
		} catch (NoSuchFieldException e) {
			fail("Could not find the " + e.getLocalizedMessage().toString() + " instance variable");
		} catch (Exception e) {
			fail("Something weird went wrong");
		}
	}

	@Test
	public void DefaultConstructor() {
		Pizza testPizza = new Pizza();
		@SuppressWarnings("rawtypes")
		Class c = testPizza.getClass();
		try {

			Field size = c.getDeclaredField("size");
			Field sauce = c.getDeclaredField("sauce");
			Field crust = c.getDeclaredField("crust");
			Field cheese = c.getDeclaredField("cheese");
			Field meatTopping = c.getDeclaredField("meatTopping");
			Field veggieTopping = c.getDeclaredField("veggieTopping");
			
			size.setAccessible(true);
			sauce.setAccessible(true);
			crust.setAccessible(true);
			cheese.setAccessible(true);
			meatTopping.setAccessible(true);
			veggieTopping.setAccessible(true);
			
			Size sizeValue = (Size) size.get(testPizza);
			assertEquals("When checking the value of size we",Size.PERSONAL, sizeValue);
			
			Sauce sauceValue = (Sauce) sauce.get(testPizza);
			assertEquals("When checking the value of sauce we",Sauce.MARINARA, sauceValue);
			
			Crust crustValue = (Crust) crust.get(testPizza);
			assertEquals("When checking the value of crust we",Crust.THIN, crustValue);
			
			Cheese cheeseValue = (Cheese) cheese.get(testPizza);
			assertEquals("When checking the value of cheese we",Cheese.REGULAR, cheeseValue);
			
			MeatTopping meatToppingValue = (MeatTopping) meatTopping.get(testPizza);
			assertEquals("When checking the value of meatTopping we",MeatTopping.NULL, meatToppingValue);
			
			VeggieTopping veggieToppingValue = (VeggieTopping) veggieTopping.get(testPizza);
			assertEquals("When checking the value of meatTopping we",VeggieTopping.NULL, veggieToppingValue);

		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void ParameterizedConstructor() {
		Pizza testPizza = new Pizza(Size.MEDIUM,Sauce.GARLIC_PARMESAN,Crust.PAN,Cheese.EXTRA,MeatTopping.BACON, VeggieTopping.ONIONS);
		@SuppressWarnings("rawtypes")
		Class c = testPizza.getClass();
		try {

			Field size = c.getDeclaredField("size");
			Field sauce = c.getDeclaredField("sauce");
			Field crust = c.getDeclaredField("crust");
			Field cheese = c.getDeclaredField("cheese");
			Field meatTopping = c.getDeclaredField("meatTopping");
			Field veggieTopping = c.getDeclaredField("veggieTopping");
			
			size.setAccessible(true);
			sauce.setAccessible(true);
			crust.setAccessible(true);
			cheese.setAccessible(true);
			meatTopping.setAccessible(true);
			veggieTopping.setAccessible(true);
			
			Size sizeValue = (Size) size.get(testPizza);
			assertEquals("When checking the value of size we",Size.MEDIUM, sizeValue);
			
			Sauce sauceValue = (Sauce) sauce.get(testPizza);
			assertEquals("When checking the value of sauce we",Sauce.GARLIC_PARMESAN, sauceValue);
			
			Crust crustValue = (Crust) crust.get(testPizza);
			assertEquals("When checking the value of crust we",Crust.PAN, crustValue);
			
			Cheese cheeseValue = (Cheese) cheese.get(testPizza);
			assertEquals("When checking the value of cheese we",Cheese.EXTRA, cheeseValue);
			
			MeatTopping meatToppingValue = (MeatTopping) meatTopping.get(testPizza);
			assertEquals("When checking the value of meatTopping we",MeatTopping.BACON, meatToppingValue);
			
			VeggieTopping veggieToppingValue = (VeggieTopping) veggieTopping.get(testPizza);
			assertEquals("When checking the value of veggieTopping we",VeggieTopping.ONIONS, veggieToppingValue);

		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void getSizeTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		assertEquals("When calling the Pizza object's getSize method, we", Size.EXTRA_LARGE,
				customPizza.getSize());
	}
	
	@Test
	public void getSauceTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		assertEquals("When calling the Pizza object's getSauce method, we", Sauce.ALFREDO,
				customPizza.getSauce());
	}
	
	@Test
	public void getCrustTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		assertEquals("When calling the Pizza object's getCrust method, we", Crust.HAND_TOSSED,
				customPizza.getCrust());
	}
	
	@Test
	public void getCheeseTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		assertEquals("When calling the Pizza object's getCheese method, we", Cheese.REGULAR,
				customPizza.getCheese());
	}
	
	@Test
	public void getMeatToppingTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		assertEquals("When calling the Pizza object's getMeatTopping method, we", MeatTopping.BEEF,
				customPizza.getMeatTopping());
	}
	
	@Test
	public void getVeggieToppingTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		assertEquals("When calling the Pizza object's getVeggieTopping method, we", VeggieTopping.SPINACH,
				customPizza.getVeggieTopping());
	}
	
	@Test
	public void setSizeTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		customPizza.setSize(Size.LARGE);
		@SuppressWarnings("rawtypes")
		Class c = customPizza.getClass();
		try {
			Field size = c.getDeclaredField("size");
			size.setAccessible(true);
			Size sizeValue = (Size) size.get(customPizza);
			assertEquals("After calling Pizza objects's setSize method, for the value of size we", Size.LARGE, sizeValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setSauceTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		customPizza.setSauce(Sauce.MARINARA);
		@SuppressWarnings("rawtypes")
		Class c = customPizza.getClass();
		try {
			Field sauce = c.getDeclaredField("sauce");
			sauce.setAccessible(true);
			Sauce sauceValue = (Sauce) sauce.get(customPizza);
			assertEquals("After calling Pizza objects's setSauce method, for the value of sauce we", Sauce.MARINARA, sauceValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setCrustTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		customPizza.setCrust(Crust.THIN);
		@SuppressWarnings("rawtypes")
		Class c = customPizza.getClass();
		try {
			Field crust = c.getDeclaredField("crust");
			crust.setAccessible(true);
			Crust crustValue = (Crust) crust.get(customPizza);
			assertEquals("After calling Pizza objects's setCrust method, for the value of crust we", Crust.THIN, crustValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setCheeseTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		customPizza.setCheese(Cheese.EXTRA);
		@SuppressWarnings("rawtypes")
		Class c = customPizza.getClass();
		try {
			Field cheese = c.getDeclaredField("cheese");
			cheese.setAccessible(true);
			Cheese cheeseValue = (Cheese) cheese.get(customPizza);
			assertEquals("After calling Pizza objects's setCheese method, for the value of cheese we", Cheese.EXTRA, cheeseValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setMeatToppingTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		customPizza.setMeatTopping(MeatTopping.HAM);
		@SuppressWarnings("rawtypes")
		Class c = customPizza.getClass();
		try {
			Field meatTopping = c.getDeclaredField("meatTopping");
			meatTopping.setAccessible(true);
			MeatTopping meatToppingValue = (MeatTopping) meatTopping.get(customPizza);
			assertEquals("After calling Pizza objects's setMeatTopping method, for the value of meatTopping we", MeatTopping.HAM, meatToppingValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void setVeggieToppingTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		customPizza.setVeggieTopping(VeggieTopping.MUSHROOMS);
		@SuppressWarnings("rawtypes")
		Class c = customPizza.getClass();
		try {
			Field veggieTopping = c.getDeclaredField("veggieTopping");
			veggieTopping.setAccessible(true);
			VeggieTopping veggieToppingValue = (VeggieTopping) veggieTopping.get(customPizza);
			assertEquals("After calling Pizza objects's setVeggieTopping method, for the value of veggieTopping we", VeggieTopping.MUSHROOMS, veggieToppingValue);
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void toStringTest() {
		Pizza customPizza = createPizza(Size.EXTRA_LARGE,Sauce.ALFREDO,Crust.HAND_TOSSED,Cheese.REGULAR,MeatTopping.BEEF,VeggieTopping.SPINACH);
		String result = customPizza.toString();
		String expected = "\tEXTRA_LARGE\n" + 
				"\tALFREDO\n" + 
				"\tHAND_TOSSED\n" + 
				"\tREGULAR\n" + 
				"\tBEEF\n" + 
				"\tSPINACH\n\n";
		assertEquals(expected,result);
		
	}
	
	private Pizza createPizza(Size aSize, Sauce aSauce, Crust aCrust, Cheese aCheese, MeatTopping aMeatTopping, VeggieTopping aVeggieTopping) {
		Pizza myPizza = new Pizza();
		@SuppressWarnings("rawtypes")
		Class c = myPizza.getClass();
		try {
			Field size = c.getDeclaredField("size");
			Field sauce = c.getDeclaredField("sauce");
			Field crust = c.getDeclaredField("crust");
			Field cheese = c.getDeclaredField("cheese");
			Field meatTopping = c.getDeclaredField("meatTopping");
			Field veggieTopping = c.getDeclaredField("veggieTopping");
			
			size.setAccessible(true);
			sauce.setAccessible(true);
			crust.setAccessible(true);
			cheese.setAccessible(true);
			meatTopping.setAccessible(true);
			veggieTopping.setAccessible(true);
			
			size.set(myPizza, aSize);
			sauce.set(myPizza, aSauce);
			crust.set(myPizza, aCrust);
			cheese.set(myPizza, aCheese);
			meatTopping.set(myPizza, aMeatTopping);
			veggieTopping.set(myPizza, aVeggieTopping);
			
		} catch (Exception e) {
			fail(e.toString());
		}
		return myPizza;
	}

}
