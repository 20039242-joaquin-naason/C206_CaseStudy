
public class Customer extends Food{

	private int Orderid;
	private double total;
	
	public Customer(int id, String name, double price, boolean isAvailable, int orderid, double total) {
		super(id, name, price, isAvailable);
		Orderid = orderid;
		this.total = total;
	}

	public int getOrderid() {
		return Orderid;
	}

	public void setOrderid(int orderid) {
		Orderid = orderid;
	}

	public double getTotal() {
		
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

	
}