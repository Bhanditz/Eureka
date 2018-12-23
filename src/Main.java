import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        loginValidator lv = new loginValidator();
        
        boolean status=false;
        System.out.println("******************Welcome to Eureka******************");
        System.out.println("Choose one of the following options: ");
        System.out.println("1) Sign In: ");
        System.out.println("2) Sign Up: ");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        if(choice==1)
        {
            status = lv.login();
        }
        else if(choice == 2)
        {
            lv.signUp();
            status = lv.login();
        }
        if (status)
        {
            System.out.println("Welcome User.");
            System.out.println("Choose one of the following: ");
            System.out.println("1) post Item: ");
            System.out.println("2) search Item: ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1)
            {

            }
            else if (choice == 2)
            {
                
            }
        }
        else
        {
            System.out.println("Failed to login!!");
            System.exit(0);
        }
    }
}
