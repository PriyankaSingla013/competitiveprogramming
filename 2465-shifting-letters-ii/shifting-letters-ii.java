class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] arr=new int[s.length()+1];
        for (int[]shift:shifts){
                if(shift[2]==0){
                    arr[shift[0]]--;
                    arr[shift[1]+1]++;
                }
                else{
                    arr[shift[0]]++;
                    arr[shift[1]+1]--;
                }
        }
        for (int i=0;i<s.length();i++){
            arr[i+1]+=arr[i];
            arr[i]+=s.charAt(i)-'a';
        }
        StringBuilder str=new StringBuilder();
        for (int i=0;i<s.length();i++){
            str.append((char)((arr[i]+260000)%26+'a'));
        }
        return str.toString();
    }
}