class Solution {
    boolean isvow(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
            if(isvow(words[i-1].charAt(0)) && isvow(words[i-1].charAt(words[i-1].length()-1))){
                dp[i]++;
            }
        }
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i]=dp[queries[i][1]+1]-dp[queries[i][0]];
        }
        return res;
    }
}