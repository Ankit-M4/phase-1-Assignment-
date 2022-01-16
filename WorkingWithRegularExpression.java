package Assignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingWithRegularExpression {
    public static void main(String[]args){
        String stringToSearch = "hii Ankit mishra how are you ...";

        Pattern p = Pattern.compile("Ankit");   // the pattern to search for
        Matcher m = p.matcher(stringToSearch);
        if (m.find())
            System.out.println("Found a match");
        else
            System.out.println("Did not find a match");
    }
}


