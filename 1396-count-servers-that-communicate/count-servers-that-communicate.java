class Solution {
    public int countServers(int[][] grid) {
        int m=grid.length,n=grid[0].length,res=0;
        boolean[] r=new boolean[m];
        boolean[] c=new boolean[n];
        for(int i=0;i<m;i++){
            int x=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    x++;
                }
            }
            if(x>1){
                r[i]=true;
            }
        }
        for(int i=0;i<n;i++){
            int x=0;
            for(int j=0;j<m;j++){
                if(grid[j][i]==1){
                    x++;
                }
            }
            if(x>1){
                c[i]=true;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && (r[i] || c[j])){
                    res++;
                }
            }
        }
        return res;
    }
}