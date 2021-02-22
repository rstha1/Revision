package for_loop;

public class NestedForLoop {

    public void PrintingNumbersInPyramid(){
        int num = 0;
        for (int i = 1; i<=5; i++ ){
            num = num*10 + i;
            System.out.println(num);
        }
    }

    public void PrintingNumbersInPyramidUsingNestedForLoop(){

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        NestedForLoop obj = new NestedForLoop();

        obj.PrintingNumbersInPyramidUsingNestedForLoop();

    }
}
