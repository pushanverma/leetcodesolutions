class Solution {
    public int[][] generateMatrix(int n) 
    {
    int [][]arr=new int[n][n];
        int no=1;
        int count =1;
        int total=n*n;
        
        
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        while(count<=total)
        {
            //right
            for(int j=minc;j<=maxc && no<=n*n;j++)
            {
                arr[minr][j]=no;
                no++;
                count++;
            }
            minr++;
            
            //down
            for(int i=minr;i<=maxr && no<=n*n ;i++)
            {
                arr[i][maxc]=no;
                no++;
                count++;
            }
            maxc--;
            
            
            //left
            for(int j=maxc;j>=minc && no<=n*n;j--)
            {
                arr[maxr][j]=no;
                no++;
                count++;
            }
             maxr--;
            
            
            //top
            for(int i=maxr;i>=minr && no<=n*n;i--)
            {
                arr[i][minc]=no;
                no++;
                count++;
            }
            minc++;
            
        }
        
     return arr;   
    }
}