public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        System.out.println("Is list Empty : "+list.isEmpty());

        list.addRear(56);
        list.insert(1,30);
        list.addRear(70);

        list.Display();

        System.out.println("Position of 30 is "+list.search(30));

        
        System.out.println("Is list Empty : "+list.isEmpty());
    }
}
