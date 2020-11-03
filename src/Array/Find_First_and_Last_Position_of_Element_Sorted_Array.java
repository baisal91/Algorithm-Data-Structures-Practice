package Array;

public class Find_First_and_Last_Position_of_Element_Sorted_Array {



    public static void main(String[] args){
        int[] nums = {1,2,2,2,2,3,3,4};

        int[] nums1 = {2,2};
        for(int i: searchRange1(nums1, 2)){
            System.out.println(i);
        }
    }






    //O(n)
    public static int[] searchRange(int[] nums, int target) {


        if(nums.length == 1 && nums[0] == target)
            return new int[] {0,0};

        int start_index =0;
        int end_index=0;
        boolean flag = false;

        for(int i=0; i< nums.length; i++){
            if(nums[i]== target){
                if(flag == false){
                    start_index = i;
                    flag = true;
                }

                end_index++;
            }
        }


        if(flag){
            end_index+=start_index-1;
            return new int[] {start_index, end_index};
        }

        return new int[] {-1, -1};

    }


    /*
    *  Binary Search O(log(n))
     */

    public static int[] searchRange1(int[] nums, int target){

        int[] res = new int [2];

        res[0] = findFirstIndex(nums, target);
        res[1] = findLastIndex(nums, target);


        return res;
    }


    private static int findFirstIndex(int[] nums, int target){
        int index = -1;

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] >= target){
                high=mid-1;
            }else{
                low=mid+1;
            }

            if(nums[mid] == target){
                index=mid;
            }
        }


        return index;
    }

    private static int findLastIndex(int[] nums, int target){
        int index = -1;


        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] <= target){
                low=mid+1;

            }else{
                high=mid-1;
            }

            if(nums[mid] == target){
                index=mid;
            }
        }

        return index;
    }

}
