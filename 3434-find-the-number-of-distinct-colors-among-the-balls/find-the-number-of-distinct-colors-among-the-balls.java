class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> color=new HashMap<>();
        int dis=0;
        int m=queries.length;
        int[] res=new int[m];
        int i=0;
        for(int[] query:queries){
            int x=map.getOrDefault(query[0],-1);
            if(x!=-1){
                int y=color.get(x);
                if(y==1){
                    dis--;
                }
                color.put(x,y-1);
            }
            map.put(query[0],query[1]);
            int y=color.getOrDefault(query[1],0);
            if(y==0){
                dis++;
            }
            color.put(query[1],y+1);
            res[i]=dis;
            i++;
        }
        return res;
    }
}