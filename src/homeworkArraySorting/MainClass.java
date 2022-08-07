package homeworkArraySorting;

import java.util.Arrays;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++)
            arr[i] = rand.nextInt(100);

        SortAnArrayByDescending sortAnArrayByDescending = new SortAnArrayByDescending();
        sortAnArrayByDescending.sortByDescendingManually(arr);
    }
}
