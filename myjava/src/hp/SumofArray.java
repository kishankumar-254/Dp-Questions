package hp;

public class SumofArray {
    public static void main(String[] args) {
        int sum=0,c;
        int a[]=new int[]{1,2,3,4,5,6,9};
        for (int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
