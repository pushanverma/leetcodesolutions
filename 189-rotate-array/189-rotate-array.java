class Solution {
    
    public static void reverse(int []nums,int li,int ri)
    {
        while(li<=ri)
        {
            int temp=nums[li];
            nums[li]=nums[ri];
            nums[ri]=temp;
            li++;
            ri--;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        //if the length is greater
        k=k%nums.length;
        
        //if the length is negatve
        // if(k<0)
        // {
        //     k=k+nums.length;
        // }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
        
        
    }
}