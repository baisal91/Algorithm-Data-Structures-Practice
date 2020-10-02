package Math_Number;

public class Best_Time_to_Buy_Sell_Stock {


    public static void main(String[] args){

        int[] nums = {7,1,5,3,6,4};
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {7,6,4,3,1};

        System.out.println(maxProfit(nums));
        System.out.println(maxProfit(nums1));
        System.out.println(maxProfit(nums2));

    }

    public static int maxProfit(int [] prices){

        int max_profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]> prices[i-1]){
                max_profit+=prices[i] - prices[i-1];
            }
        }

        return max_profit;
    }
}
