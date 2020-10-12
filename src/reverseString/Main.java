package reverseString;

//        Input:   str = "a,b$c"
//        Output:  str = "c,b$a"
////        Note that $ and , are not moved anywhere.
////                Only subsequence "abc" is reversed
//
//        Input:   str = "Ab,c,de!$"
//        Output:  str = "ed,c,bA!$"

public class Main {
    public static void main(String[] args) {
        String str = "a,,b$c";
        System.out.println(new Main().solution(str));
    }
    String solution(String str){

        char[] chs = str.toCharArray();
        int lshift = 0, rshift=0;
        for(int i = 0; i <= chs.length/2; i++) {

            int     ia = i+lshift,
                    ib = chs.length - 1 -i - rshift;
            System.out.println(ia + ", " + ib);
            while(ia<chs.length && !Character.isAlphabetic(chs[ia])) {
                lshift++;
                ia = i+lshift;
            }
            while(ib>=0 && !Character.isAlphabetic(chs[ib])) {
                rshift++;
                ib = chs.length - 1 -i - rshift;
            }
            System.out.println(">>>>>"+ia + ", " + ib);


            if(ia< chs.length/2 && ib>=0) {
                char t = chs[ia];
                chs[ia] = chs[ib];
                chs[ib] = t;
            }

            //if(Character.isAlphabetic(chs[i]))

        }

        return new String(chs);
    }
}
