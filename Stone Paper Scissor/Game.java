import java.util.Scanner;

class Game 
{
    public static void main(String[] args) throws InterruptedException
    {
        int opt = 0;

        // For bot: Choose option randomly using Math.random()
        for (;;) 
        {
            int ch = (int)(Math.random() * 10);
            if (ch == 1 || ch == 2 || ch == 3) 
            {
                opt = ch; 
                break; // Exit the loop when a valid option is selected
            }
        }

        //System.out.println("Bot chose: " + opt);

        // Convert opt to string
        String bot_opt = null; 

        if (opt == 1) 
        {
            bot_opt = "Rock";
        } 
        else if (opt == 2) 
        {
            bot_opt = "Paper";
        } 
        else if (opt == 3) 
        {
            bot_opt = "Scissors";
        }
		else {
			System.out.println("Invalid response");
		}

        //System.out.println("Bot's choice in words: " + bot_opt);

		// take user input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : \n1. Rock \n2. Paper \n3.Scissors");
		int choice = sc.nextInt();
		String user_opt = null; 

		if (choice == 1) 
        {
            user_opt = "Rock";
        } 
        else if (choice == 2) 
        {
            user_opt = "Paper";
        } 
        else if (choice == 3) 
        {
            user_opt = "Scissors";
        }
		else {
			System.out.println("Invalid response");
		}

		System.out.println("Bot: "+bot_opt+"\n"+"User: "+user_opt);
		
		//bot = opt
		// user = choice

		// game evaluation
		System.out.println();

		Thread.sleep(1000);

		if ((opt==1&&choice==2)||(opt==2&&choice==3)||(opt==3&&choice==1))
		{
			System.out.println("Winner: User \nCONGRATULATIONS!!!");
		}
		
		else if ((opt==1&&choice==3)||(opt==2&&choice==1)||(opt==3&&choice==2))
		{
			System.out.println("Winner: Bot \nTry next time :(");
		}

		else {
			System.out.println("Draw!");
		}
    }
}
