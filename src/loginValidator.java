import java.util.Scanner;

public class loginValidator {

    static String name,password,mail,phone;
    static Scanner sc = new Scanner(System.in);
    public static boolean login(user users)
    {
        boolean loginState=false;
        System.out.print("Enter your username: ");
        name = sc.nextLine();
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        if(name.equals(users.userName) && password.equals(users.password) )
            {
                System.out.println("You have logged in successfully");
                loginState = true;
              
            }
            else
            {
              System.out.println("Incorrect username or password!!");
            }
        return  loginState;
    }
    public static void signUp(user users)
    {
        System.out.print("Enter your username: ");
        name = sc.nextLine();
            if(name.equals(users.userName))
            {
            System.out.println("Username already exists ");
               
            }
            else
            {
                users.userName = name;
            }
        
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        users.password = password;
        System.out.print("Enter your email: ");
          mail = sc.nextLine();
            if(mail.equals(users.email))
            {
              System.out.println("mail already exists ");
                
            }
            else
            {
                users.email = mail;
            }
        System.out.print("Enter your phoneNum: ");
        phone = sc.nextLine();
        users.phoneNum = phone;
        System.out.println("You have signed up successfully");
    }
}
