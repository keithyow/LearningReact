package Chapter3;

public class BullDog extends Dog{
    public String getName(){
        return "Name: " + name;
    }

//    public int getLegs(){
//        return 0;
//    }
//    cannot override final method

    public static void main(String[] args) {
        BullDog dog = new BullDog();
        dog.name = "Bull Dog";
        System.out.println(dog.getName());
    }
}
