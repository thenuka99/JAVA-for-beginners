//----- Lab10 -----
// Q04
package Lab10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L10Q4 {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("D:\\Moratuwa IT\\IN 2100 - Object-Oriented Programming\\Practice\\Labs\\src\\Lab10\\myfile.txt");
            BufferedReader br = new BufferedReader(file);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Input Output Exception!");
        }


    }

}
