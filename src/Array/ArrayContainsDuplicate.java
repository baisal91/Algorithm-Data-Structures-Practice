package Array;

import java.util.HashSet;

public class ArrayContainsDuplicate {

    public static void main(String[] args){

        int[] nums = {1,2,3,1};

        System.out.println(containsDuplicate(nums));

    }


    public static boolean containsDuplicate(int[] nums) {

        //boolean flag =false;

        HashSet set = new HashSet();

        for(int i=0; i<set.size(); i++){
            if(set.contains(nums[i]) == true){
                return true;
                //break;
            }else{
                set.add(nums[i]);
            }
        }


        return false;

    }
}
