//----- Lab06 -----
// Q02
package Lab06;

//Inner Classes
public class OuterClass {

    private int num = 1000;

    class InnerClass {

        void nestedNum() {
            System.out.println(num + " value from Nested Inner class");
        }
    }
}

//Method Local Class
class MethodLocalClass {
    void outerMethod() {
        System.out.println("Inside the outerMethod in the MethodLocalClass");

        class InnerMethodLocalClass {
            void innerMethod() {
                System.out.println("Inside the innerMethod in the InnerMethodLocalClass");
            }
        }

        InnerMethodLocalClass imlc = new InnerMethodLocalClass();
        imlc.innerMethod();
    }
}

//Anonymous Inner Class
abstract class AnnonymousInnerClass {
    abstract void annonymousPrint();
}

class TestClass {

    public static void main(String[] args) {
        //Inner Class
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ocin = oc.new InnerClass();

        ocin.nestedNum();

        //Method Local Class
        MethodLocalClass mlc = new MethodLocalClass();
        mlc.outerMethod();

        //Anonymous Inner Class
        AnnonymousInnerClass aic = new AnnonymousInnerClass() {
            @Override
            void annonymousPrint() {
                System.out.println("Inside the anonymousPrint in the AnonymousInnerClass");
            }
        };
        aic.annonymousPrint();
    }
}