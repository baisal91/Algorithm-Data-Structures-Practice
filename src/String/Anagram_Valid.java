package String;

public class Anagram_Valid {

    public static void main( String [] args){
        String s = "aacccc";
        String t = "ccacca";




        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length() || t == null || s== null)
            return false;

        int count = s.length();

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    count--;
                    break;
                }

                break;
            }
        }

        if(count < 1)
            return true;
        else
            return false;

    }
}
