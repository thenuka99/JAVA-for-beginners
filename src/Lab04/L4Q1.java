//----- Lab04 -----
// Q01
package Lab04;

public class L4Q1 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < i; j++) {
                if (num[j] < num[i]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
