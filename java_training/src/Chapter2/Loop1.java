package Chapter2;

public class Loop1 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println("i = " + i);
        }

        System.out.println("\n");

        for(int i = 0; i < 10; i+=2){
            System.out.println("i = " + i);
        }

        System.out.println("\n");

        String[] name  = {"John", "Doe", "Labu"};

        for(String pname: name){
            System.out.println(pname);
        }


        // While loops
        int num = 1;
        while (num < 5){
            System.out.println("Number = " + num);
            num++;
        }

        num =1;
        while(num <5){
            System.out.println("Number = " + num);
            if (num == 3){
                break;
            }
            num++;
        }

        System.out.println("===============================");
        num =1;
        while(num < 10){

            if (num %2 == 0){

                num++;
                continue;
            }
            System.out.println("Number = " + num);

            num++;
        }



        // Do-While loop (Unlike while loop which may not run the code nested within,
        // do-while would at least run once)
        num = 10;
        do {
            System.out.println(num);
            num ++;
        } while (num < 5);


    }
}
