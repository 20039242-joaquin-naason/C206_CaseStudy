
public class Customer extends Promotion{

	private int id;
	private String order;
	
	public Customer(String item, double oldprice, double offerprice, int days, int id, String order) {
		super(item, oldprice, offerprice, days);
		this.id = id;
		this.order = order;
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
	
	
	
	
	
	
}
