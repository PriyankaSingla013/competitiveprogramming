class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        int[] original=new int[n];
        original[0]=0;
        boolean solved =true;
        for(int i=0;i<n-1;i++){
            if((original[i]^1)==derived[i]){
                original[i+1]=1;
            }
            else if((original[i]^0) ==derived[i]){
                original[i+1]=0;
            }
            else{
                solved=false;
                break;
            }
        }
        if(solved){
            if((0^original[n-1])==derived[n-1]){
                System.out.println(1);
                return true;
            }
        }
        original=new int[n];
        original[0]=1;
        solved =true;
        for(int i=0;i<n-1;i++){
            if((original[i]^1)==derived[i]){
                original[i+1]=1;
            }
            else if((original[i]^0)==derived[i]){
                original[i+1]=0;
            }
            else{
                solved=false;
                break;
            }
        }
        if(solved){
            if((1^original[n-1])==derived[n-1]){
                System.out.println(2);
                return true;
            }
        }
        return false;
    }
}