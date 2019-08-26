package com.exception;
import java.util.*;
public class Collect_2 {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("Green");
        l.add("blue");
        l.add("red");
        l.add("white");
        l.add(0,"white");
        l.remove(3);
        for (String element: l)
        {
            System.out.println(element);
        }
    }
}
