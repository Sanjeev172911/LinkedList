public class LinkedList<T> {
    Node<T> head;

    LinkedList(){
        head=null;
    }

    boolean isEmpty(){
        return head==null;
    }

    int size(){
        int cnt=0;
        Node<T>temp=head;

        while(temp!=null){
            cnt++;
            temp=temp.next;
        }

        return cnt;
    }

    void add(T data){
        if(head==null){
            head=new Node(data);
            return ;
        }
        Node<T>temp=head;
        Node<T> newNode=new Node(data);

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
    }

    void addFront(T data){
        Node<T> newNode=new Node(data);

        if(head==null) head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void Display() {
        Node<T> temp=head;

        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null) System.out.print(" -> ");
            temp=temp.next;
        }

        System.out.println();
    }
}
