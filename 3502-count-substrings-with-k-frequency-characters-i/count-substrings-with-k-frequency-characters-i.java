class Solution {
    public int numberOfSubstrings(String s, int k) {
        int i=0,j=0;
        int n=s.length();
        int[] arr=new int[26];
        int x=0,res=0;
        while(i<n){
            while(j<n && x<1){
                int y=s.charAt(j)-'a';
                arr[y]++;
                if(arr[y]==k){
                    x++;
                }
                j++;
            }
            if(x<1){
                break;
            }
            res+=n-j+1;
                int y=s.charAt(i)-'a';
                arr[y]--;
                if(arr[y]==k-1){
                    x--;
                }
                i++;
        }
        return res;
    }
}