package Array;

public class Array_Max_Consecutive_Ones {



    public static void main(String[] args){

        int[] nums = {0,1};
        int s = findMaxConsecutiveOnes(nums);
        System.out.print(s);

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        if(nums.length<2 && nums[0] == 1){
            return 1;
        }

        int max_count=0;
        int current_count=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){
                current_count++;
                max_count = Math.max(max_count, current_count);
            }else if(nums[i]==0){
                max_count = Math.max(max_count, current_count);
                current_count=0;;
            }
        }
        return max_count;
    }
}
