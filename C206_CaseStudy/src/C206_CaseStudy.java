import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int OPTION_QUIT = 16;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Promotion> promotionList = new ArrayList<Promotion>();
		ArrayList<Customer> cuslist = new ArrayList<Customer>();

		promotionList.add(new Promotion(1, "Spaghetti", 5.00, 3.50, 6));
		promotionList.add(new Promotion(2, "Fries", 3.00, 2.00, 6));
		cuslist.add(new Customer(3, "Chicken Rice", 2.5, 1, 5.0, 2));
		cuslist.add(new Customer(2, "teriyaki set", 5.0, 1, 5.0, 1));

		ArrayList<Stall_Info> stall = new ArrayList<Stall_Info>();

		stall.add(new Stall_Info(1, "Chinese Food", "06-09-2021", "tasty"));
		stall.add(new Stall_Info(2, "Malay Food", "06-09-2021", "yummy"));

		// Eddy
		ArrayList<Food> foodList = new ArrayList<Food>();
		foodList.add(new Food(1, "Chicken Rice", 3.5));
		foodList.add(new Food(2, "Chicken Chop", 5.5));
		// Eddy

		int option = 0;

		while (option != 16) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				
				Stall_Info ss = inputStall();
				C206_CaseStudy.addStall(stall, ss);
				
			} else if (option == 2) {

				C206_CaseStudy.viewStall(stall);

			} else if (option == 3) {
				
				C206_CaseStudy.deleteStall(stall);

			} else if (option == 4) {
				// add food item
				// Eddy
				Food f = enterFoodItem();
				C206_CaseStudy.addFood(foodList, f);
			} else if (option == 5) {
				// view food item
				C206_CaseStudy.viewFood(foodList);
			} else if (option == 6) {
				// delete food item
				C206_CaseStudy.deleteFood(foodList);
				// Eddy
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
				Customer c = addorder();
				C206_CaseStudy.addcheckorder(cuslist, c);
			} else if (option == 14) {
				// view order
				C206_CaseStudy.vieworder(cuslist);

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
		String output = String.format("%-20s %-30s %10s %-30s %10s\n", "Food ID", "FOOD", "Price", "Customer ID",
				"Quantity", "Total Price");

		for (int i = 0; i < cuslist.size(); i++) {

			output += String.format("%-20s %-30s %10s  %-30s %10s\\n", cuslist.get(i).getId(), cuslist.get(i).getName(),
					cuslist.get(i).getPrice(), cuslist.get(i).getOrderid(), cuslist.get(i).getQuantity(),
					cuslist.get(i).getTotal());
		}
		System.out.println(output);

	}

	public static Customer addorder() {

		int id = Helper.readInt("Enter food id >");
		String food = Helper.readString("Enter food name >");
		double price = Helper.readDouble("Enter price of food >");

		int orderid = Helper.readInt("Enter order ID >");
		// double total = Helper.readDouble("Enter total price");

		int quantity = Helper.readInt("Enter quantiy >");

		double total = quantity * price;

		Customer c = new Customer(id, food, price, orderid, total, quantity);
		return c;
	}

	public static void addcheckorder(ArrayList<Customer> cuslist, Customer c) {
		cuslist.add(c);
		System.out.println("Order has been added");

	}

	// view stall list (Ying Xuan)
	public static String retrieveAllStall(ArrayList<Stall_Info> stall) {
		String output = "";

		for (int i = 0; i < stall.size(); i++) {

			output += String.format("%-20d %-20s %-20s %-20s\n", stall.get(i).getStallId(), stall.get(i).getName(),
					stall.get(i).getOperationdate(), stall.get(i).getDescription());
		}
		return output;
	}

	public static void viewStall(ArrayList<Stall_Info> stall) {
		C206_CaseStudy.setHeader("STALL LIST");
		String output = String.format("%-20s %-20s %-20s %-20s\n", "ID", "NAME", "OPERATION DATE",
				"DESCRIPTION");
		output += retrieveAllStall(stall);
		System.out.println(output);
	}
	
	//Add new stall (Ying Xuan)
	public static Stall_Info inputStall() {
		
		int id = Helper.readInt("Enter stall id > ");
		String name = Helper.readString("Enter stall name > ");
		String date = Helper.readString("Enter operation date > ");
		String description = Helper.readString("Enter description > ");
		
	
		Stall_Info ss= new Stall_Info(id, name, date, description);
		return ss;
		
	}
	public static void addStall(ArrayList<Stall_Info> stall, Stall_Info ss) {

		if (searchID(stall,ss) == true){	
				
			System.out.println("Duplicated ID!");
		}
		else {
			
			stall.add(ss);
			System.out.println("New stall added");

		}	
	}
	
	public static boolean searchID(ArrayList<Stall_Info> stall, Stall_Info ss) {
		for (Stall_Info i : stall) {
			if (i.getStallId() == ss.getStallId()){	
				
				return true;
			}
		}
		return false;
	}
	
	//Delete existing stall (Ying Xuan)
	public static boolean searchStall(ArrayList<Stall_Info> stall, int id) {
		for (Stall_Info i : stall) {
			if (i.getStallId()== id) {
				return true;
			}
		}
		return false;
	}
	
	public static void deleteStall(ArrayList<Stall_Info> stall) {
		boolean d = false;
		int id = Helper.readInt("Enter stall id > ");
		if (searchStall(stall, id)) {
			for (Stall_Info i : stall) {
				if (i.getStallId() == id) {
					stall.remove(i);
					d = true;
				}
			}
		}
		if (d == true) {
			System.out.println("Stall deleted successfully");
		} else {
			System.out.println("Stall deleted unsuccessfully");
		}
	}

	// Eddy
	public static String getAllFoodItem(ArrayList<Food> foodList) {
		String output = "";
		for (int i = 0; i < foodList.size(); i++) {
			output += String.format("%-5s %-20s %-5s\n", foodList.get(i).getId(), foodList.get(i).getName(),
					foodList.get(i).getPrice());
		}
		return output;
	}

	public static void viewFood(ArrayList<Food> foodList) {
		C206_CaseStudy.setHeader("Food LIST");
		String output = String.format("%-5s %-20s %-5s\n", "ID", "NAME", "PRICE");
		output += getAllFoodItem(foodList);
		System.out.println(output);
	}

	public static Food enterFoodItem() {
		int id = Helper.readInt("Enter new id > ");
		String name = Helper.readString("Enter new food name > ");
		double price = Helper.readDouble("Enter new food price > ");
		Food f = new Food(id, name, price);
		return f;
	}

	public static void addFood(ArrayList<Food> foodList, Food f) {
		foodList.add(f);
		System.out.println("New food item added");
	}

	public static boolean findFood(ArrayList<Food> foodList, String name) {
		for (int i = 0; i < foodList.size(); i++) {
			if (name == foodList.get(i).getName()) {
				return true;
			}
		}
		return false;
	}

	public static void deleteFood(ArrayList<Food> foodList) {
		boolean deleted = false;
		String name = Helper.readString("Enter food name > ");
		if (findFood(foodList, name)) {
			for (int i = 0; i < foodList.size(); i++) {
				if (name == foodList.get(i).getName()) {
					foodList.remove(i);
					deleted = true;
				}
			}
		}
		if (deleted == true) {
			System.out.println("Food item deleted");
		} else {
			System.out.println("Food item not deleted");
		}
	}
	// Eddy
}
