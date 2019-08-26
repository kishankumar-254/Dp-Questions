package hp;
import java.util.Scanner;
public class SumOfInteger {
    public static void main(String[] args) {
        int sum=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int a=sc.nextInt();
        while (a>0)
        {
            r=a%10;
            sum=sum+r;
            a=a/10;

        }
        System.out.println("Sum of number is:" +sum);
    }
}
