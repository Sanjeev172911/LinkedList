public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("Is list Empty : "+list.isEmpty());

        list.add(56);
        list.insert(1,30);
        list.add(70);

        list.Display();
        int ind=list.search(30);

        System.out.println("Position of 30 is "+ind);

        list.insert(ind+1,40);
        list.Display();

        list.delete(40);
        list.Display();

        System.out.println("Is list Empty : "+list.isEmpty());
        OrderLinkedList<Integer>orderedList=new OrderLinkedList<>();

        orderedList.add(56);
        orderedList.add(30);
        orderedList.add(40);
        orderedList.add(70);

        orderedList.Display();
        
    }
}
