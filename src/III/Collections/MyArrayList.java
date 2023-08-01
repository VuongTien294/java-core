package III.Collections;

import java.util.Arrays;

public class MyArrayList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList(){
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(E element){
        if(size == elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }

    //Hàm tăng kích thước danh sách tĩnh khi cần thiết
    private void ensureCapacity(){
        int newCapacity = elements.length * 2 ;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    //Dùng cái SupperWarning này để tắt cảnh báo khi ta cast thành (E) như bên dưới
    @SuppressWarnings("unchecked")
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: "+ index + ", Size :" + size);
        }
        return (E) elements[index];
    }

    //Phương thức lấy số lượng phần tử trong danh sách
    public int size(){
        return size;
    }

    //Phương thức check xem danh sách có bị trông không
    public boolean isEmpty(){
        //Nếu size == 0 sẽ trả về true
        return size == 0;
    }

    //Phương thức xóa 1 phần tử trong danh sách
    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: "+ index + ", Size :" + size);
        }
        for(int i = index; i < size - 1 ;i++){
            elements[i] = elements[i + 1];
        }
        elements[size--] = null;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }


}
