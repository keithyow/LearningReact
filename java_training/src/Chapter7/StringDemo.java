package Chapter7;

public class StringDemo {
    public static void main(String[] args) {
        // String is immutable (cannot change)
        String str = "my name is azman";
        String str2 = str.toUpperCase();
        String str3 = str.substring(11);
        System.out.printf("str = %s, str2 = %s, str3 = %s", str, str2, str3);


        //concat
        String s1 = "my name ";
        String s2 = "azman";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        //search
        String sentence = "Hello Java Reader, how are you?";
        boolean isAvail = sentence.toLowerCase().contains("java");
        if(isAvail){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        //replace
        String s4 = sentence.replace("Java", "Jawa");
        System.out.println(s4);

        String[] arr = sentence.split("\\s+");
        for(String word : arr){
            System.out.println(word);
        }
    }
}
