package ArrayExamples;

public class FindMaxAndMinNumFromArray {

    public static void main(String[] args) {

        int[] array = {2, 3, 1, 5, 4};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
               max = array[i] ;
            }
        }
        System.out.println("max is " + max);


        for(int i = 0; i< array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("min is " + min);
    }
}
