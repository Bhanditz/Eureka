import java.util.Scanner;

public class loginValidator {

    static String name,password,mail,phone;
    static Scanner sc = new Scanner(System.in);
    static user users = new user();
    public static boolean login()
    {
        boolean loginState=false;
        System.out.print("Enter your username: ");
        name = sc.nextLine();
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        for (int i=0;i<users.userName.size();i++)
        {
            if(name.equals(users.userName.get(i)) && password.equals(users.password.get(i)) )
            {
                System.out.println("You have logged in successfully");
                loginState = true;
                break;
            }
            else
            {
                System.out.println("Incorrect username or password!!");
            }
        }
        return  loginState;
    }
    public static void signUp()
    {
        System.out.print("Enter your username: ");
        name = sc.nextLine();
        for (int i=0;i<users.userName.size();i++)
        {
            if(name.equals(users.userName.get(i)))
            {
                System.out.println("Username already exists");
                break;
            }
            else
            {
                users.userName.add(name);
            }
        }
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        users.password.add(password);
        System.out.print("Enter your email: ");
        mail = sc.nextLine();
        for (int i=0;i<users.email.size();i++)
        {
            if(mail.equals(users.email.get(i)))
            {
                System.out.println("mail already exists");
                break;
            }
            else
            {
                users.email.add(mail);
            }
        }
        System.out.print("Enter your phoneNum: ");
        phone = sc.nextLine();
        users.phoneNum.add(phone);
        System.out.println("You have signed up successfully");
    }
}
