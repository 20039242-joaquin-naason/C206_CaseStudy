
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19006547, Aug 15, 2021 5:01:21 PM
 */
//Done by Alan
public class Purchase_order {
	// purchase order id
	private int id;
	private int quantity;
	private double total;

	/**
	 * @param o1
	 * @param o2
	 */
	// for the casestudy 01 and 02
	public Purchase_order(Purchase_order o1, Purchase_order o2) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id2
	 * @param name
	 * @param description
	 */
	//for the main casestudy adding purchase order
	public Purchase_order(int id2, String name, String description) {
		// TODO Auto-generated constructor stub
	}

	public void Purchase_Order(Food myFood, int id, int quantity) {
		this.id = id;
		this.quantity = quantity;
		this.total = quantity * myFood.getPrice();

	}

	public int getId() {
		return this.id;
	}

	public  int getQuantity() {
		return this.quantity;
	}

	public double getTotal() {
		return this.total;
	}

	public void setQuantity(int newQuantity) {
		this.quantity = newQuantity;
	}

	/**
	 * @return
	 */
	//for main case study add
	public Object getPurchaseId() {
		// TODO Auto-generated method stub
		return null;
	}

}
