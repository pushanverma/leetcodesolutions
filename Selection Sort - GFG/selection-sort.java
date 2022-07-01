// { Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
	    //this function is only used to return minimun Index
	    
        // code here such that selectionSort() sorts arr[]
        int minIdx=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[minIdx])
            {
                minIdx=j;
            }
        }
        return minIdx;
        
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    //for loop for iteration
	    for(int x=0;x<n-1;x++)
	    {
	        
	            int min=select(arr,x);
	           // if(min !=x)
	           // {
	            int temp =arr[min];
	            arr[min]=arr[x];
	            arr[x]=temp;
	           // }
	            
	       
	    }
	}
}