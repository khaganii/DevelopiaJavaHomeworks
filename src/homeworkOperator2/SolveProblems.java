package homeworkOperator2;

public class SolveProblems {
    public void calculateSumOfDigitsOfNumber(int num){
        int sum = 0;
        do {
            sum += num % 10;
            num = num / 10;
        } while (num != 0);
        System.out.println("Sum of digits of numbers: " + sum);
    }

    public void calculateAreaOfCircle(int radius){
        double area = 3.14 * Math.pow(radius, 2);
        System.out.println("Area of circle is: " + area);;
    }

    public void numberIsPrime(int num){
        String message = num + " is ";
        System.out.println(isPrime(num) ? (message + "Prime!") : (message + "not Prime!"));
    }

    private boolean isPrime(int num){
        int dividerCount = 0;
        for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) dividerCount++;
        }
        return (dividerCount==1);
    }

    public void basicCalculations(){
        int number = 37;
        number *= 3;
        number %= 5;
        System.out.println(number);
    }

    public void calculateSumOfNumbersBetween(int a, int b){
        int sum = 0;
        for (int i = Math.min(a,b); i <= Math.max(a, b); i++)
            sum += i;

        String message = String.format("Sum of numbers between %d and %d is %d", Math.min(a,b), Math.max(a, b), sum);
        System.out.println(message);
    }

    public void listOfNumbersDividesByNumberWithoutReminderBetweenTwoNumber(int a, int b, int divider){
        String message = String.format("List of numbers devides by %d without reminder between %d and %d",divider, Math.min(a,b), Math.max(a, b));
        System.out.println(message);
        for (int i = Math.min(a,b); i < Math.max(a,b); i++) {
            if (i%divider == 0) System.out.println(i);
        }
    }

    public void listOfNumbersDividesByTwoNumbersWithoutReminderBetweenTwoNumber(int a, int b, int divider1, int divider2){
        String message = String.format("List of numbers devides by %d and %d without reminder between %d and %d",divider1, divider2, Math.min(a,b), Math.max(a, b));
        System.out.println(message);
        for (int i = Math.min(a,b); i < Math.max(a,b); i++) {
            if (i%divider1 == 0 && i%divider2 == 0) System.out.println(i);
        }
    }

    public void listFirstNPrimeNumbers(int n) {
        String message = String.format("Print First %d prime numbers!", n);
        int count = 0;
        int num = 1;
        while(n != 0){
            if (isPrime(num)){
                n--;
                System.out.println(num);
            }
            num++;
        }
    }
}
