//----- Lab04 -----
// Q03
package Lab04;

import java.util.Scanner;

public class L4Q3 {

    public static void main(String[] args) {
        String[] names = {"Harry", "Hermione", "Draco", "Ginny", "Albus"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String word = scan.nextLine();


        for (int i = 0; i < names.length; i++) {
            if (names[i].compareTo(word) == 0) {
                System.out.println(word + " is included in the array!");
                break;
            } else {
                if (i == names.length - 1) {
                    System.out.println(word + " is not included in the array!");
                }
            }

        }

    }
}
