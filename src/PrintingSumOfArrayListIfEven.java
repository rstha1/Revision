import java.util.ArrayList;

public class PrintingSumOfArrayListIfEven {

     int sum;
     ArrayList<Integer> array3 = new ArrayList();

    public ArrayList<Integer> PrintingSumOfArrayListIfEven() {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 6, 8, 10};

        for (int i = 0; i < array1.length; i++) {
                sum = array1[i] + array2[i];
                if (sum % 2 == 0) {
                    array3.add(sum);
                }
        }
        return array3;
    }
}







