public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        System.out.println("Is list Empty : "+list.isEmpty());

        list.addRear(56);
        list.addRear(70);
        list.addRear(80);
        list.addRear(90);

        list.Display();
        list.insert(4,30);
        list.Display();

        System.out.println("Is list Empty : "+list.isEmpty());
    }
}
