package III.Collections.CustomCollection;

public class MyNode<E> {
    Object data;
    MyNode prev;
    MyNode next;

    public MyNode(E data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
