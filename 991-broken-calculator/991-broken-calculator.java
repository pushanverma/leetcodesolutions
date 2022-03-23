class Solution {
    public int brokenCalc(int startValue, int target) 
    {
    int count=0;
        while(target>startValue)
        {
            //when target is even 
            if(target%2==0)
            {
                target=target/2;
            }
            
            //when target is odd
            else
            {
                target =target+1;
            }
            count++;
        }
        //if target is less than or equal to then
        
        return count+(startValue-target);
    }
}