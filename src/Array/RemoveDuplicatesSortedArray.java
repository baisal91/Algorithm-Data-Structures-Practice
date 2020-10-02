package Array;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args){

        int [] nums  =new int [6];

         nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;



        for (int i:nums) {
            System.out.print(i);
        }

        System.out.println();

        nums[4] =9;

        nums[5] =9;

        for (int i:nums) {
            System.out.print(i);
        }


    }

    public static int removeDuplicates2(int[] nums) {

        int count_size = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[count_size]){
                count_size++;
                nums[count_size] = nums[i];

            }
        }

        for (int i:nums) {
            System.out.print(i);
        }



        return count_size+1;
    }

    public static int removeDuplicates(int[] nums) {

        if(nums.length ==0){
            return 0;
        }

        int res=1;
        int temp=nums[0];

        for(int i=0; i<nums.length;i++){
            if(temp!=nums[i]){
                nums[res]=nums[i];
                temp=nums[i];
                res++;
            }
        }

        return res;
    }




}
