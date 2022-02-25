//----- Lab07 -----
// Q01
package Lab07;

public class L7Q1 {

    public static void main(String[] args) {
        Pizza pizza = new Pizza(Size.SMALL);
        pizza.orderPizza();
    }
}

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Pizza {

    Size pizzaSize;

    public Pizza(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza() {
        switch (pizzaSize) {

            case SMALL:
                System.out.println("I ordered a small sized pizza");
                break;

            case MEDIUM:
                System.out.println("I ordered a Medium sized pizza");
                break;
            case LARGE:
                System.out.println("I ordered a Large sized pizza");
                break;

            case EXTRALARGE:
                System.out.println("I ordered a Extra Large sized pizza");
                break;

            default:
                System.out.println("Invalid Order Size");

        }
    }
}