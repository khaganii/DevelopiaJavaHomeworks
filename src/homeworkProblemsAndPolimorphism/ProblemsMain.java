package homeworkProblemsAndPolimorphism;

import java.util.Arrays;

public class ProblemsMain {
    public static void main(String[] args) {
        System.out.println("---------------------\nREMOVE\n-----------------------");
        int arr[] = new int[]{2,2,3,4,4,5,6,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Problems.remove(arr,4)) + "\n");
        System.out.println("---------------------\nINSERT\n-----------------------");
        System.out.println(Arrays.toString(Problems.insert(arr, 6, 8)) + "\n");
        System.out.println("---------------------\nMIN_MAX\n-----------------------");
        System.out.printf("Minimum is: %d\nMaximum is: %d\n",Problems.min(arr), Problems.max(arr));
        System.out.println("---------------------\nFindDuplicates\n-----------------------");
        System.out.println("Dublicates in This Array: " + Arrays.toString(Problems.findDuplicates(arr)));

    }
}
