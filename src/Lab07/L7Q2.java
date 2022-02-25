//----- Lab07 -----
// Q02
package Lab07;

public class L7Q2 {

    public static void main(String[] args) {
        DemoDirection  d = new DemoDirection(Direction.EAST);
        d.displayDirection();
    }
}

enum Direction {
    NORTH, EAST, SOUTH, WEST
}

class DemoDirection {
    Direction direction;

    DemoDirection(Direction d) {
        this.direction = d;
    }

    void displayDirection() {

        if (this.direction == Direction.NORTH) {
            System.out.println("Direction is North!");
        }
        if (this.direction == Direction.EAST) {
            System.out.println("Direction is East!");
        }
        if (this.direction == Direction.SOUTH) {
            System.out.println("Direction is South!");
        }
        if (this.direction == Direction.WEST) {
            System.out.println("Direction is West!");
        }


    }

}