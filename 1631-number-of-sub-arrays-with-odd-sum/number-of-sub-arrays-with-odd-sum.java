class Solution {
    public int numOfSubarrays(int[] arr) {
        int even=1,odd=0,sum=0,ans=0,mod=1000000007;
        for (int a:arr){
            sum+=a;
            if(sum%2==0){
                ans+=odd;
                even++;
                ans%=mod;
            }
            else{
                ans+=even;
                odd++;
                ans%=mod;
            }
        }
        return ans;
    }
}