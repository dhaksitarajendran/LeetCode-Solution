class Solution {
    public int maxProfit(int[] prices) {
      int mini = Integer.MAX_VALUE;
      int profit = Integer.MIN_VALUE;
    for(int i=0;i<prices.length;i++){
        if(mini>prices[i]){
        mini = prices[i];
        
        }
    profit = Math.max(profit,prices[i]-mini);
    }
  return profit;
    }
}