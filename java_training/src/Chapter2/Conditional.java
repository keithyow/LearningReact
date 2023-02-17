package Chapter2;

public class Conditional {
    public static void main(String[] args) {

        //first conditional
        float credit = 7000.00f;

        if(credit >= 6000.00f){
            System.out.println("Enough credit");
        }else{
            System.out.println("You're broke mate");
        }

        //second conditional
        if(true){
            System.out.println("Always true");
        }


        //third conditional
        int num = 100;
        if(num < 10){
            System.out.println("< 10");
        }else if (num >= 10 && num <50){
            System.out.println("Between 10 and 50");
        }else{
            System.out.println("Greater than 50");
        }


        // Comparison

        // == is an operator that returns true if the contents being compared refer to the same memory or false if
        // they don't. If two strings compared with == refer to the same string memory, the return value is true;
        // if not, it is false.

        String name = "John";
        if(name.equals("John")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
