package Array;

import java.util.HashMap;

public class Single_Number {


    public static void main(String[] args){
        int[] a = {2,2,1};
        int[] a1 = {4,1,2,1,2};

        int res = singleNumber1(a1);
        System.out.print(res);
    }


    //XOR Bitwise operation
    public static int singleNumber1(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }

    //HashMap
    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) +1 );
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return 0;
    }
}
