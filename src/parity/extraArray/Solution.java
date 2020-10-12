package parity.extraArray;

import java.util.Arrays;

public  class Solution {
    public static int[] sortArrayByParity(int[] A){
        int front = 0;
        int back = A.length-1;
        int[] parityArray = new int[A.length];
        for (int value: A) {
            if ((value%2==0))
                parityArray[front++] = value;
            else parityArray[back--] = value;
        }
        return parityArray;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(array)));
    }
}

