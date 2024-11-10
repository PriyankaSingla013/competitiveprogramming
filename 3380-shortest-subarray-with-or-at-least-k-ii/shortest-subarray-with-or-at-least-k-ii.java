class Solution {
    int[] bits=new int[32];
    int r=0;
    void add(int n){
        for(int i=0;i<32 && n>0;i++){
            bits[i]+=n%2;
            n/=2;
        }
    }
    void subt(int n){
        int x=1;
        for(int i=0;i<32 && n>0;i++){
            bits[i]-=n%2;
            if(bits[i]==0 && n%2==1){
                r-=x;
            }
            n/=2;
            x*=2;
        }
    }
    public int minimumSubarrayLength(int[] nums, int k) {
        if(k==0){
            return 1;
        }
        int i=0,j=0,n=nums.length;
        int res=n+1;
        while(i<n){
            while(j<n && r<k){
                r=r|nums[j];
                add(nums[j]);
                j++;
            }
            if(r<k){
                break;
            }
            res=Math.min(j-i,res);
            if(res==1){
                return 1;
            }
            subt(nums[i]);
            i++;
        }
        if(res==n+1){
            return -1;
        }
        return res;
    }
}