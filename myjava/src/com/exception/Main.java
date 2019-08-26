package com.exception;

public class Main {
    public static void main(String[] args) {
        Employee first=new Employee("raj","kumar",001);
        Employee second=new Employee("Mahesh","Kapoor",002);
        Employee third=new Employee("Adarsh","Seth",003);

        EmpLinkedList list=new EmpLinkedList();
        list.add(first);
        list.add(second);
        list.add(third);
        list.printList();
    }
}
