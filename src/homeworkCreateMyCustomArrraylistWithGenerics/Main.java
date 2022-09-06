package homeworkCreateMyCustomArrraylistWithGenerics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Computer> list = new MyList<>();
        list.add(new Computer(1,"HP", 8));
        list.add(new Computer(2,"HP", 16));
        list.add(new Computer(3,"HP", 32));
        System.out.println(list);
        System.out.println("\n----------------------------------\n");
        MyList<String> names = new MyList<>();
        names.addAll(Arrays.asList("Adil","Həsən", "Əli", "Məhəmməd", "Xalid"));
        System.out.println(names.indexOf("Əli"));
        System.out.println(names.get(2));
        names.remove(0);
        System.out.println(names);
        names.clear();
        System.out.println(names);

    }


}
