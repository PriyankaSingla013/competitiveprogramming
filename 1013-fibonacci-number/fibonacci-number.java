class Solution {
    Map<Integer,Integer> map=new HashMap<>();
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int res= fib(n-1)+fib(n-2);
        map.put(n,res);
        return res;
    }
}