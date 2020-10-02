package Math_Number;
import java.util.Arrays;

public class Missing_Number {


    public static void main(String[] args){
        int[] arr = {0,3,4,2,1};
        int[] arr1 = {0,4,2,1};

        System.out.println(missingNumber(arr));
        System.out.println(missingNumber(arr1));
    }


    public static int missingNumber(int[] nums) {


        Arrays.sort(nums);
        if(nums[0] != 0) return 0; //Ensure that at index of array[0] has to begin with 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] - nums[i-1] != 1){
                return nums[i] - 1;
            }
        }

        return nums[nums.length-1] +1;
    
    }
}
