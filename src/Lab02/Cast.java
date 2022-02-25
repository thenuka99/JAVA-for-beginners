//----- Lab02 -----
// Q03

package Lab02;

/*
    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte

* */
public class Cast {

    public static void main(String[] args) {
        int X = 5;
        double Y = 10.5;

        //Convert X value in to double
        double X_to_Int = X;
        System.out.println("Convert X value into double: " + X_to_Int);

        //Convert X value in to long
        long X_to_Long = X;
        System.out.println("Convert X value into long: " + X_to_Long);

        //Convert X value in to float
        float X_to_float = X;
        System.out.println("Convert X value into float: " + X_to_float);

        //Use the value which after converting to long in step 2 and convert the long value to float
        float Long_to_Float = X_to_Long;
        System.out.println("Convert X Long to Float: " + Long_to_Float);

        //Convert Y value to int
        int Y_to_Int = (int) Y;
        System.out.println("Convert Y to int: " + Y_to_Int);

        //Convert Y value in to long
        long Y_to_Long = (long) Y;
        System.out.println("Convert Y to long: " + Y_to_Long);
    }
}
