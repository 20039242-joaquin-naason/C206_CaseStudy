
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19006547, Aug 15, 2021 4:50:35 PM
 */
//Done by Alan
public class Stall_staff {
	// add purchase orders
	public int addPurchaseOrder(Food myfood) {
		return myfood.getId();
	}

	// view purchase orders
	// assumption that view purchase order means view purchase order id
	public int viewPurchaseOrder(Food myFood) {
		return myFood.getId();
	}

	// delete purchase orders
	public void removePurchaseOrder(Food myFood) {
		myFood = null;
	}

	/**
	 * @param o1
	 */
	//To remove order in the case study test.
	public void remove(Purchase_order o1) {
		// TODO Auto-generated method stub
		
	}
}
