package homeworkDataStructuresProblems;

public class Solutions {
    public int sumOfAgeOfFamilyMembers(){
        int nowDadsAge = 50;
        int nowMomsAge = 47;
        int nowFirstChildAge = 25;
        int nowSumOfChildrenAges = nowFirstChildAge;
        for (int i = 1; i < 7; i++) {
            int nowPerChildAge = nowFirstChildAge - i*3;
            nowSumOfChildrenAges += nowPerChildAge;
        }
        int nowSumOfFamilyAge = nowSumOfChildrenAges + nowDadsAge + nowMomsAge;
        return nowSumOfFamilyAge + 45;

    }

    public void printNumbersSumOfDigitsIsEven(){
        int count = 20;
        int num = 1;
        while (count > 0){
            int i = num;
            int sum = 0;
            while (i > 0){
                 sum += i%10;
                i = i/10;
            }
            if (sum%2 == 0){
                System.out.println(num);
                count--;
            }
            num++;
        }
    }

    public void printDoubleNumbersByDistanceBetweenTwoNumbers(int a, int b, double distance){
        for (double i = Math.min(a,b); i < Math.max(a,b); i += 0.1)
            System.out.printf("%.1f%n", i);
    }

    public int calculateNumericAverageOfSumOfDigitsOfNumber(int num) {
        int sum = 0;
        int count = 0;
        while (num > 0) {
            count++;
            sum += num%10;
            num /= 10;
        }
        return (sum/count);
    }

    public int findBiggestDigitOfNumber(int num) {
        int big = 0;
        while(num > 0){
            int b =  num % 10;
            if (b > big) big = b;
            num /= 10;
        }
        return big;
    }

    public int findSmallestDigitOfNumber(int num) {
        int small = 10;
        while (num > 0){
            int d = num % 10;
            if (d < small) small = d;
            num /= 10;
        }
        return small;
    }

    public int calculateDaysCountOfGrowingUpTree() {
        int dayCount = 0;
        double sumOfWater = 1;
        double lastAddedWater = 1;
        while(true){
            lastAddedWater = lastAddedWater * 1.5;
            sumOfWater += lastAddedWater;
            long x = (long) sumOfWater;
            if ((x * 2 > 2980)) break;
            dayCount++;
        }
        return dayCount;
    }

    public void printAlphabet() {
        for (char ch = 'a'; ch <= 'z'; ch++)
            System.out.println(ch);
    }
}
