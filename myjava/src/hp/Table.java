package hp;
import java.util.Scanner;
public class Table {
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        System.out.print("Enter any number_");
        int a=n.nextInt();
        for(int i=1;i<=10;i++)
        {
            int table=a*i;
            System.out.println(table);
        }
    }
    }
