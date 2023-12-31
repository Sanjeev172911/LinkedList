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

    public void delete(T data){
        int ind=search(data);

        if(ind<0){
            System.out.println("Node is not present in LinkedList");
            return;
        }

        deleteViaInd(ind);
    }

    public void deleteViaInd(int position){
        if(isEmpty() || position<0){
            System.out.println("Node cannot be deleted");
            return;
        }else if(position==0){
            head=head.next;
        }else{
            Node<T>temp=head;
            Node<T>prev=null;
            int iniPos=0;

            while(iniPos<position){
                prev=temp;
                temp=temp.next;
                iniPos++;
            }

            prev.next=temp.next;
        }
    }

    public int search(T data){
        if(isEmpty()){
            System.out.println("LinkedList is empty so Value cannot be searched");
        }
        int ind=0;
        Node<T>temp=head;
        while(temp!=null){
            if(temp.data==data){
                return ind;
            }

            ind++;
            temp=temp.next;
        }

        return -1;
    }

    public void orderList(){

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
