//----- Lab07 -----
// Q04
package Lab07;

public class L7Q4 {

    public static void main(String[] args) {
        String regEx = "[567]{1}[0-9]{9}";
        String value = "5679203948";

        boolean b = value.matches(regEx);

        if (b) {
            System.out.println("Valid input!");
        } else {
            System.out.println("Invalid input!");
        }
    }


}
