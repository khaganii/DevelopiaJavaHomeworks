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

        for (int i = 0; i < computers.size()-1; i++) {
            for (int j = i; j < computers.size(); j++) {
                if (computers.get(i).compareTo(computers.get(j))<0){
                    Computer temp = computers.get(i);
                    computers.set(i, computers.get(j));
                    computers.set(j, temp);
                }
            }
        }

        System.out.println(computers);
    }
}
