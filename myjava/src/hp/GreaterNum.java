package hp;
import java.util.Scanner;
public class GreaterNum {
    public static void main(String args[])
    {
        Scanner os= new Scanner(System.in);
        System.out.println("Enter any value of a:");
        int a=os.nextInt();
        System.out.println("Enter any value of b:");
        int b=os.nextInt();
        System.out.println("Enter any value of c:");
        int c=os.nextInt();
        if (a>b)
        {
            System.out.println("a is largest number..");
        }
        else if(b>c)
        {
            System.out.println("b is largest number..");
        }
        else
        {
            System.out.println("c is largest number..");

        }


    }
}
