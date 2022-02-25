//----- Lab06 -----
// Q01
package Lab06;

public class ScientificCalc {

    int x, y;

    ScientificCalc() {
        this.x = 3;
        this.y = 4;
        System.out.println("This is the default constructor of Scientific Calculator");
    }

    ScientificCalc(int x) {
        this();
        this.x = x;
        System.out.println("This is the single-parameter constructor of Scientific Calculator");
    }

    ScientificCalc(int x, int y) {
        this(x);
        this.y = y;
        System.out.println("This is the two-parameter constructor of Scientific Calculator");
    }

}

class ClassicCalc extends ScientificCalc {

    int a, b;

    ClassicCalc() {
        this.a = 1;
        this.b = 2;
        System.out.println("This is the default constructor of Classic Calculator");
    }

    ClassicCalc(int a) {
        this();
        this.a = a;
        System.out.println("This is the single-parameter constructor of Classic Calculator");
    }

    ClassicCalc(int a, int b) {
        super(a, b);
        this.a = a;
        this.b = b;
        System.out.println("This is the two-parameter constructor of Classic Calculator");
    }
}

class DemoCalc {

    public static void main(String[] args) {
        ScientificCalc sc = new ScientificCalc(10, 20);
        ClassicCalc cc1 = new ClassicCalc(5);
        ClassicCalc cc2 = new ClassicCalc(7, 8);
    }
}