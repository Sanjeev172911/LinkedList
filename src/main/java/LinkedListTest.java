public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        System.out.println("Is list Empty : "+list.isEmpty());

        list.addRear(56);
        list.addRear(30);
        list.addRear(70);

        list.Display();

        System.out.println("Is list Empty : "+list.isEmpty());
    }
}
