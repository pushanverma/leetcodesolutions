class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        ArrayList<Integer>list =new ArrayList<>();
        int n =matrix.length;
        int m =matrix[0].length;
        
        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=m-1;
        
        int count=0;
        int total=n*m;
        
        while(count<total)
        {
            // right
            for(int j=minc;j<=maxc && count<total;j++)
            {
                list.add(matrix[minr][j]);
                count++;
            }
            minr++;
            
            //down
            for(int i=minr;i<=maxr && count<total;i++)
            {
                list.add(matrix[i][maxc]);
                count++;
            }
            maxc--;
            
            //left
            for(int j=maxc;j>=minc && count<total;j--)
            {
                list.add(matrix[maxr][j]);
                count++;
            }
            maxr--;
            //top
            for(int i=maxr;i>=minr && count<total;i--)
            {
                list.add(matrix[i][minc]);
                count++;
            }
            minc++;
            
        }
        return list;
    }
}