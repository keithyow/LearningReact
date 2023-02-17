package Chapter4;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] text = new String[] {"spam", "more", "buy"};
        Integer[] age = new Integer[] {1,2,3,4};
        int[] num = {1,2,3,4};
        int[] salary = new int[3];
        salary[0] = 1000;
        salary[1] = 2000;
        salary[2] = 3000;
//        salary[3] = 4000;

        System.out.println("text = " + text[2]);
    }
}
