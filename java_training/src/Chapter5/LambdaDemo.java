package Chapter5;

public class LambdaDemo {
    public static void main(String[] args) {
        Message msg = () -> System.out.println("Hello Lambda");
        msg.printable();

        Alert danger = (name) -> "Danger " + name;
        String txt = danger.alert("John Doe");
        System.out.println(txt);
    }
}

@FunctionalInterface //Annotation to limit the interface to one method. Lambda can only use interface with 1 method.
interface Message{
    public void printable();
}

@FunctionalInterface
interface Alert{
    public String alert(String str);
}
