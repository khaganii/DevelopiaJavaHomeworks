package homeworkOOPandEolympProblem;
import java.util.*;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int j = 0; j < test; j++) {
            Map<Integer, List<Integer>> accidentsDetail = new HashMap<>();
            List<Integer> accidentsLine = new ArrayList<>();
            int placeCount = sc.nextInt();
            for (int i = 1; i <= placeCount; i++) {
                int begin = sc.nextInt();
                int end = sc.nextInt();
                accidentsLine.add(begin);
                accidentsLine.add(end);
                List <Integer> list = new ArrayList<>(Arrays.asList(begin, end));
                accidentsDetail.put(i, list);
            }
        }
    }

    private static void solveProblem(Map<Integer,List<Integer>> accidents, List<Integer> accidentsLine) {
        Collections.sort(accidentsLine);
        int result = 0;
        List<Integer> activeAccidents = new ArrayList<>();
        List<Integer> removedAccidents = new ArrayList<>();
        for (int i : accidentsLine) {
            List<Integer> keys = getKey(i, accidents);
            for (int t:keys) {
                if(accidents.get(t).get(0) == i) activeAccidents.add(0,t);
                if(accidents.get(t).get(1) == i){
                    activeAccidents.remove((Integer) t);
                    removedAccidents.add(t);
                }
            }
            if(activeAccidents.size() == 0) {
                result++;
                printLine(removedAccidents);
                removedAccidents.clear();
            }
        }
        System.out.println("Result = " + result);
    }

    private static void printLine(List<Integer> removedAccidents) {
        Collections.sort(removedAccidents);
        for (int i = 0; i < removedAccidents.size(); i++) {
            if (i != removedAccidents.size()-1)
                System.out.print(removedAccidents.get(i) + " ");
            else
                System.out.print(removedAccidents.get(i));
        }
        System.out.println();
    }

    private static List<Integer> getKey(int num, Map<Integer, List<Integer>> map){
        List<Integer> results = new ArrayList<>();
        for (int key:map.keySet()) {
            if (map.get(key).contains(num)){
                results.add(key);
            }
        }
        return results;
    }

}