import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private Promotion po1;
	private Promotion po2;
	
	private ArrayList<Promotion> promotionList;

	@Before
	public void setUp() throws Exception {
		po1 = new Promotion("Spaghetti", 5.00, 3.50, 6);
		po2 = new Promotion("Fries", 3.00, 1.00, 6);
		
		promotionList= new ArrayList<Promotion>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void testAddPromotion() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Promotion arraylist to add to", promotionList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addPromotion(promotionList, po1);		
		assertEquals("Test if that Promotion arraylist size is 1?", 1, promotionList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Promotion is added same as 1st item of the list?", po1, promotionList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addPromotion(promotionList, po2);
		assertEquals("Test that Promotion arraylist size is 2?", 2, promotionList.size());
	}
	
	@Test
	public void testRetrieveAllPromotion() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Promotion arraylist to add to", promotionList);
		
		//test if the list of promotion retrieved from the SourceCentre is empty
				String allPromotion= C206_CaseStudy.retrieveAllPromotion(promotionList);
				String testOutput = "";
				assertEquals("Check that ViewAllPromotionlist", testOutput, allPromotion);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
				C206_CaseStudy.addPromotion(promotionList, po1);
				C206_CaseStudy.addPromotion(promotionList, po2);
		assertEquals("Test if that Promotion arraylist size is 2?", 2, promotionList.size());
		
		//test if the expected output string same as the list of promotion retrieved from the SourceCentre
		allPromotion= C206_CaseStudy.retrieveAllPromotion(promotionList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n","Spaghetti", 5.00, "Yes", 3.50, 6);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n","Fries", 3.00, "Yes", 2.00, 6);
	
		assertEquals("Check that ViewAllPromotionlist", testOutput, allPromotion);
		
	}

}
