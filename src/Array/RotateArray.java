package Array;

public class RotateArray {

    public static void main(String[] args){

        int[] num = {1,2,3,4,5,6,7};


           int[] num1 =  rotate(num, 2);

        for (int i: num1) {
            System.out.print(i);
        }


    }

    public static  int[] rotate(int[] nums, int k) {

        int[] nums2 = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            nums2[(i+k)%nums.length] = nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = nums2[i];
        }
        return nums;

    }
}
