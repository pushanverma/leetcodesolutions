// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


 // } Driver Code Ends
//User function Template for Java

class Solution
{
    
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        //compare two elements and shift largest ele at last 
        //1st loop - iteration 
        //2nd loop -
        for(int x=1;x<=n-1;x++)
        {
            for(int i=0;i<=(n-1)-x;i++)
            {
                if(arr[i+1]<arr[i])
                {
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    
                }
            }
        }
    }
}

// { Driver Code Starts.

class Sorting
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //taking total elements
			int n = sc.nextInt();
			
			//creating a new array of length n
			int arr[] = new int[n];
			
			//inserting elements to the array
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			
			//calling bubbleSort() method
			new Solution().bubbleSort(arr,n);
			
			//calling printArray() method
			printArray(arr);
			
		t--;	
		}
	}

}  // } Driver Code Ends