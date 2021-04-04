package Top100;

import java.util.Map;

public class A2_LongestCommonSubSequence {
    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCABA";
        solution1(s1, s2, s1.length()-1, s2.length()-1, "");
    }

    //Tree Approach
    private static void solution1(String s1, String s2, int n1, int n2, String output){
        if(n1 < 0 || n2 < 0){
            System.out.println(output);
            return;
        }
        if(s1.charAt(n1) == s2.charAt(n2)){
            solution1(s1,s2,n1 - 1, n2 - 1, s1.charAt(n1) + output);
        } else {
            solution1(s1, s2, n1 - 1, n2, output);
            solution1(s1, s2, n1, n2 - 1, output);
        }
    }

    //Optimized Approach
    private static void solution2(String s1, String s2){

    }
}
