package Array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String [] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int[] res = merge(nums1, 3, nums2, 3);

        for (int i: res ) {
            System.out.print(i);

        }


    }



    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {


        for(int i=0; i<nums2.length; i++){
            nums1[m +i ] = nums2[i];


        }

        Arrays.sort(nums1);
        return nums1;

    }
}
