package Lab10;

public class ArrayTest {
    public static void main(String[] args) {
        int [] array1={1,4,2,5,2,6};
        int [] array2={1,5};
        int [] array3={3,5,1,8,4};
        double[][] array4 ={{1.5,2.0,4.0},{4.5,1.5,2.0,2.5}};

//        for(int i=1; i<array1.length;i++){
//            try{
//                if (array1[i] != array2[1]){
//                    System.out.println(array3[i]);
//                    continue;
//                }
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("ArrayIndexOutOfBoundsException");
//            }
//        }
//        for(int i=0; i<array4.length;i++){
//            for(int j=0; j<array4[i].length;j++){
//                System.out.println(array4[i][j]);
//            }
//        }


        int i = 0;
        while(i < array4.length){
            int j = 0;
            while(j < array4[i].length){
                if(j%2==0){
                    System.out.println(array4[i][j]);
                }
                j++;
            }
            i++;
        }
    }
}
