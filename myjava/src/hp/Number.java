package hp;
import java.util.Scanner;
public class Number {
    public static void main(String args[])
    {
        System.out.println("Enter any number positive Integer or negative Negative:");

        Scanner p=new Scanner(System.in);
    int a=p.nextInt();

        if(a>=0)
        {
            System.out.print("Entered number is positive Integer");
        }
        else if(a<0){

            System.out.println("Entered number is negatine Integer");
        }
        else
        {
            System.out.println("Please enter valid number:");
        }
    }
}
