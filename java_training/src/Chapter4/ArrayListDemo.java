package Chapter4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        new ArrayListDemo().demo1();
    }

    public void demo1(){
        List<Integer> list = new ArrayList<>();
        list.add(35);
        list.add(1);
        list.add(5);
        list.add(59);
        list.add(20);
        Collections.sort(list);
        System.out.println(list);

    }
}
