package String;

public class Palindrome_Sentence {


    public static void main(String[] args){

        String s = "A man, a plan, a canal: Panama";

        System.out.print(isPalindrome(s));



    }


    public static boolean isPalindrome(String s) {

        String res ="";

        for(char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                res+=c;
            }
        }


        res = res.toLowerCase();
        int low=0;
        int high=res.length()-1;

        while(low<=high){
            if(res.charAt(low) != res.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;


    }
}
