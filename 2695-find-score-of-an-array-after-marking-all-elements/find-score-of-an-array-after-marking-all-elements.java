class Solution {
    public long findScore(int[] nums) {
        long res=0;
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,List<Integer>> list=new HashMap<>();
        int n=nums.length;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            int y=map.getOrDefault(nums[i],0);
            if(y==0){
                list.put(nums[i],new ArrayList<>());
            }
            list.get(nums[i]).add(i);
            map.put(nums[i],y+1);
        }
        List<Integer> set= new ArrayList<>(map.keySet());
        Collections.sort(set);
        for(int i=0;i<set.size();i++){
            int val=set.get(i);
            while(map.get(val)>0){
                res+=val;
                List<Integer> l=list.get(val);
                int y=map.get(val);
                while(vis[l.get(0)]==true){
                    l.remove(0);
                }
                int idx=l.get(0);
                vis[idx]=true;
                map.put(val,y-1);
                if(idx>0 && vis[idx-1]==false){
                    vis[idx-1]=true;
                    map.put(nums[idx-1],map.get(nums[idx-1])-1);
                }
                if(idx<n-1 && vis[idx+1]==false){
                    vis[idx+1]=true;
                    map.put(nums[idx+1],map.get(nums[idx+1])-1);
                }
            }
        }
        return res;
    }
}