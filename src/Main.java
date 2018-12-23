import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        loginValidator lv = new loginValidator();
        post p = new post();
        search s = new search();
        user u = new user();
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
            status = lv.login(u);
        }
        else if(choice == 2)
        {
            lv.signUp(u);
            status = lv.login(u);
        }
        if (status)
        {
          System.out.println("Welcome.");
          while(choice !=3)
          {
            System.out.println("Choose one of the following: ");
            System.out.println("1) post Item: ");
            System.out.println("2) search Item: ");
            System.out.println("3) logout: ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1)
            {
              System.out.println("Choose one of the following: ");
              System.out.println("1) post found item: ");
              System.out.println("2) post lost item: ");
              choice = Integer.parseInt(sc.nextLine());
                if(choice==1)
              {
                p.postInfo(choice);
              }
              else if(choice == 2)
              {
                p.postInfo(choice);
              }
              else
              {
                System.out.println("Please come again :D");
                System.exit(0);
                break;
              }
            }
            else if (choice == 2)
            {
               System.out.println("search doesn't work");
                System.out.println("¯\\_(ツ)_/¯");
               System.out.println(p.title.get(0));
            }
          }
            
        }
        else
        {
            System.out.println("Failed to login!!");
            System.out.println("try signing up first??");
            System.out.println("¯\\_(ツ)_/¯");
            System.exit(0);
        }
    }
}
