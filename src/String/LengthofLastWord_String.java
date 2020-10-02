package String;

public class LengthofLastWord_String {




    public static void main(String[] args){

       int s =  lengthOfLastWord("Hello World");
       System.out.println(s);
    }


    public static int lengthOfLastWord(String s) {

        String[] result = s.split(" ");

        return result[result.length-1].length();

    }
}
