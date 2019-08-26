package com.linklist;
class NodeList{
    int data;
    NodeList next;
    NodeList(int data){
        this.data=data;
        this.next = null;
    }

}

public class SingleList {
    NodeList head;

    public static void main(String[] args) {
        SingleList singleList=new SingleList();
        //System.out.println(singleList.head);
        singleList.insertAtFirst(4);
        singleList.insertAtFirst(5);
        singleList.insertAtFirst(7);
        //singleList.deleteFirst(singleList);
        singleList.traverse();

    }
    public void insertAtFirst(int data){
        NodeList tmp = new NodeList(data);
        if(head == null){
            head = tmp;
        }else{
            tmp.next = head;
            head = tmp;
        }
    }

    public void deleteFirst(SingleList singleList){
        singleList.head = singleList.head.next;
    }
    public void traverse(){
        NodeList node=head;
        System.out.print("Head" + " => ");
        while (node!=null)
        {
            System.out.print(node.data +" ");
            node=node.next;
        }
    }
}
