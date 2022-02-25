//----- Lab08 -----
// Q05
package Lab08;

public class InvalidWeightException extends Exception {

    InvalidWeightException(String str){
        super(str);
    }
}

class L8Q5{
    void checkWeight(double weight) throws InvalidWeightException{
        if(weight<50){
            throw new InvalidWeightException("Your weight is less than 50. You cannot donate blood”");
        }else{
            System.out.println("You can donate blood");
        }

    }
}

class DemoL8Q5{

    public static void main(String[] args) {
        L8Q5 q =  new L8Q5();

        try {
            q.checkWeight(40);
        }catch (InvalidWeightException e){
            System.out.println(e.getMessage());
        }
        }
}