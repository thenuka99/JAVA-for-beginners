//----- Lab07 -----
// Q05
package Lab07;

public class L7Q5 {
    public static void main(String[] args) {
        String regEx = "[a-zA-Z0-9]+@[a-zA-Z0-9]+[.][a-zA-Z0-9]+";
        String input = "abc@domain.com";

        boolean b = input.matches(regEx);

        if (b) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }
    }
}
