// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        ArrayList<String> s1=new ArrayList<>();
        // ArrayList<String> s2=new ArrayList<>();
        // ArrayList<String> s3=new ArrayList<>();
        String alpha="";
        String num="";
        String special="";
        for(int i =0;i<S.length();i++)
        {
            char ch =S.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                alpha+=ch+"";
            }
            else if(ch-'0'>=0 && ch-'0'<=9)
            {
                num+=ch+"";
            }
            else
            {
                special+=ch+"";
            }
        }
        s1.add(alpha);
        s1.add(num);
        s1.add(special);
        return s1;
        
    }
} 
