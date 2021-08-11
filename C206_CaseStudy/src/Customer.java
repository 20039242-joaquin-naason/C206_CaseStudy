
public class Customer {

	private int id;
	private String order;
	private int total;
	
	
	public Customer(int id, String order, int total) {
	
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}