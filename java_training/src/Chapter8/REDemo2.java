package Chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REDemo2 {
    public static void main(String[] args) {
        new REDemo2().validateIc("123456-12-1234");
        new REDemo2().validateIc("132");
    }

    public void validateIc(String ic){
        Pattern pattern = Pattern.compile("^[0-9]{6}-[0-9]{2}-[0-9]{4}");
        Matcher matcher = pattern.matcher(ic);
        if (matcher.find()){
            System.out.println("ic is valid");
        }else {
            System.out.println("ic is not valid");
        }
    }

}
