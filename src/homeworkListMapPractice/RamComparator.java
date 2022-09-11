package homeworkListMapPractice;

import java.util.Comparator;

public class RamComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        return o1.ram - o2.ram;
    }
}
