package sum2largest;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static int sum2largest(int [] ar){
       int firstBiggest= IntStream.of(ar).boxed().sorted(Collections.reverseOrder()).limit(1).collect(Collectors.toList()).get(0);
       int secondBiggest= IntStream.of(ar).boxed().sorted(Collections.reverseOrder()).limit(2).collect(Collectors.toList()).get(1);
       return firstBiggest+secondBiggest;



    }

    public static void main(String[] args) {
        int[] array = {2,5,7,6,9};
        int x = sum2largest(array);
        System.out.println(x);
    }
}

