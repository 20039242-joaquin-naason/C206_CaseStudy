import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int OPTION_QUIT = 16;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Promotion> promotionList = new ArrayList<Promotion>();
		ArrayList<Customer> cuslist = new ArrayList<Customer>();

		promotionList.add(new Promotion(1, "Spaghetti", 5.00, 3.50, 6));
		promotionList.add(new Promotion(2, "Fries", 3.00, 2.00, 6));
		cuslist.add(new Customer(3, "Chicken Rice", 2.5, true, 1, 5.0, 2));
		cuslist.add(new Customer(2, "teriyaki set", 5.0, true, 1, 5.0, 1));

		ArrayList<Stall_Info> stall = new ArrayList<Stall_Info>();

		stall.add(new Stall_Info(1, "Chinese Food", "06-09-2021"));
		stall.add(new Stall_Info(2, "Malay Food", "06-09-2021"));

		int option = 0;

		while (option != 16) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items

			} else if (option == 2) {
				// Add a new item

			} else if (option == 3) {
				// Loan item

			} else if (option == 4) {
				// Return item

			} else if (option == 5) {
				// Return item

			} else if (option == 6) {
				// Return item

			} else if (option == 7) {
				// Return item

			} else if (option == 8) {
				// Return item

			} else if (option == 9) {
				// Return item

			} else if (option == 10) {
				// Add new promotion offers
				Promotion po = inputPromotion();
				C206_CaseStudy.addPromotion(promotionList, po);

			} else if (option == 11) {
				// View promotion offers
				C206_CaseStudy.viewAllPromotion(promotionList);

			} else if (option == 12) {
				// Delete promotion offers
				C206_CaseStudy.deletePromotion(promotionList);

			} else if (option == 13) {
				// add order
				addorder();

			} else if (option == 14) {
				// view order
				Customer c = addorder();
				C206_CaseStudy.addcheckorder(cuslist, c);

			} else if (option == 15) {
				// delete order

			} else if (option == 16) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}
	}

	public static void menu() {
		C206_CaseStudy.setHeader("Canteen Automation System (CAS)");
		System.out.println("1. Add new stall");
		System.out.println("2. View Stall");
		System.out.println("3. Delete Stall");
		System.out.println("4. Add new food items");
		System.out.println("5. View food items");
		System.out.println("6. Delete food items");
		System.out.println("7. Add new purchase orders of ingredients");
		System.out.println("8. View purchase orders of ingredients");
		System.out.println("9. Delete purchase orders of ingredients");
		System.out.println("10. Add new promotion offers");
		System.out.println("11. View promotion offers");
		System.out.println("12. Delete promotion offers");
		System.out.println("13. Add new orders by customer");
		System.out.println("14. View orders by customer");
		System.out.println("15. Delete orders by customer");
		System.out.println("16. Quit");
		Helper.line(80, "-");
	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}

	public static String retrieveAllPromotion(ArrayList<Promotion> promotionList) {
		String output = "";

		for (int i = 0; i < promotionList.size(); i++) {

			output += String.format("%-10d %-10s %-20.2f %-10s %-10.2f %-20d\n", promotionList.get(i).getId(),
					promotionList.get(i).getItem(), promotionList.get(i).getOldprice(),
					C206_CaseStudy.showAvailability(promotionList.get(i).getIsAvailable()),
					promotionList.get(i).getOfferprice(), promotionList.get(i).getDays());
		}
		return output;
	}

	public static void viewAllPromotion(ArrayList<Promotion> promotionList) {
		C206_CaseStudy.setHeader("PROMOTION LIST");
		String output = String.format("%-10s %-10s %-20s %-10s %-10s %-20s\n", "ID", "ITEM", "OLD PRICE", "AVAILABLE",
				"OFFER PRICE", "DAYS");
		output += retrieveAllPromotion(promotionList);
		System.out.println(output);
	}

	public static Promotion inputPromotion() {
		int id = Helper.readInt("Enter id > ");
		String item = Helper.readString("Enter item > ");
		double oldprice = Helper.readDouble("Enter old price > ");
		double offerprice = Helper.readDouble("Enter offer price > ");
		int days = Helper.readInt("Enter days > ");

		Promotion po = new Promotion(id, item, oldprice, offerprice, days);
		return po;
	}

	public static void addPromotion(ArrayList<Promotion> promotionList, Promotion po) {

		promotionList.add(po);
		System.out.println("Promotion added");
	}

	public static boolean findPromotion(ArrayList<Promotion> promotionList, int id) {
		for (int i = 0; i < promotionList.size(); i++) {
			if (id == promotionList.get(i).getId()) {
				return true;
			}

		}
		return false;
	}

	public static void deletePromotion(ArrayList<Promotion> promotionList) {
		boolean deleted = false;
		int id = Helper.readInt("Enter promotion ID > ");
		if (findPromotion(promotionList, id)) {
			for (int i = 0; i < promotionList.size(); i++) {
				if (id == promotionList.get(i).getId()) {
					promotionList.remove(i);
					deleted = true;
				}
			}
		}
		if (deleted == true) {
			System.out.println("Promotion Offer Deleted");
		} else {
			System.out.println("Promotion Offer Not Deleted");
		}
	}

	public static void vieworder(ArrayList<Customer> cuslist) {
		String output = String.format("%-20s %-30s %10s %-20s %-30s %10s\n", "Food ID", "FOOD", "Price", "Available",
				"Customer ID", "Order", "Total Price");

		for (int i = 0; i < cuslist.size(); i++) {
			output += String.format("%-20d %-30s %10.2%f %-20s %-30s %10.2%f \n",cuslist.get(i).getId(),cuslist.get(i).getName(),cuslist.get(i).getPrice(),cuslist.get(i).isAvailable(),
					cuslist.get(i).getOrderid(),cuslist.get(i).getQuantity(),cuslist.get(i).getTotal());
		}
		System.out.println(output);
	}

	public static Customer addorder() {
		// int id, String name, double price, boolean isAvailable, int orderid, double
		// total, int quantity;
		int id = Helper.readInt("Enter food id >");
		String food = Helper.readString("Enter food name >");
		double price = Helper.readDouble("Enter price of food >");
		boolean isAvailable = Helper.readBoolean("Enter if food is avaible(true/false) >");
		int orderid = Helper.readInt("Enter order ID >");

		int quantity = Helper.readInt("Enter quantiy >");

		double total = Double.valueOf(quantity) * price;

		Customer c = new Customer(id, food, price, isAvailable, orderid, total, quantity);
		return c;
	}

	public static void addcheckorder(ArrayList<Customer> cuslist, Customer c) {
		cuslist.add(c);
		System.out.println("Order has been added");

	}

}
