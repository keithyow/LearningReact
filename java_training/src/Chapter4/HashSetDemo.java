package Chapter4;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        new HashSetDemo().demo1();
        new HashSetDemo().demo2();
    }

    public void demo1(){
        Integer[] myArray = new Integer[]{3, 25, 2, 79, 2};
        Set<Integer> mySet = new HashSet<>(Arrays.asList(myArray));
        mySet.add(19);
        mySet.remove(19);
        mySet.clear();
        System.out.println(mySet);
    }

    public void demo2(){
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(12);
        System.out.println(mySet);
    }
}
