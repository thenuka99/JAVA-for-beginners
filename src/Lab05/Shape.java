//----- Lab05 -----
// Q02
package Lab05;

public abstract class Shape {

    abstract void getArea(double value);

    abstract void getPerimeter(double value);

}

class Circle extends Shape {

    @Override
    void getArea(double value) {
        double area = 3.14159 * value * value;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    void getPerimeter(double value) {
        double perimeter = 2 * 3.14159 * value;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

class Square extends Shape {

    @Override
    void getArea(double value) {
        double area = value * value;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void getPerimeter(double value) {
        double perimeter = 4 * value;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}

class TestShape {

    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();

        c.getArea(5);
        c.getPerimeter(5);

        s.getArea(4);
        s.getPerimeter(4);
    }
}