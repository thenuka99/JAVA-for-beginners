//----- Lab04 -----
// Q02

package Lab04;


public class L4Q2 {

    public static void main(String[] args) {
        String[] names = {"Harry", "Hermione", "Draco", "Ginny", "Albus"};

        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < names.length; j++) {
                if (names[i].compareTo(names[j]) < 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
