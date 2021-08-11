
public class Customer extends Food{

	private int Orderid;
	private double total;
	private double quantity;
	
	
	
	public Customer(int id, String name, double price, int orderid, double total, double quantity) {
		super(id, name, price);
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
	

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

	
}