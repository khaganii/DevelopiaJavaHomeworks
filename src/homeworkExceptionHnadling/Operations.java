package homeworkExceptionHnadling;

import java.util.Arrays;

public class Operations {
    public static void update(int[] arr, int index, int newValue){
        try{
            arr[index] = newValue;
            System.out.println("UPDATED -> " + Arrays.toString(arr));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(new MyCustomRuntimeException("===== Out Of Bound Exception =====").getMessage());
        }finally {
            System.out.println("Method Ended");
        }
    }
}
