//----- Lab10 -----
// Q02
package Lab10;

import java.io.File;

public class L10Q2 {

    public static void main(String[] args) {
        File f = new File("D:\\Moratuwa IT\\IN 2100 - Object-Oriented Programming\\Lab Sheets");

        String[] files = f.list();
        String extention = "pdf";

        for (String s : files) {
            if(s.toLowerCase().endsWith(extention)){
                System.out.println(s);
            }
        }
    }
}
