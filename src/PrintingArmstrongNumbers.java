public class PrintingArmstrongNumbers {
    public static void main(String[] args) {

        PrintingArmstrongNumbers armstrong = new PrintingArmstrongNumbers();

        for (int i = 0; i < 10000; i++){
            int sum = 0;
            int remainder;
            int num= i;
            int size = armstrong.getLength(i);
            while (num != 0) {
                remainder = num % 10;
                sum = (int) (sum + Math.pow(remainder,size));
                num /= 10;
            }
            if(sum == i){
                System.out.println("Armstrong: " + i);
            }
        }

    }

    //finding the size of the number
    public int getLength(int num){

        int count = 1;

        while(num>= 10){
            num=num/10;
            count = count + 1;
        }
        return count;
    }

}
