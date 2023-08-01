package III.Collections;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(9);
//        list.add(10);
//
//        System.out.println("List trước khi xóa :");
//        list.printList();
//        System.out.println(list.size());
//        list.remove(1);
//        System.out.println(list.size());
//
//        list.printList();

        MyLinkedList<Integer> myLinkedList = new MyLinkedList();

        myLinkedList.addFront(3);
        myLinkedList.addFront(2);
        myLinkedList.addFront(1);

        myLinkedList.printForward(); // Output: 1 2 3
        myLinkedList.printBackward(); // Output: 3 2 1

        myLinkedList.addEnd(4);
        myLinkedList.addEnd(5);

        myLinkedList.printForward(); // Output: 1 2 3 4 5
        myLinkedList.printBackward(); // Output: 5 4 3 2 1

        myLinkedList.removeFront();
        myLinkedList.removeEnd();

        myLinkedList.printForward(); // Output: 2 3 4
        myLinkedList.printBackward(); // Output: 4 3 2

        myLinkedList.add(1,10);
        myLinkedList.printForward();
        System.out.println(myLinkedList.size());
    }
}
