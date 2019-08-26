package hp;
import java.util.Scanner;
public class Pet_3 {
    public static void main(String args[])
    {
        System.out.println("Enter value of num:");
        Scanner m=new Scanner(System.in);
        int num=m.nextInt();
        for (int i=num;i>0;i--)
        {
            for(int j=num;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
