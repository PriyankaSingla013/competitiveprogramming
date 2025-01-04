class Solution {
    public int countPalindromicSubsequence(String s) {
        int[][] arr=new int[26][26];
        List<Integer> list=new ArrayList<>();
        Set<Integer> set =new HashSet<>();
        int n=s.length();
        for(char c:s.toCharArray()){
            if(set.contains(c-'a')){
                for(int i=0;i<26;i++){
                    if(arr[c-'a'][i]==1)
                    arr[c-'a'][i]=-1;
                }
            }
            for(int l:list){
                if(arr[l][c-'a']==0)
                arr[l][c-'a']=1;
            }
            if(!set.contains(c-'a')){
                set.add(c-'a');
                list.add(c-'a');
            }
        }
        int res=0;
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if(arr[i][j]==-1){
                    res++;
                }
            }
        }
        return res;
    }
}