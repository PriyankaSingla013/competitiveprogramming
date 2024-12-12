class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>(Collections.reverseOrder());
        long sum=0;
        for(int i=0;i<gifts.length;i++){
            q.add(gifts[i]);
            sum+=gifts[i];
        }
        while(k>0){
            int prev=q.poll();
            int sq=(int)Math.sqrt(prev);
            sum-=prev-sq;
            q.add(sq);
            k--;
        }
        return sum;
    }
}