package Dynamic_Programming;


/*
    We can buy and sell only one time; only one transaction is allowed. 
 */
public class Best_Time_to_Buy_and_Sell_Stock {

    public static void main(String[] args){
        int [] arr ={7,1,5,3,6,4}; // 5 expected

        System.out.println(maxProfit(arr));
    }


    public static int maxProfit(int[] prices) {

        int max_profit=0;
        int minBuyStock=Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(minBuyStock > prices[i]){
                minBuyStock = prices[i];
            }else if(prices[i]-minBuyStock > max_profit){
                max_profit = prices[i]-minBuyStock;
            }
        }

        return max_profit;
    }
}
