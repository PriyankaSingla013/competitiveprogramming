class Solution {
    public long minimumSteps(String s) {
        long res=0,current=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                res+=i-current;
                current++;
            }
        }
        return res;
    }
}