public class SortingNumbersInAscOrder {
    public static void main(String[] args) {
        int[] numbers = {3,1,4,6,5,7};

        int newNum;

        for(int i = 0; i< numbers.length; i++){
            for(int j= i; j<numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    newNum = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = newNum;
                }
            }
        }
        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }

}
