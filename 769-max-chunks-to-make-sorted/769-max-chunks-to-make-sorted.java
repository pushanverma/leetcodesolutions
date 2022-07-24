class Solution {
    public int maxChunksToSorted(int[] arr) 
    {
        if(arr.length==0)
        {
            return 0;
        }
        int count=0;
        int max =Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            //we also have to maintain max 
            max=Math.max(max,arr[i]);
            
            if(i==max)
            {
                count++;
            }
        }
        
        //this count will tell you the chunks that has been made .
        return count ;
        
    }
}