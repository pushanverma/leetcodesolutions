// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            int sum=0;
            //code here.
            String u="";
            for(int i=0;i<s.length();i++)
            {
                char ch =s.charAt(i);
                if(ch>='0' && ch<='9')
                {
                    sum+=ch-'0';
                }
                else
                {
                   u+=ch; 
                }
            }
            
            //string to char array
            char[]arr =u.toCharArray();
            //sorting of array
            Arrays.sort(arr);
            //filling sorted array in a string (because we have to pass a string)
            String sorted =new String(arr);
            //since string can add elements (int /char anything so adding sum)
            //hence question fulfilled
            return (sorted+sum);
            
        }
}
