package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MinAndMaxNumInArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);

        int max = list.get(0);
        int min = list.get(0);

//        System.out.println(Collections.max(list));
//        System.out.println(Collections.min(list));

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(max);

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.println(min);

    }
}
