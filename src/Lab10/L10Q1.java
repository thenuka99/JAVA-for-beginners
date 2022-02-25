//----- Lab10 -----
// Q01
package Lab10;

import java.io.File;

public class L10Q1 {

    public static void main(String[] args) {
        File f = new File("D:\\Moratuwa IT\\IN 2100 - Object-Oriented Programming\\Lab Sheets");

        String[] files = f.list();

        for (String s : files) {
            System.out.println(s);
        }
    }
}
