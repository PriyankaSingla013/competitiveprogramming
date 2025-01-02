class Solution:
    def fib(self, n: int) -> int:
        dict={}
        def fibo(n):
            if n<2:
                return n
            if(n in dict.keys()):
                return dict[n]
            dict[n]= fibo(n-1)+fibo(n-2)
            return dict[n]
        return fibo(n)
        