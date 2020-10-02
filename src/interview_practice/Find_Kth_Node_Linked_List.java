package interview_practice;

import java.util.LinkedList;

public class Find_Kth_Node_Linked_List {


    public static void main(String[] args){

        String s ="hello";



        System.out.println(reverse(s));



    }

    /*
          Simple solution would be to calculate number of nodes n in the linked list first.
          Then, k'th node from the end will be (n-k+1)th node from the beggining.
     */

   public static String reverse(String s){

       String res = "";

       for(int i=s.length()-1; i>=0; i--){
           res+=s.charAt(i);
       }

       return res;
   }

    public static String reverse1(String s){

        int low = 0;
        int high = s.length();
        char temp;

       return "";

    }
}

