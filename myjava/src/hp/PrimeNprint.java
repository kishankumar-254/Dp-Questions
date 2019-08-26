package hp;
import java.util.Scanner;
public class PrimeNprint {
    public static void main(String[] args) {
        int count=0,i;
        System.out.println("Enter any number:");
     Scanner v=new Scanner(System.in);
     int n=v.nextInt();
     for (i=1;i<=n;i++)
     {
         for (int j=1;j<=i;j++)
         {
             if (i%j==0)
             {
                 count++;
             }
         }
         if (count==2)
         {
             System.out.println(i);
     }

    }

}}
