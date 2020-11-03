package String;

import java.util.*;
public class LengthOfLongestSubstring {

    public static void main(String[] args){

      int a=7;
      int b=10;

      System.out.println(lengthOfLongestSubstring1("advdfdfgv"));


    }

    public static int lengthOfLongestSubstring1(String s) {

        int size = s.length();
        int max=0, count=0, i=0, j=0;
        HashSet<Character> set = new HashSet();

        while(i<size && j<size){
            char c = s.charAt(j);
            if(!set.contains(c)){
                set.add(c);

                max=Math.max(max, count+1);
                count++;
                j++;
            }else{
                set.remove(c);
                i++;
                count = 0;
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
