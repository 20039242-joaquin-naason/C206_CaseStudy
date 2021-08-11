
public class Customer {

	private int id;
	private String order;
	private double total;
	
	
	
	
	public Customer(int id, String order, double total) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.order = order;
		this.total = total;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}