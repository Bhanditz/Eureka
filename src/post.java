import java.util.ArrayList;
import java.util.Scanner;
public class post
{
    public ArrayList<String> title =  new ArrayList<>();
    public ArrayList<String> category =  new ArrayList<>();
    public ArrayList<String> subCategory =  new ArrayList<>();
    public ArrayList<String> description =  new ArrayList<>();
    public ArrayList<String> foundOn =  new ArrayList<>();
    public ArrayList<String> lostOn =  new ArrayList<>();
    public ArrayList<String> postType =  new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public String input;
    public void postInfo(int choice)
    {
      System.out.println("Enter post title");
      input = sc.nextLine();
      title.add(input);
      System.out.println("Enter item category");
      input = sc.nextLine();
      category.add(input);
      System.out.println("Enter item subCategory");
      input = sc.nextLine();
      subCategory.add(input);
      System.out.println("description of the post");
      input = sc.nextLine();
      description.add(input);
      if(choice == 1)
      {
        postType.add("found");
        System.out.println("date when you found the item");
        input = sc.nextLine();
        foundOn.add(input);
      }
      else if(choice == 2)
      {
        postType.add("lost");
        System.out.println("date when you lost the item");
        input = sc.nextLine();
        lostOn.add(input);
        
      }
      
    }
  
}
