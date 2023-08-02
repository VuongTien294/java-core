package III.Collections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollections {
    private static void in(List<Double> list){
        for (Double element : list) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {

        //Phương thức Collections.max() được sử dụng để trả về phần tử max của bộ sưu tập đã cho, theo thứ tự được sắp xếp bởi comparator được chỉ định
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");

        Collections.addAll(list, "Servlet", "JSP");

        System.out.println("Max :" +Collections.max(list));
        System.out.println("Min = " + Collections.min(list));

        for (String element : list) {
            System.out.println(element);
        }

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(46);
        list2.add(67);
        list2.add(24);
        list2.add(16);
        list2.add(8);
        list2.add(12);
        list2.add(67);
        System.out.println("Max = " + Collections.max(list2));
        System.out.println("Min = " + Collections.min(list2));

    }
}
