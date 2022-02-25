//----- Lab05 -----
// Q05
package Lab05;

public class Triangle {

    void calcArea(double base,double height){
        double area =  0.5 * base * height;
        System.out.println("Area of Triangle (Basic Method) : "+area);
    }

    void calcArea(double a,double b,double c){
        double s =  (a+b+c)/2;
        double area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle (Heron Formulae): "+area);

    }

    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.calcArea(4,5);
        t.calcArea(5,4,7);
    }
}
