package Chapter5;

import java.util.List;
import java.util.ArrayList;

public class LambdaDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("John Doe");
        list.add("Lee");
        list.add("Abu");
        list.add("Vasan");
        list.add("Vivian");
        list.forEach((name) -> System.out.println(name));


    }
}
