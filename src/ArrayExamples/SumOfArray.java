package ArrayExamples;

public class SumOfArray {
    public static void main(String[] args) {

        int[] array = {2, 3, 1, 5, 4};
        int sum = 0;

        for(int i = 0; i<array.length; i++){
          sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
