package hp;
import java.util.Scanner;
public class WeekDay {
    public static void main(String args[])
    {
       Scanner de=new Scanner(System.in);
       System.out.println("please your age:");
       int age =de.nextInt();
       switch (age)
       {
           case 10:
           case 15:
           case 17:
               System.out.println("you are not eligible for vote");
               break;
           case 18:
               System.out.println("You are eligible for vote");
       }
    }

}
