package parity.swap;

import java.util.Arrays;

public  class Solution {
    public static int[] sortArrayByParityInPlace(int[] A){
        int low = 0;
        int high = A.length-1;
        while (low<high){
            if ((A[low]%2)!=0 && (A[high]%2)==0)
                swap(A,low,high);
            if ((A[low]%2)==0)
                low++;
            if ((A[high]%2)!=0)
                high--;
        }
        return A;
    }
    public static void swap(int[] A, int low, int high){
        int temp = A[low];
        A[low] = A[high];
        A[high]=temp;
    }
    public static void main(String[] args) {
        int[] array = new int[]{3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParityInPlace(array)));
    }
}

