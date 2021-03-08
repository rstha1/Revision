package arrayList;

import java.util.ArrayList;

public class IfNumIsEvenOrOdd {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                System.out.println(list.get(i) + " is an even number");
            } else {
                System.out.println(list.get(i) + " is an odd number");
            }

            }
    }
}
