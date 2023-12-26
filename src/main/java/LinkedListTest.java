public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        System.out.println("Is list Empty : "+list.isEmpty());

        list.addRear(56);

        list.addRear(70);

        list.Display();
        list.insert(1,30);

        System.out.println("After Insertion : ");
        list.Display();

        System.out.println("After Deletion in Rear");
        list.deleteRear();
        list.Display();


        System.out.println("Is list Empty : "+list.isEmpty());
    }
}
