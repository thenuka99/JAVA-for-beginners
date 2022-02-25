//----- Lab05 -----
// Q01 - a
/*
package Lab05;

public class PC {

    void typesOfPC(){
        System.out.println("There are two different personal computers named as Desktops and Laptops");
    }
}

class Desktop extends PC{

     void typesOfDesktop(){
         System.out.println("Desktop computers fall into three main families named as Tower, Compact and All-in-one");
     }
}

class testSingleInheritance {
    public static void main(String[] args) {
            Desktop d = new Desktop();
            d.typesOfPC();
            d.typesOfDesktop();
    }
}
*/

//----- Lab05 -----
// Q01 - b

/*
package Lab05;

public class PC {

    void typesOfPC(){
        System.out.println("There are two different personal computers named as Desktops and Laptops");
    }
}

class Desktop extends PC{

    void typesOfDesktop(){
        System.out.println("Desktop computers fall into three main families named as Tower, Compact and All-in-one");
    }
}

class Laptop extends PC{

    void typesOfLaptop(){
        System.out.println("There are different Laptops named as Notebook, Macbook, Ultrabook, Tablet etc.");
    }
}

class testHierarchicalInheritance {
    public static void main(String[] args) {
        Desktop d = new Desktop();
        Laptop l = new Laptop();

        d.typesOfPC();
        d.typesOfDesktop();

        l.typesOfPC();
        l.typesOfLaptop();
    }
}
*/

//----- Lab05 -----
// Q01 - c
package Lab05;

public class PC {

    void typesOfPC(){
        System.out.println("There are two different personal computers named as Desktops and Laptops");
    }
}

class Laptop extends PC{

    void typesOfLaptop(){
        System.out.println("There are different Laptops named as Notebook, Macbook, Ultrabook, Tablet etc.");
    }
}

class Tablet extends Laptop{

    void typesOfTablets(){
        System.out.println("There are different tablets named as Convertible tablets, hybrid tablets and rugged tablets");
    }
}

class testMultilevelInheritance{

    public static void main(String[] args) {
        Tablet t = new Tablet();

        t.typesOfPC();
        t.typesOfLaptop();
        t.typesOfTablets();
    }
}