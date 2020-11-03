package Array;

public class Search_in_Rotated_Sorted_Array {


    public static void main(String[] args){
       int[] nums = {4,5,6,7,0,1,2};


       System.out.println(search(nums, 0));
    }




    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int start = findMinimumIndex(nums);
        int left = 0;
        int right = nums.length - 1;

        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        } else right = start;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }



    private static int findMinimumIndex(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else right = mid;
        }
        return left;
    }
}
