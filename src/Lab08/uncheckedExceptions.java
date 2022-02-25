//----- Lab08 -----
// Q02
package Lab08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class uncheckedExceptions {

    public static void main(String[] args) {
        int num1, num2;
        num1 = 12;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Num2: ");
        num2 = scan.nextInt();

        try{
            double answer = num1/num2;
            System.out.println("The result after dividing 12 by 2 is 6 . No exception occurred.");
        }
        //Arithmetic Exception
        catch (ArithmeticException e){
            System.out.println("Error!Division by zero");
        }
        //Input Mismatch Exception
        catch (InputMismatchException e){
            System.out.println("Input mismatched!");
        }
        //General Exception
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
