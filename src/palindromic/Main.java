package palindromic;

import java.util.List;

public class Main {

    boolean isPalindrome(String str){

        if(str.length()==1) return true;

        int i = 0;
        int j = str.length()-1;


        while(i <= j){

            if(str.charAt(i) != str.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }

    List<List<String>> allPalindromes(String str){

        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                if(isPalindrome(str.substring(i,j+1))){
                    System.out.println(str.substring(i,j+1));
                }
            }
            System.out.println();
        }

        return null;
    }

    List<List<String>> allPalindromes2(String str){
        int l = 0; // half of the length when you shift in the left

        for(int i = 0; i < str.length(); i++){//i - center,

            System.out.println("Center at "+ str.charAt(i));
            for(l = 0; i-l >= 0 && i+l < str.length(); l++) {//left index is i-l, right index is i+l
                    if (str.charAt(i-l) != str.charAt(i+l)) break;
                System.out.println(str.charAt(i-l) + "<<<< l="+l+"  >>>>>"+str.charAt(i+l));
            }
            l--;

            //System.out.println(str.substring(i-l, i+l+1));
            for(int j=0; j<=l; j++) {
                System.out.println(str.substring(i-j, i+j+1));
            }
        }

        return null;
    }

    public static void main(String[] args) {

        new Main().allPalindromes2("nitin");


    }
}




