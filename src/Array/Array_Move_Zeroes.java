package Array;

public class Array_Move_Zeroes {


    public static void main(String [] args){

        int[] nums = {0,1,0,3};
        int[] n =  moveZeroes(nums);

        for (int i:
             n) {
            System.out.print(i);

        }
    }

    public static int[] moveZeroes(int[] nums) {
        int temp = 0, j = 0;
        for (int i = 0; i<nums.length; i++) {
            if(nums[i] != 0 ) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        return nums;

    }
}
