package hp;
import java.util.Scanner;
public class Pet_2 {
    public static void main(String agrs[])
    {
        System.out.println("Enter value of num");
        Scanner kk=new Scanner(System.in);
        int num=kk.nextInt();
        for(int i=0;i<=num;i++)
        {
            for(int j=num;j>i;j--)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
