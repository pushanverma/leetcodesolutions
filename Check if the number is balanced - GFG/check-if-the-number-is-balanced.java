// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean balancedNumber(String str)
    {
    
        // String ch1=str.substring(0,str.length()/2);
        // int num1=Integer.parseInt(ch1);
        int sum1=0;
        
        for(int i =0;i<str.length()/2;i++)
        {
            sum1+=Integer.parseInt(str.charAt(i)+"");
        }
    // while(num1!=0)
    // {
    // sum1+=num1%10;
    // num1=num1/10;
    // }
        
        // String ch2=str.substring( (str.length()/2)+1 );
        // int num2=Integer.parseInt(ch2);
        int sum2=0;
        
        for(int j =str.length()/2+1;j<str.length();j++)
        {
            sum2+=Integer.parseInt(str.charAt(j)+"");
        }
    // while(num2!=0)
    // {
    // sum2+=num2%10;
    // num2=num2/10;
    // }
    
  return sum1==sum2;
            
        }
        // your code here  
       
        
    
}