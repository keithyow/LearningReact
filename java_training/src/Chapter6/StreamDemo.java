package Chapter6;

import java.util.stream.Stream;
public class StreamDemo {
    public static void main(String[] args) {
        //filter - take a subset of data
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter((i) -> i>3)
                .forEach(System.out::println);

        //map - operate on each data
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .map((num) -> num >3 )
                .forEach((i) -> System.out.println(i));

        //sorted
        Stream.of(1,72,23,44,15,64,7,48,69,10)
                .sorted()
                .forEach((i) -> System.out.println(i));

        //descending sort
        Stream.of(1,72,23,44,15,64,7,48,69,10)
                .sorted((no1, no2) -> no2.compareTo(no1))
                .forEach((i) -> System.out.println(i));

        //reduce - aggregate value
        int sum = Stream.of(1,2,3,4,5)
                .reduce(0, (no1, no2) -> no1+no2);
        System.out.println(sum);
    }
}
