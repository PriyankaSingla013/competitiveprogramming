class Solution {
    public List<String> stringSequence(String target) {
        List<String> res=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<target.length();i++){
            s.append('a');
            res.add(s.toString());
            while(s.charAt(i)!=target.charAt(i)){
                s.setCharAt(i,(char)(s.charAt(i)+1));
                res.add(s.toString());
            }
        }
        return res;
    }
}