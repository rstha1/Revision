public class PrintingCommonNumbersInArray {

    public static void main(String[] args) {


    int[] array1 = {1,2,3,5,7};
    int[] array2 = {1,3,5,6,8};

     for (int i = 0; i < array1.length; i++){
         for(int j=0; j < array2.length; j++){
             if(array1[i] == array2[j]){
                 System.out.println(array1[i]);
             }
         }
    }

    }


}
