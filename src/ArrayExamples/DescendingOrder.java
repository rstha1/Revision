package ArrayExamples;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] array = {2, 3, 1, 5, 4};
        int num;

        for (int i = 0; i < array.length; i++){
            for(int j = i+1; j< array.length; j++){
                if(array[i] < array[j]) {
                    num = array[i];
                    array[i] = array[j];
                    array[j]= num;
                }
            }
        }

        for(int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
