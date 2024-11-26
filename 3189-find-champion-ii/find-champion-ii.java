class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indegree=new int[n];
        for(int[] edge:edges){
            indegree[edge[1]]++;
        }
        int res=-2;
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                if(res==-2){
                    res=i;
                }
                else{
                    return -1;
                }
            }
        }
        return res;
    }
}