class Solution {
    public int maxProfit(int[] prices) {
        int r=prices.length-1,l=r-1;
        int maxProfit=0;

        while(l>=0){
            if(prices[r]>=prices[l]){
                int profit = prices[r]-prices[l];
                maxProfit=Math.max(maxProfit,profit);
            } else{
                r=l;
            }
            l--;
        }
        return maxProfit;
    }
}
