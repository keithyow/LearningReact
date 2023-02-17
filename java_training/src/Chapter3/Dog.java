package Chapter3;

public class Dog extends Animal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.species = "Shiba Inu";
        System.out.println("Dog species is " + dog.getSpecies());
    }
}
