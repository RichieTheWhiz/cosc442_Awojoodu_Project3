package edu.towson.cis.cosc442.project3.vendingmachine;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VendingMachineTest</code> contains tests for the class <code>{@link VendingMachine}</code>.
 *
 * @generatedBy CodePro at 3/6/18 4:33 PM
 * @author richieawojoodu
 * @version $Revision: 1.0 $
 */
public class VendingMachineTest {
	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testVendingMachine_1()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the VendingMachine() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testVendingMachine_2()
		throws Exception {

		VendingMachine result = new VendingMachine();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.returnChange(), 1.0);
		assertEquals(0.0, result.getBalance(), 1.0);
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testAddItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testAddItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "A";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the void addItem(VendingMachineItem,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testAddItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		VendingMachineItem item = new VendingMachineItem("", 1.0);
		String code = "";

		fixture.addItem(item, code);

		// add additional test code here
	}

	/**
	 * Run the double getBalance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testGetBalance_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.getBalance();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testGetItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the VendingMachineItem getItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testGetItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.getItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testInsertMoney_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = 1.0;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the void insertMoney(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testInsertMoney_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		double amount = -4.9E-324;

		fixture.insertMoney(amount);

		// add additional test code here
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testMakePurchase_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = Double.MAX_VALUE;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testMakePurchase_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testMakePurchase_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean makePurchase(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testMakePurchase_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		boolean result = fixture.makePurchase(code);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VendingMachineItem removeItem(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test(expected = edu.towson.cis.cosc442.project3.vendingmachine.VendingMachineException.class)
	public void testRemoveItem_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		VendingMachineItem result = fixture.removeItem(code);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double returnChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Test
	public void testReturnChange_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;

		double result = fixture.returnChange();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}
	public VendingMachineItem chips;
	 public VendingMachineItem popcorn;
	 	public VendingMachineItem gum;
	 	public VendingMachineItem soda;
	 	public VendingMachineItem candy;
	 	public VendingMachineItem caps;
	 	
	 @Before
	 public void setUp2() throws Exception {
	  chips = new VendingMachineItem("Tortilla Chips",1.00);
	 		popcorn = new VendingMachineItem("Popcorn",3.00);
	 		gum = new VendingMachineItem("Gum",0.75);
	 	soda = new VendingMachineItem("Soda",1.50);
	 		candy  = new VendingMachineItem("Candy",2.00);
	}
	
	@Test //(expected = VendingMachineException.class)
	 public void testGetSlotIndex(){
		VendingMachine richies = new VendingMachine();
	
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

//Test the untouched cases of slot index return
	 	 richies.getItem("B");
	 	richies.getItem("C");
	 	richies.getItem("D");
	}
	
	/**
	 	 * Test method for VendingMachine AddItem exception case
	 	 */
	 	@Test(expected = VendingMachineException.class)
	 	public void testAddItemNeg(){
	 		VendingMachine richies = new VendingMachine();
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
	 		   //Candy taking the position of E and being checked right after
	 			richies.addItem(soda, "D");
	 	}
	 	
	 	@Test
	 	 public void testMakePurchase() {
	 		VendingMachine richies = new VendingMachine();
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
	 	
	 		   //Candy taking the position of E and being checked right after

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
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/6/18 4:33 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VendingMachineTest.class);
	}
}