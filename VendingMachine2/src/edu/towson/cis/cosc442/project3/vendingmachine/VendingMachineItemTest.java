/**
 * 
 */
package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem;

/**
 * @author richieAwojoodu
 *
 */
public class VendingMachineItemTest {

	public VendingMachineItem chips;
	public VendingMachineItem popcorn;
	public VendingMachineItem gum;
	public VendingMachineItem soda;
	public VendingMachineItem candy;
	/**
	 * Instantiation of the machine items
	 */
	@Before
	public void setUp() throws Exception {
		chips = new VendingMachineItem("Tortilla Chips",1.00);
		popcorn = new VendingMachineItem("Popcorn",3.00);
		gum = new VendingMachineItem("Gum",0.75);
		soda = new VendingMachineItem("Soda",1.50);
		candy  = new VendingMachineItem("Candy",2.00);
	}

	/**
	 * Test method forVendingMachineItem class VendingMachineItem constructor
	 */
	@Test
	public void testVendingMachineItem() {
		//This is one test to see if the instantiated object will be able  
		//to have all of the elements that make it up 
		assertEquals("Soda",soda.getName());
		assertEquals(1.50 ,soda.getPrice(), .0001);
	}

	/**
	 * Test method for VendingMachineItem getName()
	 */
	@Test
	public void testGetName() {
		//This should test return the name of the item 
		assertEquals("Tortilla Chips",chips.getName());
		assertEquals("Popcorn",popcorn.getName());
		assertEquals("Gum",gum.getName());
		assertEquals("Soda",soda.getName());
		assertEquals("Candy",candy.getName());
	}

	/**
	 * Test method for VendingMachineItem getPrice()
	 */
	@Test
	public void testGetPrice() {
		//This should test return the price of the item 
		assertEquals(1.00, chips.getPrice(), .0001);
		assertEquals(3.00 , popcorn.getPrice() , .0001);
		assertEquals(0.75 , gum.getPrice() , .0001);
		assertEquals(1.50 , soda.getPrice() , .0001);
		assertEquals(2.00 , candy.getPrice() , .0001);
	}
	
	/**
	 * Tear Down function 
	 */
	@After
	public void tearDown() throws Exception {
		chips = null;
		popcorn = null;
		gum = null;
		soda = null;
		candy = null;
	}

}
