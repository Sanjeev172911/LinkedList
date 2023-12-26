public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        System.out.println("Is list Empty : "+list.isEmpty());

        list.addFront(70);
        list.addFront(30);
        list.addFront(56);

        list.Display();

        System.out.println("Is list Empty : "+list.isEmpty());


    }
}
