package if_condition;

public class NumDivisibleBy3And4 {

        int number;
        public void checkIfDivisibleBy3And4(int number){
            if((number % 3 == 0) && (number % 4 != 0)){
                System.out.println("fizz");
            }
            if((number % 4 == 0) && (number % 3 != 0)){
                System.out.println("buzz");
            }
            if((number % 3 == 0) && (number % 4 == 0)){
                System.out.println("fizzbuzz");
            }
            else {
                System.out.println("Not Divisible by 3 and 4");
            }





        }



}
