package homeworkCreateMyCustomArrraylistWithGenerics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(5,2);
        System.out.println(list);
    }


}
