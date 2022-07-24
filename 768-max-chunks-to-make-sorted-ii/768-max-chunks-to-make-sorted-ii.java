class Solution {
    public int maxChunksToSorted(int[] arr) 
    {
    int []minfromRight=new int[arr.length];
        
        minfromRight[arr.length-1]=arr[arr.length-1];
        //min from Right part 
        for(int i=arr.length-2;i>=0;i--)
        {
            minfromRight[i]=Math.min(arr[i],minfromRight[i+1]); 
            //i+1 in minfromRight because we are calculating from the right side 
        }
        
        int count =0;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length-1;i++)
        {
            max=Math.max(arr[i],max);
            if(max<=minfromRight[i+1])
            {
                count++;
            }
        }
        
        return count+1;
        
        
        
    }
}