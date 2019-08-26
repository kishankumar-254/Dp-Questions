package queue;

public class QbyList {
    int data;
    QbyList next;
    QbyList(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    QbyList head;
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(queue.head,5);
        queue.enQueue(queue.head,6);
        queue.enQueue(queue.head,8);
        queue.traverse(queue.head);
        //deQueue();

    }
    public   void enQueue(QbyList head,int data){
        QbyList cur=head;
        if(head==null){

            head=new QbyList(data);
        }
        else
        {
           while(cur.next!=null){
               cur=cur.next;
           }
           cur.next=new QbyList(data);
        }

    }
    public  void deQueue(){
        QbyList cur=head;
        if(cur==null){
            System.out.println("Queue is Empty:");
        }
        else{
            System.out.println(head.data);
            head=head.next;
        }
    }
    public  static void traverse(QbyList head){
        QbyList tmp=head;
        while (tmp!=null) {
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
    }
}
