package interview_practice;

import java.util.HashMap;

public class Two_Sum {

    public static void main(String[] args){

        int[] a= {2, 7, 7, 11, 15};
        int target = 9;

        int[] res= twoSumSecond(a, target);

        for(int i: res){
            System.out.print(i);
        }

    }


    public static int[] twoSumSecond(int [] arr, int target ){

        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i=0; i<arr.length; i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }else{
                map.put(arr[i], i);
            }
        }

        return new int[]{};

    }








    public static int[] twoSum(int [] arr, int target ){


        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum");

    }

}
