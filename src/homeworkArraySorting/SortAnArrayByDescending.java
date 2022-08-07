package homeworkArraySorting;

import java.util.Arrays;

public class SortAnArrayByDescending {
    public void sortByDescendingManually(int [] arr){
        System.out.println("Before: \n" + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After: \n" + Arrays.toString(arr));
        countOddAndEvenElementsOfArray(arr);
    }

    private void countOddAndEvenElementsOfArray(int [] arr) {
        int oddCount = 0, evenCount = 0;
        for (int num:arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        createArrayOfEvenAndOddElements(evenCount, oddCount, arr);
    }

    private void createArrayOfEvenAndOddElements(int evenCount, int oddCount, int[] arr) {
        int[] evenElements = new int[evenCount];
        int[] oddElements = new int[oddCount];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int num:arr) {
            if (num % 2 == 0) {
                evenElements[evenIndex] = num;
                evenIndex++;
            }
            else{
                oddElements[oddIndex] = num;
                oddIndex++;
            }
        }
        System.out.println("The Evens: \n" + Arrays.toString(evenElements));
        System.out.println("The Odds: \n" + Arrays.toString(oddElements));
    }
}
