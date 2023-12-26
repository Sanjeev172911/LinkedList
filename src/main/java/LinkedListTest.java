public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        System.out.println("Is list Empty : "+list.isEmpty());

        list.add(56);
        list.add(30);
        list.add(70);

        list.Display();

        System.out.println("Is list Empty : "+list.isEmpty());


    }
}
