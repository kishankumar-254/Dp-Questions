package hp;
import java.util.Scanner;
public class ArmsrogNumber {
    public static void main(String[] args) {
        int n,sum=0,c,r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=s.nextInt();
        while (n>0)
        {
           r=n%10;
           c=r*r*r;
           sum=sum+c;
           n=n/10;
        }
        if (n==sum)
        {
            System.out.println("Entered number is armstrog:");
        }
        else
        {
            System.out.println("Not armstrong:");
        }
    }
}
