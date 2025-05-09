import java.util.Scanner; 

class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our bank!");
		System.out.println();

		String username1 = null;
		String password1 = null;
		String address = null;
		long contact = 0;
		int balance = 0; 

		for (; ; )
		{
			System.out.println("1. Login into existing account\n2. Create new account"); 
			int opt = sc.nextInt();

			if (opt==1)
			{
				if ((username1 == null) && (password1 == null))
				{
					System.out.println();
					System.out.println("First create an account");
					continue; 
				}
				for (int i=3;i>=1 ; i--)
				{
					System.out.print("username: ");
					String username = sc.next();
					System.out.print("password: ");
					String password = sc.next();

					if ((username.equals(username1))&&(password.equals(password1)))
					{
						home:
						for (; ; )
						{
							System.out.println();
							System.out.println("Homepage"); 
							System.out.println("1. Deposit money \n2. Withdraw money \n3. Check balance \n4. Mini statement \n5. Logout");
							int ch = sc.nextInt();

							switch(ch){
								case 1:
									System.out.println("Enter the amount you want to deposit: ");
									int deposit = sc.nextInt();
									balance += deposit;
									System.out.println("Amount Deposited!");
									break; 
								
								case 2:
									if (balance==0)
									{
										System.out.println("Insufficient Funds");
										continue;
									}
									else {	
										System.out.println("Enter amount to be withdrawn: ");
										int amt = sc.nextInt();
										balance -= amt;
										System.out.println("Amount Withdrawn!");
										break;
									}
								
								case 3:
									for (int j=3;j>=1 ;j-- )
									{
										System.out.println("username: ");
										String username2 = sc.next();
										System.out.println("password: ");
										String password2 = sc.next();
										if((username2.equals(username1))&&(password2.equals(password1))){
											System.out.println("Balance: "+balance);
											continue home; 
										}
										System.out.println("Attempts left: "+j);
									}
									System.out.println("Your account has been locked for 24 hours");
									System.exit(0);
								
								case 4:
									System.out.println("Statement");
									break;
								
								case 5:
									System.out.println("Thank you! See you next time.");
									System.exit(0);
								
								default:
									System.out.println("Invalid entry");
							}
						}
					}
					System.out.println("Attempts left: "+i);
				}
				System.out.println("Never come back again");
				System.exit(0);
			}

			else if(opt==2) 
			{
				System.out.print("username: ");
				username1 = sc.next();

				System.out.print("password: ");
				password1 = sc.next();
				sc.nextLine();
				System.out.print("address: ");
				address = sc.nextLine();
				System.out.print("contact: ");
				contact = sc.nextLong();
				System.out.print("balance: ");
				balance = sc.nextInt();

			}
		}
	}
}
