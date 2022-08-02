package homeworkMethods;

public class Method {
    public int m1(int begin, int end){
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum+=i;
        }
        return (sum/(end-begin + 1));
    }
}
