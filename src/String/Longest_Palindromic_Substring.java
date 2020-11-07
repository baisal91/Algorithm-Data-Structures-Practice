package String;

public class Longest_Palindromic_Substring {


    public static void main(String[] args){
        String s = "hello";
        System.out.println(longestPalindrome1(s));
    }

    public static String longestPalindrome1(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }



/**************                                         *********************                               ****************/
// Brute Force Solution O(n^3)
    public static  String longestPalindrome(String s) {


        int max = 0;
        String res = "";
        String temp;

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                temp = s.substring(i, j);
                boolean ans = palindrom(temp);
                if(ans == true && res.length() < temp.length()){
                    res=temp;
                }
            }

        }

        return res;

    }


    public static boolean palindrom(String s){

        String original = s;
        String temp="";

        for(int i=s.length()-1; i>=0; i--){
            temp+=s.charAt(i);
        }

        if(original.equals(temp)){
            return true;
        }

        return false;
    }
}
