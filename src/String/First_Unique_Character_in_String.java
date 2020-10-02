package String;
import java.util.HashMap;

public class First_Unique_Character_in_String {


    public static void main(String[] args){

       // int n = firstUniqChar("loveleetcode");
      //  System.out.println(n);

        String s = "leelt";
        int l = firstUniqChar2(s);
        System.out.print(l);


    }

    public static int firstUniqChar2(String s) {
        int i;
        for(i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return i;
        }

        return -1;
    }



    //Using HashMap
    public static int firstUniqChar1(String s) {

        HashMap<Character, Integer> map = new HashMap();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }


        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;



    }










}
