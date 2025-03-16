import java.util.Scanner;

public class ChatBot 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner sc = new Scanner(System.in);
        String help, input;
        
        System.out.println("Welcome to Speedy Bites! We deliver and serve your food quick!");
       
        Thread.sleep(1500);
        System.out.print("Do you need any help? (Yes/No): ");
        help = sc.nextLine();
        if (help.equalsIgnoreCase("Yes"))
        {
            Thread.sleep(1500);
            while (true)
            {
                System.out.println("""
                                   Would you like to look at our dashboard: 
                                        > Menu 
                                        > Hours 
                                        > Location 
                                        > Quit """);

                System.out.print("Input: ");

                input = sc.nextLine();

                if (input.equalsIgnoreCase("Menu"))
                {
                    System.out.println("What would you like to order? ");
                    System.out.println("""
                                       We offer: 
                                            > Burgers and Fries 
                                            > Buffalo Wings 
                                            > Rice Meals 
                                            > Milkshakes""");     
                }
                else if (input.equalsIgnoreCase("Hours"))
                {
                    System.out.println("The store operates 24/7.");
                }
                else if (input.equalsIgnoreCase("Location"))
                {
                    System.out.println("Our store is located at Twin Towers Building, 767 Boeing Street, New York City.");
                }
                else if (input.equalsIgnoreCase("Quit"))
                {
                    System.out.println("Thank you for visiting Speedy Bites! Have a wonderful day!");
                    break;
                }   
                else
                {
                    System.out.println("Invalid Input");
                }
                Thread.sleep(1000);
            }
        }
        else if (help.equalsIgnoreCase("No"))
        {
            Thread.sleep(1500);
            System.out.println("Thank you for visiting Speedy Bites! Have a wonderful day!");
        }
        else 
        {
            System.out.println("Invalid Input!");
        }
        sc.close();
    }   
}
