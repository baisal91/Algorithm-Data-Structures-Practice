package Array;

import java.util.ArrayList;
import java.util.List;


public class ArrayList_Fizz_Buzz {


    public static void main(String[] args){

        List<String> list;

        list = fizzBuzz(15);

        for (String i:list) {
            System.out.println(i);

        }
    }

    public static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList();



        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                String number = new StringBuffer().append(i).toString();
                list.add(number);
            }
        }
        return list;

    }
}
