class Solution {
    
public static void swap(int [][]arr,int a,int b)
{
    int temp=arr[a][b];
    arr[a][b]=arr[b][a];
    arr[b][a]=temp;
}
    public static void reverse(int [][]arr)
    {
        int n=arr.length;
        
        for(int r=0;r<n;r++)
        {
            int li=0;
            int ri=n-1;
            while(li<=ri)
            {
                int temp=arr[r][li];
                arr[r][li]=arr[r][ri];
                arr[r][ri]=temp;
                
                li++;
                ri--;
            }
        }
        
    }
    public void rotate(int[][] matrix) 
    {
    int n=matrix.length;
        
    //transpose
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                swap(matrix,i,j);
            }
        }
        reverse(matrix);
        //reverse

        
    }
}