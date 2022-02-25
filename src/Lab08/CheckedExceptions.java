//----- Lab08 -----
// Q01
package Lab08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CheckedExceptions {

    public static void main(String[] args) {
        FileInputStream f;

        try {
            f = new FileInputStream("D:/Moratuwa IT/IN 2100 - Object-Oriented Programming/Lab08/src/myfile.txt");
            System.out.println("File Found!");

            try {
                int c;

                while ((c = f.read()) != -1) {
                    System.out.print((char) c);
                }
                f.close();
            }catch (IOException e){
                System.out.println("I/O Error Occurred!");
            }


        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
    }
}
