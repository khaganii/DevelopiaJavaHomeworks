package homeWorkArrays;

public class MainArrays {
    public static void main(String[] args) {
        int[] numbers = {23, 44, 21, 31, 42};
        //System.out.println(calculateSumOfElementsOfArray(numbers));
        //System.out.println(calculateNumericalAverageOfElementsOfArray(numbers));
        //System.out.println(findMinimumElementOfArray(numbers));
        //printOddElementsOfArray(numbers);
        //printEvenElementsOfArray(numbers);
        printPrimeElementsOfArray(numbers);
    }

    private static void printPrimeElementsOfArray(int[] arr) {
        for (int num : arr)
            if (isPrime(num))
                System.out.println(num);
    }

    private static boolean isPrime(int num){
        int dividerCount = 0;
        for (int i = 2; i <= num/2; i++)
            if (num % i == 0)
                dividerCount++;
        return (dividerCount==0);
    }

    private static void printEvenElementsOfArray(int[] arr) {
        for (int num : arr)
            if (num%2 == 1)
                System.out.println(num);
    }

    private static void printOddElementsOfArray(int[] arr) {
        for (int num : arr)
            if (num%2 == 0)
                System.out.println(num);
    }

    public static int calculateSumOfElementsOfArray(int[] arr){
        int sum = 0;
        for (int num:arr) sum += num;
        return sum;
    }

    public static int calculateNumericalAverageOfElementsOfArray(int[] arr){
        int sum = 0;
        for (int num:arr) sum += num;
        return sum/arr.length;
    }

    public static int findMinimumElementOfArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int num : arr)
            min = Math.min(num, min);
        return min;
    }

}
