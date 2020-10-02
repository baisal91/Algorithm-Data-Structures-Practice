package Dynamic_Programming;

public class Maximum_Subarray {


    public static void main(String[] args){

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(arr));


    }

    // Used Kadane's algorithm

    public static int maxSubArray(int[] nums){

        int maxSum = nums[0];
        int currSum = maxSum;

        for (int i=1; i<nums.length; i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
