import java.util.ArrayList;

public class C206_CaseStudy {
	
	private static final int OPTION_QUIT = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Promotion> promotionList = new ArrayList<Promotion>();

		promotionList.add(new Promotion("Spaghetti", 5.00, 3.50, 6));
		promotionList.add(new Promotion("Fries", 3.00, 2.00, 6));

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

            } else if (option == 13) {
                // Return item

            } else if (option == 14) {
                // Return item

            } else if (option == 15) {
                // Return item

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

				output += String.format("%-10s %-30.2f %-10s %-10.2f %-20d\n", promotionList.get(i).getItem(),
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
