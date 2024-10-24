class Solution {
    int[][][] dp;
    public int countWinningSequences(String s) {
        dp=new int[s.length()][4][s.length()*2+1];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<4;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(s,0,3,0);
    }
    int helper(String s,int idx,int last,int points){
        if(idx==s.length()){
            return points>0 ? 1:0;
        }
        if(dp[idx][last][points+s.length()]!=-1){
            return dp[idx][last][points+s.length()];
        }
        long ways=0;
        if(last !=0){
            if(s.charAt(idx)=='E'){
                ways+=helper(s,idx+1,0,points+1);
            }
            else if(s.charAt(idx)=='W'){
                ways+=helper(s,idx+1,0,points-1);
            }
            else{
                ways+=helper(s,idx+1,0,points);
            }
        }
        if(last!=1){
            if(s.charAt(idx)=='F'){
                ways+=helper(s,idx+1,1,points+1);
            }
            else if(s.charAt(idx)=='E'){
                ways+=helper(s,idx+1,1,points-1);
            }
            else{
                ways+=helper(s,idx+1,1,points);
            }
        }
        if (last!=2){
            if(s.charAt(idx)=='W'){
                ways+=helper(s,idx+1,2,points+1);
            }
            else if(s.charAt(idx)=='F'){
                ways+=helper(s,idx+1,2,points-1);
            }
            else{
                ways+=helper(s,idx+1,2,points);
            }
        }
        dp[idx][last][points+s.length()]=(int)(ways%1000000007);
        return dp[idx][last][points+s.length()];
    }
}