package ArrayList;

import java.util.ArrayList;

public class AddNumFromOneListToOther {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        for (int i = 0; i < 3; i++) {
            list1.add(list2.get(i));
        }
        System.out.println(list1);
    }
}
