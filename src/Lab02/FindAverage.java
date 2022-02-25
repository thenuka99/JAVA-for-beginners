//----- Lab02 -----
// Q02

package Lab02;

public class FindAverage {

    public static void main(String[] args) {
        double X = 10;
        double Y = 5;
        double Z = 15;

        calcAverage(X, Y, Z);
    }

    static void calcAverage(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.println("Average: " + average);
    }

}
