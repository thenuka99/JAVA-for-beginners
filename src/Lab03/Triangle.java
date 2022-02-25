//----- Lab03 -----
// Q02

package Lab03;

import java.util.Scanner;

public class Triangle {

    int a, b, c;

    boolean triangleChecker(int A, int B, int C) {

        if (A + B > C && B + C > A && C + A > B) {
            return true;
        } else {
            return false;
        }
    }

    void getPerimeter(int A, int B, int C) {
        boolean isValid = triangleChecker(A, B, C);

        if (isValid) {
            System.out.println("Perimeter of the triangle: " + (A + B + C));
        } else {
            System.out.println("Triangle is Invalid!");
        }
    }
}

class TestTriangle {

    public static void main(String[] args) {
        Triangle t = new Triangle();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Side a: ");
        t.a = scan.nextInt();

        System.out.print("Enter Side b: ");
        t.b = scan.nextInt();

        System.out.print("Enter Side c: ");
        t.c = scan.nextInt();

        t.getPerimeter(t.a, t.b, t.c);

    }

}