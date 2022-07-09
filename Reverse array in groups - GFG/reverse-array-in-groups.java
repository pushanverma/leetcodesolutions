// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        
        //while testcases exist
        while(t-->0){
            
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);
            
            ArrayList<Integer> arr = new ArrayList<>();            
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }
            
            Solution obj = new Solution();
            obj.reverseInGroups(arr, n, k);
            
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    public static void swap(ArrayList<Integer>arr,int lo,int hi)
    {
     while(lo<hi)
     {
         Collections.swap(arr,lo,hi);
         lo++;
         hi--;
     }
    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) 
    {
        
        int i=0;
        // code here
        for( i=0;i+k<n;i+=k)
        {
            int st=i;
            int end=i+k-1; //i-0 ,k-3 ,i+k-1 =2
            swap(arr,st,end);
        }
        //jiske group mei bande hi kam ho
        
        if(i+k!=n)
        {
            swap(arr,i,n-1);
        }
    }
}
