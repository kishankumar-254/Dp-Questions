package com.collect;

import java.util.ArrayList;

public class Collect_2 {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();
        l.add("Ram");
        l.add("Shyam");
        l.add("Meera");
        l.add("Raman");
        l.add(3,"Ram");
        l.remove(2);
        System.out.println(l);
    }

}
