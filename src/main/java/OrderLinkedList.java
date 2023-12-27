import java.util.HashMap;
import java.util.Map;

public class OrderLinkedList <T extends Comparable<T>>  extends LinkedList<T>{
    @Override
    void add(T data){
        Node<T>newNode=new Node<>(data);
        if(isEmpty()){
            head=newNode;
        }else if(head.data.compareTo(data)>=0){
            newNode.next=head;
            head=newNode;
        }else{
            Node<T>temp=head;
            Node<T>prev=null;
            while(temp!=null && temp.data.compareTo(data)<=0){
                prev=temp;
                temp=temp.next;
            }

            prev.next=newNode;
            newNode.next=temp;
        }
    }
}
