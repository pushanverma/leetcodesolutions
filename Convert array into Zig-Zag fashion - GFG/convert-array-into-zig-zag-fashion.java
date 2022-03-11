// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution {
    public static void swap(int []arr,int a ,int b)
    {
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    void zigZag(int arr[], int n) 
    {
        // code here
        // (even) pe chota hona chahiye 
        //(odd) pe bada hona chahiye
        for(int i=0;i<arr.length-1;i++)
        {
            if(i%2==0 && arr[i]>arr[i+1])
            {
                swap(arr,i,i+1);
            }
            else if(i%2==1 && arr[i]<arr[i+1]) 
            {
               swap(arr,i,i+1);
            }
        }
        
        
        
    }

}