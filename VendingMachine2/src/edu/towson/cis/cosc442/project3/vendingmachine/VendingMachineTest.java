/**
 * 
 */
package edu.towson.cis.cosc442.project3.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.towson.cis.cosc442.project3.vendingmachine.VendingMachine;
import edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineItem;

/**
 * @author richieAwojoodu
 *
 */
public class VendingMachineTest {

	public VendingMachine richies;
	public VendingMachineItem chips;
	public VendingMachineItem popcorn;
	public VendingMachineItem gum;
	public VendingMachineItem soda;
	public VendingMachineItem candy;
	
	/**
	 * @throws java.lang.Exception
	 * Set Up function
	 */
	@Before
	public void setUp() throws Exception {
		richies = new VendingMachine();
		chips = new VendingMachineItem("Tortilla Chips",1.00);
		popcorn = new VendingMachineItem("Popcorn",3.00);
		gum = new VendingMachineItem("Gum",0.75);
		soda = new VendingMachineItem("Soda",1.50);
		candy  = new VendingMachineItem("Candy",2.00);
	}


	/**
	 * Test method for VendingMachine addItem
	 */
	@Test
	public void testAddItem() {
	   //Chips taking the position of A and being checked right after
		richies.addItem(chips, "A");
		assertEquals(chips, richies.getItem("A"));
		
	   //Popcorn taking the position of B and being checked right after
		richies.addItem(popcorn, "B");
		assertEquals(popcorn, richies.getItem("B"));
		
	   //Gum taking the position of C and being checked right after
		richies.addItem(gum, "C");
		assertEquals(gum, richies.getItem("C"));
	
	   //Soda taking the position of D and being checked right after
		richies.addItem(soda, "D");
		assertEquals(soda, richies.getItem("D"));
	}

	/**
	 * Test method for VendingMachine returnChange
	 */
	@Test
	public void testReturnChange() {
		assertEquals(0.00,richies.returnChange(),0.0);
	}

	/**
	 * Test method for VendingMachine removeItem
	 */
	@Test
	public void testRemoveItem() { 
		testAddItem();
	   //Chips taking the position of A and being checked right after
		richies.removeItem("A");
		assertNull(richies.getItem("A"));
		
	   //Popcorn taking the position of B and being checked right after
		richies.removeItem("B");
		assertNull(richies.getItem("B"));
		
	   //Gum taking the position of C and being checked right after
		richies.removeItem("C");
		assertNull(richies.getItem("C"));
	
	   //Soda taking the position of D and being checked right after
		richies.removeItem("D");
		assertNull(richies.getItem("D"));
	}

	/**
	 * Test method for VendingMachine insertMoney
	 */
	@Test
	public void testInsertMoney() {
		//This is the test for the case of a negative amount input 
//		richies.insertMoney(-1);
//		assertEquals("Invalid amount.  Amount must be >= 0" , );
//		richies.returnChange();
		
		//This is the test for 0 amount inputs
		richies.insertMoney(0);
		assertNotNull(richies.balance);
		
		//This is the test for an amount greater than 0
		richies.insertMoney(5);
		assertNotNull(richies.balance);
	}

	/**
	 * Test method for VendingMachine getBalance
	 */
	@Test
	public void testGetBalance() {
		//This is the test for an amount greater than 0
		richies.insertMoney(15);
		assertNotNull(richies.getBalance());
	}

	/**
	 * Test method for VendingMachine makePurchase
	 */
	@Test
	public void testMakePurchase() {
		testAddItem();
		richies.insertMoney(15);
//		assertEquals(soda, richies.getItem("D"));
		assertEquals(true, richies.makePurchase("A"));
		assertEquals(true, richies.makePurchase("B"));
		assertEquals(true, richies.makePurchase("C"));
		richies.removeItem("D");
		assertEquals(false, richies.makePurchase("D"));
		richies.addItem(soda, "D");
		richies.returnChange();
		assertEquals(false, richies.makePurchase("D"));
	}

	
	/**
	 * @throws java.lang.Exception
	 * Tear Down Function
	 */
	@After
	public void tearDown() throws Exception {
		richies = null;
	}
}
