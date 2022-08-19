package homeworkAbstactionAndProblemsBasic1to30;

public class Problems1to30 {
    public static void main(String[] args) {
//        problem1("Xaqani Abdullayev");
//        problem2(76, 44);
//        problem3(50, 0);
//        problem4();
//        problem5(5, 25);
//        problem6(125, 24);
//        problem7(8);
//        problem8();
//        problem9();
//        problem10();
//        problem11(7.5);
//        problem12(1,2,3,4,5);
//        problem13(5.6, 8.5);
//        problem14();
//        problem15(3, 5);
//        problem16();
//        problem17("10", "11");
//        problem18("10", "11");
//        problem19(5);
//        problem20(15);
//        problem21(15);
//        problem22("100");
//        problem23("1101");
//        problem24("111");
//        problem25(11);
//        problem26(7);
//        problem27(100);
//        problem28("25");
//        problem29("37");
        problem30("40");
    }

    private static void problem30(String s) {
        int x= Integer.parseInt(s, 16);
        System.out.println(Integer.toOctalString(x));
    }

    private static void problem29(String s) {
        int x = Integer.parseInt(s,16);
        System.out.println(Integer.toBinaryString(x));
    }

    private static void problem28(String s) {
        int x = Integer.parseInt(s,16);
        System.out.println(x);
    }

    private static void problem27(int a) {
        int x = Integer.parseInt(String.valueOf(a), 8);
        System.out.println(Integer.toHexString(x));
    }

    private static void problem26(int a) {
        int x = Integer.parseInt(String.valueOf(a), 8);
        System.out.println(Integer.toBinaryString(x));
    }

    private static void problem25(int a) {
        int x = Integer.parseInt(String.valueOf(a), 8);
        System.out.println(x);
    }

    private static void problem24(String s) {
        System.out.println(Integer.toOctalString(Integer.parseInt(s,2)));
    }

    private static void problem23(String s) {
        System.out.println(Integer.toHexString(Integer.parseInt(s,2)).toUpperCase());
    }

    private static void problem22(String s) {
        System.out.println(Integer.parseInt(s,2));
    }

    private static void problem21(int n) {
        System.out.println(Integer.toOctalString(n));
    }

    private static void problem20(int n) {
        System.out.println(Integer.toHexString(n).toUpperCase());
    }

    private static void problem19(int num) {
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%10);
            num /= 10;
        }
        System.out.println(sb.toString());
    }

    private static void problem18(String a, String b) {
        int c = Integer.parseInt(a,2) * Integer.parseInt(b, 2);
        System.out.println(Integer.toBinaryString(c));
    }

    private static void problem17(String a, String b) {
        int c = Integer.parseInt(a,2) + Integer.parseInt(b, 2);
        System.out.println(Integer.toBinaryString(c));
    }

    private static void problem16() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    private static void problem15(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("first = " + b + "\n" + "Second = " + a);
    }

    private static void problem14() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 65; j++) {
                if (i< 8 && j<21){
                    if (i%2 == 0){
                        if (j%2 == 0) System.out.print("*");
                        else System.out.print(" ");
                    }
                    else {
                        if (j%2 == 0) System.out.print(" ");
                        else System.out.print("*");
                    }
                }
                else System.out.print("=");
            }
            System.out.println();
        }
    }

    private static void problem13(double a, double b) {
        System.out.println("Perimeter is = " +  String.format("%.2f",2*(a+b)));
        System.out.println("Area is = " + String.format("%.2f",Math.round(a*b*100)/100.0));
    }

    private static void problem12(int ... nums) {
        int sum = 0;
        for (int i: nums) {
            sum+=i;
        }
        System.out.println(sum/nums.length);
    }

    private static void problem11(double d) {
        System.out.println("Perimeter is = " + 2*d*Math.PI);
        System.out.println("Area is = " + Math.PI*d*d);

    }

    private static void problem10() {
        double num = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(num);
    }

    private static void problem9() {
        double num = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(num);
    }

    private static void problem8() {
        char[][] chars = new char[4][25];
        chars[0] = new char[]{'*','*','*', 'J','*','*','*','*','a','*','*','*','v','*','*','*','*','*','v','*','*','a','*','*','*','*'};
        chars[1] = new char[]{'*','*','*', 'J','*','*','*','a','*','a','*','*','*','v','*','*','*','v','*','*','a','*','a','*','*','*'};
        chars[2] = new char[]{'J','*','*', 'J','*','*','a','a','a','a','a','*','*','*','V','*','V','*','*','a','a','a','a','a','*','*'};
        chars[3] = new char[]{'*','J','J', '*','*','a','*','*','*','*','*','a','*','*','*','V','*','*','a','*','*','*','*','*','a','*'};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 25; j++) {
                if(chars[i][j] == '*') System.out.print(" ");
                else System.out.print(chars[i][j]);
            }
            System.out.println();
        }
    }

    private static void problem7(int a) {
        for (int i = 1; i < 11; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }

    private static void problem6(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    private static void problem5(int a, int b) {
        System.out.println(a*b);
    }

    private static void problem4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    private static void problem3(int a, int b) {
        System.out.println(b != 0 ? a/b : "Divide by zero Exception");
    }

    private static void problem2(int a , int b) {
        System.out.println(a+b);
    }

    private static void problem1(String s) {
        System.out.printf("Hello\n%s", s);
    }
}
