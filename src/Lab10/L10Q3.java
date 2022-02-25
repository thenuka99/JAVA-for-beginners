//----- Lab10 -----
// Q03
package Lab10;

import java.io.File;

public class L10Q3 {

    public static void main(String[] args) {
        File f = new File("D:\\Moratuwa IT\\IN 2100 - Object-Oriented Programming\\Lab Sheets");

        String[] files = f.list();
        String fileName = "Exception";

        for (String s : files) {
            if(s.toLowerCase().contains(fileName.toLowerCase())){
                System.out.println("Your File is Found!");
                System.out.println(s);
                return;
            }
        }
        System.out.println("Your File is Not Found!");
    }
}
