package countingPairs;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(arr[i]);

        }
    }
}
