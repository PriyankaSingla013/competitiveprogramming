class Solution {
    public int maxMoves(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] moves=new int[m][n];
        for(int j=n-2;j>=0;j--){
            for(int i=0;i<m;i++){
                if(grid[i][j]<grid[i][j+1]){
                    moves[i][j]=Math.max(moves[i][j],1+moves[i][j+1]);
                }
                if(i>0 && grid[i][j]<grid[i-1][j+1]){
                    moves[i][j]=Math.max(moves[i][j],1+moves[i-1][j+1]);
                }
                if(i<m-1 && grid[i][j]<grid[i+1][j+1]){
                    moves[i][j]=Math.max(moves[i][j],1+moves[i+1][j+1]);
                }
            }
        }
        int res=0;
        for(int i=0;i<m;i++){
            res=Math.max(res,moves[i][0]);
        }
        return res;
    }
}