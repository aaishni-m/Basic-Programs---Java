import java.util.*;

class Restaurant
{
	static String name;
	static long contact;
	static String address; 
	static ArrayList<String> basket = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println();
			System.out.println("		JAVA KA DHABA");
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2. Existing User");
			System.out.println();
			System.out.print("Enter an option: ");
			int opt = sc.nextInt();
			System.out.println();

			switch(opt)
			{
				case 1: createAccount(sc); break; 
				case 2: login(sc); break; 
				default: System.out.println("INVALID INPUT"); break; 
			}
		}
	}
	public static void createAccount(Scanner sc)
	{
		System.out.println("		REGISTRATION");
		System.out.println();
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Phone: ");
		contact = sc.nextLong();
		System.out.print("Address: ");
		sc.nextLine(); 
		address = sc.nextLine(); 
		System.out.println();
		System.out.println("ACCOUNT CREATED");
	}

	public static void login(Scanner sc)
	{
		if(name==null)
		{
			System.out.println();
			System.out.println("	CREATE YOUR ACCOUNT FIRST");
			createAccount(sc); 
		}
		System.out.println("		LOGIN");
		System.out.println();


		for(int attempt=3; attempt>=1; attempt--)	
		{
			System.out.print("Username: ");
			String username = sc.next();
			System.out.print("Password: ");
			long phone = sc.nextLong();
			System.out.println();
			if(name.equals(username) && contact==phone)
				homepage(sc); 
			else{
				System.out.println("INVALID CREDENTIALS");
				System.out.println("ATTEMPT LEFT: "+(attempt-1));
				System.out.println();
			}
		}
		System.out.println("THANK YOU NEVER VISIT AGAIN");
		System.exit(0);
	}

	public static void homepage(Scanner sc)
	{
		for(;;)
		{
			System.out.println();
			System.out.println("		HOME PAGE");
			System.out.println();
			System.out.println("1. Menu \n2.Order\n3.Table Booking\n4.Logout");
			System.out.println();
			System.out.print("Enter an option: ");
			int opt = sc.nextInt(); 

			switch(opt)
			{
				case 1: menu(sc); break; 
				case 2: order(sc); break; 
				case 3: tableBooking(sc); break; 
				case 4: System.out.println("THANK YOU VISIT AGAIN"); System.exit(0); break; 
				default: System.out.println("INVALID INPUT"); break; 
			}
		}
	}

	public static void menu(Scanner sc)
	{
		for(;;)
		{
			System.out.println();
			System.out.println("		MENU");
			System.out.println("101 : Butter_Chicken = 450 Rs");
			System.out.println("102 : Biryani_Chicken = 400 Rs");
			System.out.println("103 : Shahi_Paneer = 350 Rs");
			System.out.println("104 : Mix_Veg = 450 Rs");
			System.out.println("105 : Roti = 45 Rs");
			System.out.println("106 : Exit Menu");
			System.out.println();
			System.out.print("Enter food ID: ");
			int id = sc.nextInt();

			switch (id) {
				case 101: {
					basket.add("101 : Butter_Chicken = 450 Rs");
					System.out.println("Butter_Chicken added inside the basket");
					break; 
				}
				case 102: {
					basket.add("102 : Biryani_Chicken = 400 Rs");
					System.out.println("Biryani_Chicken added inside the basket");
					break; 
				}
				case 103: {
					basket.add("103 : Shahi_Paneer = 350 Rs");
					System.out.println("Shahi_Paneer added inside the basket");
					break; 
				}
				case 104: {
					basket.add("104 : Mix_Veg = 450 Rs");
					System.out.println("Mix_Veg added inside the basket");
					break; 
				}
				case 105: {
					basket.add("105 : Roti = 45 Rs");
					System.out.println("Roti added inside the basket");
					break; 
				}
				case 106: {
					return; 
				}
				default: {
					System.out.println("Invalid Food ID");
					break; 
				}
			}
		}
	}

	public static void order(Scanner sc)
	{ 
		System.out.println();
		System.out.println("		ORDERS");
		System.out.println();
		if (basket.size()==0) {
			System.out.println("BASKET IS EMPTY ADD FOOD ITEMS");
			return;
		}
		for (String foodItem : basket) {
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("1. Cancel Order");
		System.out.println("2. Remove Food Item");
		System.out.println("3. Proceed to Payment");
		System.out.println("4. Return to Menu");
		System.out.println();
		System.out.print("Enter an option: ");
		int opt = sc.nextInt();

		switch(opt)
		{
			case 1:{
				System.out.println("Order Cancelled");
				basket.clear(); 
				break; 
			}

			case 2:{
				System.out.print("Enter foodID: ");
				int foodId = sc.nextInt(); 
				removeFoodItem(foodId);
				break; 
			}

			case 3: {
				bill(); 
				break;
			}
			case 4:{
				return; 
			}
			default:{
				System.out.println("INVALID INPUT");
				break; 
			}
		}
	}

	public static void removeFoodItem(int foodId)
	{
		ArrayList<String> dupBasket = new ArrayList<>(basket);
		int index = 0;
		boolean flag = false;

		for(String foodItem: dupBasket)
		{
			String [] arr = foodItem.split(" ");
			if (arr[0].equals(foodId+""))
			{
				dupBasket.remove(index); 
				flag = true; 
				System.out.println("FOOD ITEM REMOVED");
			}
			index++;
		}
		if(!flag)
			System.out.println("FOOD ITEM DOESN'T EXIST IN THE BASKET");
		
		basket = dupBasket; 
	}

	public static void bill()
	{
		double totalBill = 0; 
		for(String foodItem : basket)
		{
			String [] arr = foodItem.split(" ");
			totalBill += Double.parseDouble(arr[4]);
		}
		for(String foodItem : basket)
		{
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("Total Bill : "+totalBill+"Rs.");
	}

	public static void tableBooking(Scanner sc)
	{
		System.out.println("		TABLE BOOKING");
	}
}