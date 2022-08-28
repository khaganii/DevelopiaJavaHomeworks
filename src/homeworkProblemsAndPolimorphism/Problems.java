package homeworkProblemsAndPolimorphism;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problems {

    public static int[] remove(int[] arr, int element){
        if (IntStream.of(arr).anyMatch(x->x==element)){
            return IntStream.range(0, arr.length).filter(i->arr[i]!=element).map(i ->arr[i]).toArray();
        }
        else return arr;
    }

    public static int[] insert(int[] arr, int index, int element){
        if(index <= arr.length+1){
            return IntStream.range(0, arr.length+1)
                    .map(i->{
                        if(i<index) return arr[i];
                        else if(i==index) return element;
                        else return arr[i-1];
                    }).toArray();
        }
        else return arr;
    }

    public static int min(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }

    public static int max(int[] arr){
        return  Arrays.stream(arr).max().getAsInt();
    }

    public static int[] findDuplicates(int[] arr){
        int[] afterRemoveDuplicates = Arrays.stream(arr).distinct().toArray();
        return Arrays.stream(afterRemoveDuplicates)
                .filter(i-> Arrays.stream(arr).filter(j-> j == i).count()>1)
                .toArray();
    }
}
