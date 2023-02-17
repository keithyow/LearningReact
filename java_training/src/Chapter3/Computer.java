package Chapter3;

public class Computer {
    double cpuSpeed;

    public Computer() {
        cpuSpeed = 3.4;
        System.out.println("Im in the constructor");
    }
    // constructor that takes one input argument
    public Computer(double speed){
        cpuSpeed = speed;
    }

    void setCpuSpeed(double cpuSpeed){
        this.cpuSpeed = cpuSpeed;
    }

    public static void main(String[] args) {
        Computer comp1 = new Computer();
        Computer comp2 = new Computer();
        Computer comp3 = new Computer(8.0);


        System.out.println("Comp1 CPU Speed = " + comp1.cpuSpeed);

        System.out.println("Comp2 CPU Speed = " + comp2.cpuSpeed);

        System.out.println("Comp3 CPU Speed = " + comp3.cpuSpeed);
    }
}
