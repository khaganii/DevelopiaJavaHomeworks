package homeworkListMapPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer(1, "Samsung", 34));
        computers.add(new Computer(3, "HP", 21));
        computers.add(new Computer(2, "Acer", 76));

        System.out.println(computers);

        //Collections.sort(computers); //comparable
        computers.sort(new RamComparator());
        System.out.println(computers);
        computers.sort(new ModelComparator());
        System.out.println(computers);
    }
}
