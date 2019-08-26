package hp;
import java.util.Arrays;
public class ArrayJava {
    public static void main(String[] args) {
        int a[]={1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String b[]={"Java",

                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"};

        System.out.println("Original numeric array : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted numeric array : "+Arrays.toString(a));

        System.out.println("Original string array : "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Sorted string array : "+Arrays.toString(b));
    }
}
