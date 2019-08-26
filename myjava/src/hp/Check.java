package hp;
import java.util.Scanner;
public class Check {
    public static void main(String args[])
    {
        Scanner op=new Scanner(System.in);
        System.out.println("Enter value for num");
        int num=op.nextInt();
        for(int i=1;i<=num;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

}
