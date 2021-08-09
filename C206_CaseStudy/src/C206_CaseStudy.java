import java.util.ArrayList;

public class C206_CaseStudy {
	
	private static final int OPTION_QUIT = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test

		ArrayList<Promotion> promotionList = new ArrayList<Promotion>();

		promotionList.add(new Promotion("Spaghetti", 5.00, 3.50, 6));
		promotionList.add(new Promotion("Fries", 3.00, 2.00, 6));

		int option = 0;

		while (option != OPTION_QUIT) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				C206_CaseStudy.viewAllPromotion(promotionList);

			} else if (option == 2) {
				// Add a new item
				Promotion po = inputPromotion();
				C206_CaseStudy.addPromotion(promotionList, po);

			} else if (option == 3) {

			} else if (option == OPTION_QUIT) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}
	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. View Promotion");
		System.out.println("2. Add Promotion");
		System.out.println("3. Delete Promotion");
		System.out.println("4. Quit");
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
	
	//================================= Option 1 View (CRUD - Read) =================================
		public static String retrieveAllPromotion(ArrayList<Promotion> promotionList) {
			String output = "";

			for (int i = 0; i < promotionList.size(); i++) {

				output += String.format("%-10s %-30s %-10s %-10s %-20d\n", promotionList.get(i).getItem(),
						promotionList.get(i).getOldprice(), C206_CaseStudy.showAvailability(promotionList.get(i).getIsAvailable()),
						promotionList.get(i).getOfferprice(), promotionList.get(i).getDays());
			}
			return output;
		}
		public static void viewAllPromotion(ArrayList<Promotion> promotionList) {
			C206_CaseStudy.setHeader("PROMOTION LIST");
			String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ITEM", "OLD PRICE",
					"AVAILABLE", "OFFER PRICE","DAYS");
			 output += retrieveAllPromotion(promotionList);	
			System.out.println(output);
		}
		
		//================================= Option 2 Add (CRUD - Create)=================================
		public static Promotion inputPromotion() {
			String item = Helper.readString("Enter item > ");
			double oldprice = Helper.readDouble("Enter old price > ");
			double offerprice = Helper.readDouble("Enter offer price > ");
			int days = Helper.readInt("Enter days > ");

			Promotion po= new Promotion(item, oldprice, offerprice, days);
			return po;
			
		}
		public static void addPromotion(ArrayList<Promotion> promotionList, Promotion po) {
			
			promotionList.add(po);
			System.out.println("Promotion added");
		}

}
