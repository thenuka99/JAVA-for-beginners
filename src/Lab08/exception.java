//----- Lab08 -----
// Q04
package Lab08;

public class exception {

    public static void main(String[] args) {
        exception ex = new exception();

        double num1 = 23;
        double num2 = 8;

        try {
            ex.calculate(num1, num2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void calculate(double num1, double num2) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] nums = {1, 2, 3, 4, 5};
        if (num2 == 0) {
            throw new ArithmeticException("Dividing by Zero is not valid!");
        } else {

            int index = (int) (num1 / num2);
            if (index < 0 || index > 4) {
                throw new ArrayIndexOutOfBoundsException("Array out of bound!");
            } else {
                System.out.println(nums[index]);
            }
        }


    }
}
