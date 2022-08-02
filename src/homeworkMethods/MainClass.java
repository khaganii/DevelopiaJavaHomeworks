package homeworkMethods;

public class MainClass {
    public static void main(String[] args) {
        //(v2-v1)/(t2-t1) = 4km/h / 1 s;
        //acc = 4000 m / 3600 s*s = 1.11 m/s*s;
        //time = sqrt(2*distance/acc)
        double acc = 1.11;
        double distance = 2000;
        double t = Math.sqrt(2*distance/acc);
        System.out.println((int)t);
    }
}
