package homeworkOperationsWithStrings;

public class Problem {
    public static int calculate(int minSymbol, int maxSymbol, int alphabetLength) {
        int worddCounter = 0;
        for (int i = minSymbol; i <= maxSymbol; i++)
            worddCounter += Math.pow(alphabetLength, i);
        return  worddCounter;
    }
}
