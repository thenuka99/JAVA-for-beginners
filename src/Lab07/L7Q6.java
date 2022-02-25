//----- Lab07 -----
// Q05
package Lab07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L7Q6 {
    public static void main(String[] args) {
        String regEx = "([a-z])([a-z]*)";
        String input = "sample java input string";

        Pattern p = Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);

        StringBuffer sb = new StringBuffer();

        while (m.find()){
            m.appendReplacement(sb,m.group(1).toUpperCase()+m.group(2).toLowerCase());
        }

        System.out.println("Input: "+input);
        System.out.println("Output: "+sb.toString());

    }
}


