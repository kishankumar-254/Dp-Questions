package com.exception;

public class EmpLinkedList {
    private Node head;
    public void add(Employee employee)
    {
        Node node=new Node(employee);
        node.setNext(head);
        head=node;
    }
public void printList(){
        Node current=head;
    System.out.print("Head-->");
    while (current!=null){
        System.out.print(current);
        System.out.print("-->");
        current=current.getNext();

    }
    System.out.println("null");
}
}
