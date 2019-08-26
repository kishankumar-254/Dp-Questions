package recursion;

public class PrintNumSer {
    public static void main(String[] args) {

//PrintNum(10);
        System.out.println("total cat eyes is" +power(4,3 ));

    }

    /* public static void PrintNum(int num) {
         if (num == 0) {
             return;
         } else {
             System.out.println(num);
             PrintNum(num - 1);
         }
     }
         public static int catEyes(int cat )
         {
             if(cat==0) {
                 return 0;
             }
             else
             {
                 return 2+catEyes(cat-1);
         }
     }*/
    public static int power(int base, int num) {
        if (num == 1)
        {
            return base;
        }
        else {
            return base*power(base,num-1);
        }

        }

        }


