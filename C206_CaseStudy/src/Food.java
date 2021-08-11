/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Eddy Goh
 * Student ID: 20047899
 * Class: W64E
 * Date/Time created: Wednesday 11-08-2021 12:01
 */

public class Food {
	private int id;
	private String name;
	private double price;

	public Food(int id, String name, double price, boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

}
