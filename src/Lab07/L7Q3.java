//----- Lab07 -----
// Q03
package Lab07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L7Q3 {
    public static void main(String[] args) {
        String regEx = "[a-zA-Z0-9]{5}";
        String value = "Andre";

        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(value);

        int count = 1;

        while (m.find()) {
            System.out.println("Match Count: " + count);
            System.out.println("Start " + m.start());
            System.out.println("End " + m.end());
            System.out.println("Match: " + m.group());
            count++;
        }

        //Pattern Matches
        boolean b1 = Pattern.matches(regEx, value);
        //String Matches
        boolean b2 = value.matches(regEx);


        if (b1) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }
    }
}
