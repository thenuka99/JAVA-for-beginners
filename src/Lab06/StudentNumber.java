//----- Lab06 -----
// Practice Exercise
package Lab06;

import java.util.Scanner;

public interface StudentNumber {
    void numberPrint();
}

interface StudentName extends StudentNumber {
    void namePrint();
}

class StudentDetails implements StudentName {
    public static void main(String[] args) {
        StudentDetails s = new StudentDetails();
        s.namePrint();
        s.numberPrint();
    }

    @Override
    public void namePrint() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scan.nextLine();
        System.out.println("Student Name: " + name);
    }

    @Override
    public void numberPrint() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Number: ");
        int number = scan.nextInt();
        System.out.println("Student Number: " + number);
    }
}