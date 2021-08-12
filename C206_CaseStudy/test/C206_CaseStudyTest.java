import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Promotion po1;
	private Promotion po2;

	private Customer c1;
	private Customer c2;

	private ArrayList<Promotion> promotionList;
	private ArrayList<Customer> cuslist = new ArrayList<Customer>();

	// Eddy
	private Food f1;
	private Food f2;
	private ArrayList<Food> foodList;
	// Eddy
	
	private Stall_Info s1;
	private Stall_Info s2;
	private ArrayList<Stall_Info> stall = new ArrayList<Stall_Info>();


	@Before
	public void setUp() throws Exception {
		po1 = new Promotion(1, "Spaghetti", 5.00, 3.50, 6);
		po2 = new Promotion(2, "Fries", 3.00, 1.00, 6);

		promotionList = new ArrayList<Promotion>();

		// Eddy
		f1 = new Food(1, "Chicken Rice", 3.5);
		f2 = new Food(2, "Chicken Chop", 5.5);
		foodList = new ArrayList<Food>();
		// Eddy

		c1 = new Customer(3, "Chicken Rice", 2.5, 1, 5.0, 2);
		c2 = new Customer(2, "teriyaki set", 5.0, 1, 5.0, 1);

		promotionList = new ArrayList<Promotion>();
		
		//Stall
		s1 = new Stall_Info(1, "Chinese Food", "06-09-2021", "tasty");
		s2 = new Stall_Info(2, "Malay Food", "06-09-2021", "yummy");
		stall = new ArrayList<Stall_Info>();

	}

	@After
	public void tearDown() throws Exception {
		po1 = null;
		po2 = null;
		promotionList = null;

		c1 = null;
		c2 = null;
		cuslist = null;

		// Eddy
		f1 = null;
		f2 = null;
		foodList = null;
		// Eddy
		
		//stall
		s1 = null;
		s2 = null;
		stall = null;

	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}
	
	@Test
	public void testAddStall() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is stall arraylist to add to", stall);

		// Given an empty list, after adding 1 stall, the size of the list is 1
		C206_CaseStudy.addStall(stall, s1);
		assertEquals("Test if that stall arraylist size is 1?", 1, stall.size());

		// The stall just added is as same as the first stall of the list
		assertSame("Test that stall is added same as first item of the list?", s1, stall.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addStall(stall, s2);
		assertEquals("Test that stall arraylist size is 2?", 2, stall.size());
		
		// Test that a repeated stall id cannot be added.
		C206_CaseStudy.addStall(stall, s2);
		assertEquals("Test that stall arraylist size is 2?", 2, stall.size());
		
		// The stall just added is as same as the second stall of the list
		assertSame("Test that stall is added same as second item of the list?", s2, stall.get(1));

		//Test if the stall list can add stall 10
		Stall_Info s3 = new Stall_Info(3, "Malay Food", "06-09-2021", "test");
		Stall_Info s4 = new Stall_Info(4, "Malay Food", "06-09-2021", "test");
		Stall_Info s5 = new Stall_Info(5, "Malay Food", "06-09-2021", "test");
		Stall_Info s6 = new Stall_Info(6, "Malay Food", "06-09-2021", "test");
		Stall_Info s7 = new Stall_Info(7, "Malay Food", "06-09-2021", "test");
		Stall_Info s8 = new Stall_Info(8, "Malay Food", "06-09-2021", "test");
		Stall_Info s9 = new Stall_Info(9, "Malay Food", "06-09-2021", "test");
		Stall_Info s10 = new Stall_Info(10, "Malay Food", "06-09-2021", "test");
		Stall_Info s11 = new Stall_Info(10, "Malay Food", "06-09-2021", "test");

		C206_CaseStudy.addStall(stall, s3);
		C206_CaseStudy.addStall(stall, s4);
		C206_CaseStudy.addStall(stall, s5);
		C206_CaseStudy.addStall(stall, s6);
		C206_CaseStudy.addStall(stall, s7);
		C206_CaseStudy.addStall(stall, s8);
		C206_CaseStudy.addStall(stall, s9);
		C206_CaseStudy.addStall(stall, s10);
		C206_CaseStudy.addStall(stall, s11);
		
		//Test if the stall list can add stall 10
		assertEquals("Test that stall arraylist size is 10?", 10, stall.size());
		
		//Test after stall 11 have been block, the stall list is still 10
		assertEquals("Test that stall arraylist size is 10?", 10, stall.size());
		
	}
	
	@Test
	public void testViewStall() {
		
	}

	@Test
	public void testAddPromotion() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Promotion arraylist to add to", promotionList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addPromotion(promotionList, po1);
		assertEquals("Test if that Promotion arraylist size is 1?", 1, promotionList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Promotion is added same as 1st item of the list?", po1, promotionList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addPromotion(promotionList, po2);
		assertEquals("Test that Promotion arraylist size is 2?", 2, promotionList.size());
	}

	@Test
	public void retrieveAllPromotionTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Promotion arraylist to retrieve item", promotionList);

		// test if the list of promotion retrieved from the SourceCentre is empty -
		// boundary
		String allPromotion = C206_CaseStudy.retrieveAllPromotion(promotionList);
		String testOutput = "";
		assertEquals("Check that ViewAllPromotionlist", testOutput, allPromotion);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addPromotion(promotionList, po1);
		C206_CaseStudy.addPromotion(promotionList, po2);
		assertEquals("Test that Promotion arraylist size is 2", 2, promotionList.size());

		// test if the expected output string same as the list of promotion retrieved
		// from the SourceCentre
		allPromotion = C206_CaseStudy.retrieveAllPromotion(promotionList);
		testOutput = String.format("%-10s %-10s %-20s %-10s %-10s %-20s\n", "1", "Spaghetti", "5.00", "Yes", "3.50",
				"6");
		testOutput += String.format("%-10s %-10s %-20s %-10s %-10s %-20s\n", "2", "Fries", "3.00", "Yes", "1.00", "6");

		assertEquals("Test that ViewAllCamcorderlist", testOutput, allPromotion);

	}

	@Test
	public void TestDeletePromotion() {

		promotionList.add(po1);
		promotionList.add(po2);
		// Test that promotion offer to be deleted is available, if it is not flag out
		// error (error condition)
		assertTrue(C206_CaseStudy.findPromotion(promotionList, po1.getId()));
		promotionList.remove(po1);

		// Test that promotion offer deleted is no longer in the list. (normal
		// condition)
		assertFalse(C206_CaseStudy.findPromotion(promotionList, po1.getId()));

		// Test that promotion offer list is not null, so retrieve the promotion offer
		// and delete it (boundary condition)
		assertNotNull(promotionList);
		C206_CaseStudy.retrieveAllPromotion(promotionList);
		promotionList.remove(po2);
	}

	// test add order
	@Test
	public void testAddorder() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Customer order arraylist to add to", cuslist);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addcheckorder(cuslist, c1);

		assertEquals("Test if that Customer order  arraylist size is 1?", 1, cuslist.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Customer order is added same as 1st item of the list?", c1, cuslist.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addcheckorder(cuslist, c2);
		assertEquals("Test that Customer order  arraylist size is 2?", 2, cuslist.size());

	}

	// test view order
	@Test
	public void testvieworder() {
		assertNotNull("Test if there is valid customer order arraylist to retrieve item", cuslist);

		String cusorder = C206_CaseStudy.retriveorder(cuslist);
		String testOutput = "";
		assertEquals("Check that ViewAllCustomerorder", testOutput, cusorder);

		C206_CaseStudy.addcheckorder(cuslist, c1);

		C206_CaseStudy.addcheckorder(cuslist, c2);

		assertEquals("Test that customer order size is 2", 2, cuslist.size());


	}

	/*@Test
	public void deleteorder() {

		cuslist.add(c1);
		cuslist.add(c2);

		assertTrue(C206_CaseStudy.findorder(cuslist, c1.getOrderid()));
		cuslist.remove(c1);

		assertFalse(C206_CaseStudy.findorder(cuslist, c1.getOrderid()));

		assertNotNull(cuslist);
		C206_CaseStudy.retriveorder(cuslist);
		cuslist.remove(c2);
	} */

	// Eddy
	@Test
	public void testAddFood() {
		// food list is not null so that can add food item.
		assertNotNull("Test if there is valid food list to add to", foodList);

		// given an empty food list, after adding one food item the size of the food
		// list is 1.
		C206_CaseStudy.addFood(foodList, f1);
		assertEquals("Test that if the food list size is 1", 1, foodList.size());

		// Add one more food item and test the size of the food list is 2.
		C206_CaseStudy.addFood(foodList, f2);
		assertEquals("Test that if food list size is 2", 2, foodList.size());
	}

	@Test
	public void TestgetAllFoodItem() {
		// food list is not null so that can view food item.
		assertNotNull("Test if there is valid food list to get food item", foodList);

		// the food list is not empty so can view food items.
		foodList.add(f1);
		C206_CaseStudy.getAllFoodItem(foodList);
		assertFalse("Test that if the food list is not empty so can view food", foodList.isEmpty());

		// Continue from step 2, test that the size of the food list is 1 and is not
		// empty.
		assertEquals("Test that food list size is 1", 1, foodList.size());
		assertFalse("Test that the food list is not empty", foodList.isEmpty());
	}

	@Test
	public void TestdeleteFood() {
		// food list is not null so that can delete a food item.
		assertNotNull("Test if there is valid food list to delete food item", foodList);

		// when given an empty food list, after adding two items, the size of the food
		// list is 2. After removing a food item, the size of the food list becomes 1.
		foodList.add(f1);
		foodList.add(f2);
		assertEquals("Test that food list size is 2", 2, foodList.size());
		C206_CaseStudy.getAllFoodItem(foodList);
		foodList.remove(0);
		assertEquals("Test that food list size is 1", 1, foodList.size());

		// Continue from step 2, test that after removing a food item, the size of the
		// food list becomes empty.
		C206_CaseStudy.getAllFoodItem(foodList);
		foodList.remove(0);
		assertTrue("Test that the food list is empty", foodList.isEmpty());
	}
	// Eddy

}
