package Top100;
import java.util.*;

public class A1_PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        pairSumSolution1(arr, 3);
    }

    private static void pairSumSolution1(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                System.out.println("Found " + arr[i] + ", " + arr[map.get(arr[i])]);
                return;
            }
            map.put(sum - arr[i], i);
        }
        System.out.println("Not found");
    }
}
