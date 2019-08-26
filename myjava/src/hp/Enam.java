package hp;

import java.util.concurrent.Callable;

public class Enam {
    public static void main(String args[]) {
        Days d = Days.MONDAY;
        System.out.println(d);
        Days d1=Days.TUESDAY;
        System.out.println(d1);
        Days d2=Days.WEDNESDAY;
        System.out.println(d2);
    }
    enum Days
    {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATERDAY,SUNDAY;
    }
}
