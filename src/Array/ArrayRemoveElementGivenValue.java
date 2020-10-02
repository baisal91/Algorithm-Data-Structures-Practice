package Array;

public class ArrayRemoveElementGivenValue {



    public static void main(String [] args){

        int nums[] = {3,2,4,3,6};

        int  s = removeElement(nums,3);

        System.out.println(s);
    }



    public static int removeElement(int[] nums, int val) {

        int count=0;


        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;

            }
        }

        return count;
    }

}
