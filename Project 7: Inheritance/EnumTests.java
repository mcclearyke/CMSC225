import static org.junit.Assert.*;

import org.junit.Test;

public class EnumTests {

	@Test
	public void SizeTest() {
		try {
			Size.valueOf("PERSONAL");
			Size.valueOf("MEDIUM");
			Size.valueOf("LARGE");
			Size.valueOf("EXTRA_LARGE");
		}
		catch(IllegalArgumentException e) {
			fail(e.getLocalizedMessage());
		}
		assertEquals("When looking at the number of values in the Type enum, we",4,Size.values().length);
	}
	
	@Test
	public void SauceTest() {
		try {
			Sauce.valueOf("MARINARA");
			Sauce.valueOf("GARLIC_PARMESAN");
			Sauce.valueOf("ALFREDO");	
		}
		catch(IllegalArgumentException e) {
			fail(e.getLocalizedMessage());
		}
		
		assertEquals("When looking at the number of values in the Sauce enum, we",3,Sauce.values().length);
	}
	
	@Test
	public void CrustTest() {
		try {
			Crust.valueOf("THIN");
			Crust.valueOf("HAND_TOSSED");
			Crust.valueOf("PAN");
		}
		catch(IllegalArgumentException e) {
			fail(e.getLocalizedMessage());
		}
		
		assertEquals("When looking at the number of values in the Crust enum, we",3,Crust.values().length);
	}
	
	@Test
	public void CheeseTest() {
		try {
			Cheese.valueOf("REGULAR");
			Cheese.valueOf("EXTRA");
		}
		catch(IllegalArgumentException e) {
			fail(e.getLocalizedMessage());
		}
		
		assertEquals("When looking at the number of values in the Cheese enum, we",2,Cheese.values().length);
	}
	
	@Test
	public void MeatToppingTest() {
		try {
			MeatTopping.valueOf("NULL");
			MeatTopping.valueOf("PEPPERONI");
			MeatTopping.valueOf("HAM");
			MeatTopping.valueOf("ITALIAN_SAUSAGE");
			MeatTopping.valueOf("SALAMI");
			MeatTopping.valueOf("BEEF");
			MeatTopping.valueOf("BACON");
		}
		catch(IllegalArgumentException e) {
			fail(e.getLocalizedMessage());
		}
		
		assertEquals("When looking at the number of values in the MeatTopping enum, we",7,MeatTopping.values().length);
	}

	@Test
	public void VeggieToppingTest() {
		try {
			VeggieTopping.valueOf("NULL");
			VeggieTopping.valueOf("GREEN_PEPPERS");
			VeggieTopping.valueOf("ONIONS");
			VeggieTopping.valueOf("MUSHROOMS");
			VeggieTopping.valueOf("PINEAPPLE");
			VeggieTopping.valueOf("SPINACH");
		}
		catch(IllegalArgumentException e) {
			fail(e.getLocalizedMessage());
		}
		
		assertEquals("When looking at the number of values in the VeggieTopping enum, we",6,VeggieTopping.values().length);
	}

}
