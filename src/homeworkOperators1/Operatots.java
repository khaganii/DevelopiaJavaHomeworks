package homeworkOperators1;

public class Operatots {
    public void solveOperatorsTasks(){
        int age = 4;
        age += 2;
        System.out.println("1) age += 2 -> " + age);
        age -= 3;
        System.out.println("2) age += 3  -> " + age);
        age *= 8;
        System.out.println("3) age *= 8  -> " + age);
        age /= 2;
        System.out.println("4) age /= 2  -> " + age);
        age %= 5;
        System.out.println("5) age %= 5  -> " + age);
    }

    public void multiplicationTable(){
        final int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("--------------------");
        }
    }

    public void listSumOfNumbersBetween(int a, int b){
        for (int i = Math.min(a,b); i <= Math.max(a, b); i++) {
            System.out.println(i);
        }

    }
}
