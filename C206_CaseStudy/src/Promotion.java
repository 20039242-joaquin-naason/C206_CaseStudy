
public class Promotion {

	private String item;
	private double oldprice;
	private double offerprice;
	private int days;
	private boolean isAvailable;
	
	public Promotion(String item, double oldprice, double offerprice, int days) {
		this.item = item;
		this.oldprice = oldprice;
		this.offerprice = offerprice;
		this.days = days;
		this.isAvailable = true;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getOldprice() {
		return oldprice;
	}

	public void setOldprice(double oldprice) {
		this.oldprice = oldprice;
	}

	public double getOfferprice() {
		return offerprice;
	}

	public void setOfferprice(double offerprice) {
		this.offerprice = offerprice;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
