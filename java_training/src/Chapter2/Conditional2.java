package Chapter2;

public class Conditional2 {
    public static void main(String[] args) {
        // Example without Ternary Operator
        int x = 5;
        String result = "";
        if(x >100) {
            result = ">100";
        }else {
            result = "<100";
        }

        System.out.println("Result = " + result);

        //Ternary Operator
        result = (x > 100) ? ">100" : "<100";
        System.out.println("Result 2 = " + result);

    }
}
