class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int res=1000000,n=nums.length;
        res=n+1;
        long[] prefix=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        Deque<Integer> q=new LinkedList<>();
        for(int i=0;i<=n;i++){
            while(!q.isEmpty() && prefix[q.getLast()]>=prefix[i]){
                q.removeLast();
            }
            while(!q.isEmpty() && prefix[q.getFirst()]+k<=prefix[i] ){
                res=Math.min(res, i-q.removeFirst());
            }
            q.addLast(i);
        }
        return res==n+1 ? -1:res;
    }
}