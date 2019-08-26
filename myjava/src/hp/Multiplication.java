package hp;
import java.util.Scanner;
public class Multiplication{
    public static void main(String args[])
    {
        System.out.println("Enter any two mumber_");
        Scanner name= new Scanner(System.in);
        int a=name.nextInt();
        int b=name.nextInt();
         int c=a*b;
        System.out.print("output is:" +c);
    }
}
