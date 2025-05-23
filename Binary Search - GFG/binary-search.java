// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) 
    {
        // code here
        
        for(int i=0;i<n;i++)
        {
            int left =0;
            int right=n;
            int mid =(left+right)/2;
            
            if(mid<k)
            {
                //left region
                right=mid;
            }
            else if(mid==k)
            {
            System.out.println(mid);
            }
            else
            {
                //right region
                left =mid+1;
            }
            
            if(k==arr[i])
            {
                return i;
            }
            
        }
        return -1;
    }
}