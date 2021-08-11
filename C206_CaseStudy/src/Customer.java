
public class Customer extends Food{

	private int Orderid;
	private double total;
	private int quantity;
	
	
	
	public Customer(int id, String name, double price, boolean isAvailable, int orderid, double total, int quantity) {
		super(id, name, price, isAvailable);
		Orderid = orderid;
		this.total = total;
		this.quantity = quantity;
	}

	public int getOrderid() {
		return Orderid;
	}

	public void setOrderid(int orderid) {
		Orderid = orderid;
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

	
}