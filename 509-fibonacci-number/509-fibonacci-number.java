class Solution {
    
    public int fib(int n) 
    {
        int  a=0;
        int  b=1;
        for(int i=0;i<n;i++)
        {
            int sum=a+b;
            a=b;
            b=sum;
        }    
        return a;
    }
}