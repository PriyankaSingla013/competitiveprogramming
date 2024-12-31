class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=Math.min(costs[0],costs[1]);
        dp[1]=Math.min(costs[2],dp[1]);
        for(int i=1;i<n;i++){
            dp[i+1]=dp[i]+costs[0];
            if(dp[i+1]>costs[1]){
                int j=0;
                while(days[i]-days[j]>=7){
                    j++;
                }
                int m=dp[j]+costs[1];
                dp[i+1]=Math.min(dp[i+1],m);
            }
           if(dp[i+1]>costs[2]){
               int j=0;
                while(days[i]-days[j]>=30){
                    j++;
                }
                int m=dp[j]+costs[2];
                dp[i+1]=Math.min(dp[i+1],m);
           }
        }
        return dp[n];
    }
}