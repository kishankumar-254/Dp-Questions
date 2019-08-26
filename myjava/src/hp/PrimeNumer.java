package hp;
import java.util.Scanner;
public class PrimeNumer {
    public static void main(String[] args) {
        int count=0;
        Scanner d=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=d.nextInt();
        for (int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println("Entered number is prime:");
        }
        else
        {
            System.out.println("Not prime number:");
        }
    }

}
