class Solution {
    int[] root;
    int[] rank;
    int find(int x){
        if(x==root[x]){
            return x;
        }
        return root[x]=find(root[x]);
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        root=new int[n+1];
        rank=new int[n+1];
        for(int i=0;i<=n;i++){
            root[i]=i;
            rank[i]=1;
        }
        for(int[] edge:edges){
            int x=find(edge[0]);
            int y=find(edge[1]);
            if(x==y){
                return edge;
            }
            if(rank[x]>rank[y]){
                root[x]=y;
            }
            else if(rank[x]<rank[y]){
                root[y]=x;
            }
            else{
                root[x]=y;
                rank[x]++;
            }
        }
        return new int[]{-1,-1};
    }
}