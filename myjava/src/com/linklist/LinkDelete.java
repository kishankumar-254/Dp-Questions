package com.linklist;

class Delete{
    int data;
    Delete next;
    Delete(int data){
        this.data=data;
        this.next = null;
    }
}
public class LinkDelete {
    Delete head;
    public static void main(String[] args) {
        LinkDelete linkDelete=new LinkDelete();
        linkDelete.head=new Delete(4);
        linkDelete.head.next=new Delete(6);
        linkDelete.head.next.next=new Delete(7);
        linkDelete.traverse();
        System.out.println();
        linkDelete.NodeDelete(linkDelete,6);
    }
    public void NodeDelete(LinkDelete linkDelete,int pData){
        linkDelete.head = linkDelete.head.next;
    }
    public void traverse(){
        Delete node=head;
        while (node!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
    }



}
