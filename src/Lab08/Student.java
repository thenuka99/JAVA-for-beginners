//----- Lab08 -----
// Q03
package Lab08;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        int attendance,marks;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Attendance: ");
        attendance = scan.nextInt();

        System.out.print("Enter Marks: ");
        marks = scan.nextInt();

        Student s = new Student();

        try{
        s.checkEligibility(attendance,marks);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    void checkEligibility(int attendance,int marks) throws  Exception{
        if(attendance<80 && marks <40){
            throw new Exception("You are not eligible for final examination");
        }
        if(attendance>80 && marks>40)
        {
            System.out.println("Congratulations . You are eligible for final examination");
        }
    }
}
