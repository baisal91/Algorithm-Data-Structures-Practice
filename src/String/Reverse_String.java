package String;

public class Reverse_String {

    public static void main(String[] args){

        String[] s = {"h","e","l","l","o"};
        reverseString(s);

        for (String i:
             s) {
            System.out.print(s);

        }

    }

    public static String[] reverseString(String[] s) {



        int low = 0;
        int high = s.length-1;

        String temp;


        while(low<high){
            temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }

        return s;
    }
}
