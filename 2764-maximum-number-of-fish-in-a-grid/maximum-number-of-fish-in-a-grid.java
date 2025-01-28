class Solution {
    int m,n;
    public int findMaxFish(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    res=Math.max(res,dfs(grid,i,j));
                }
            }
        }
        return res;
    }
    int dfs(int[][] grid,int r,int c){
        int[] rows={0,0,1,-1};
        int[] cols={1,-1,0,0};
        int res=grid[r][c];
        grid[r][c]=0;
        for(int i=0;i<4;i++){
            int row=r+rows[i];
            int col=c+cols[i];
            if(row>=0 && col>=0 && row<m && col<n && grid[row][col]!=0){
                res+=dfs(grid,row,col);
            }
        }
        return res;
    }
}