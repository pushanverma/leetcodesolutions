class Solution {
    public int brokenCalc(int startValue, int target) 
    {
        if(target<=startValue) //base condition
        {
            return startValue-target;
        }
        
       
            if(target%2==0) //if target is even 
             {
            return 1+brokenCalc(startValue,target/2);
             }
            else // if target is odd
            {
            return 1+brokenCalc(startValue,target+1);
            }
    
      
                
    }
}