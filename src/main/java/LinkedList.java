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

    void addRear(T data){
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

    void insert(int position,T data){
       Node<T>newNode=new Node(data);

       if(position<0 || position>size()){
           System.out.println("Cannot Insert as its not a valid position");
           return;
       }else if(position==0){
           if(head==null) head=newNode;
           else{
               newNode.next=head;
               head=newNode;
           }
       }else{
           Node<T> temp=head;
           for(int i=0;i<position-1;i++){
               temp=temp.next;
           }

           newNode.next=temp.next;
           temp.next=newNode;
       }
    }

    public void deleteFront(){
        if(isEmpty()){
            System.out.println("LinkedList is Empty");
            return;
        }
        head=head.next;
    }

    public void deleteRear(){
        if(isEmpty()){
            System.out.println("Linked List is Empty");
            return ;
        }else if(head.next==null){
            head=null;
        }else{
            Node<T>temp=head;
            Node<T>prev=head;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }

            prev.next=null;
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
