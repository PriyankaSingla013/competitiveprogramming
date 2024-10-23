class Solution {
    int[][] store;
    public int calculateMinimumHP(int[][] dungeon) {
        store=new int[dungeon.length][dungeon[0].length];
        for(int i=0;i<dungeon.length;i++){
            Arrays.fill(store[i],-1);
        }
        return helper(0,0,dungeon,dungeon.length,dungeon[0].length)+1;
    }
    int helper(int i,int j,int[][] arr,int m,int n){
        if(i==m || j==n){
            return Integer.MAX_VALUE;
        }
        if(store[i][j]!=-1){
            return store[i][j];
        }
        if(i==m-1 && j==n-1){
            store[i][j]= Math.max(0,-arr[i][j]);
            return store[i][j];
        }
        int x=helper(i+1,j,arr,m,n);
        int y=helper(i,j+1,arr,m,n);
        x=Math.min(x,y);
        store[i][j]= Math.max(0,x-arr[i][j]);
        return store[i][j];
    }
}