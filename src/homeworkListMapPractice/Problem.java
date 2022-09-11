package homeworkListMapPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Problem {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("emil", "nihat", "husen", "rishad", "togrul",
                "rauf", "nihat", "husen", "emil", "nihat"));

        Map<String, Integer> map = new HashMap<>();
        names.forEach(i-> {
            if(map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i)+1);
        });

        List<String> distinctNames = new ArrayList<>(names.stream().distinct().toList()); //
        Collections.sort(distinctNames); //sorting
        distinctNames.forEach(i-> System.out.println(i + " -> " + map.get(i)));
    }
}
