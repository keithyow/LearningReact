package Chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("school");
        Matcher matcher = pattern.matcher("Visit my school");
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("yes match");
        }else
            System.out.println("no match");
    }
}
