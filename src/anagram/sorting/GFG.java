package anagram.sorting;

import com.codewithmosh.Array;

import java.util.Arrays;

public class GFG {
    static boolean areAnagram(char[] s1, char[] s2) {
        if (s1.length != s2.length)
            return false;
        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
        }

    public static void main(String[] args) {

        char str1[] = {'m', 'a', 'm', 'a'};
        char str2[] = {'a', 'm', 'a', 'm'};

        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

// Time Complexity: O(nLogn)
}