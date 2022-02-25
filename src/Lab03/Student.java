//----- Lab03 -----
// Q01

package Lab03;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        String FirstName;
        String LastName;
        double Weight;
        double Height;
        double BMI;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        FirstName = scan.nextLine();

        System.out.print("Enter Last Name: ");
        LastName = scan.nextLine();

        System.out.print("Enter Height(m): ");
        Height = scan.nextDouble();

        System.out.print("Enter Weight(kg): ");
        Weight = scan.nextDouble();
        BMI = Weight / (Height * Height);

        System.out.println("Name: " + getFullName(FirstName, LastName));
        System.out.println("Height(m): " + Height);
        System.out.println("Weight(kg): " + Weight);
        System.out.println("BMI: " + BMI);

    }

    static String getFullName(String fName, String lName) {
        return fName.concat(" " + lName);
    }


}
