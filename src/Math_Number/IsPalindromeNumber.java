package Math_Number;

public class IsPalindromeNumber {



    public static void main(String [] args){

        System.out.println(isPalindrome1(121));
    }


    public static boolean isPalindrome1(int x) {
        int answer=0;

        int original =x;

        while(x!=0){
            answer = answer*10+x/10;
            x=x/10;
        }

        if(answer<0)
            return false;
        else if(answer==original)
            return true;
        else
            return false;
    }

    public static boolean isPalindrome(int x) {

        int result = 0;

        while(x!=0){
            result = result*10+x%10;
            x=x/10;
        }

        if(result==x)
            return true;
        else
            return false;


    }
}
