// { Driver Code Starts
// Java program to demonstrate working of Scanner in Java
import java.util.*;
import java.io.*;
class Abc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a[],b;
            a= new int[n][n];
            b= new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    int p=sc.nextInt();
                    a[i][j]=p;
                }
            }
            int Max=0;
            for(int i=0;i<n;i++)
            {
                int p=sc.nextInt();
                b[i]=p;
            }
            Complete obj = new Complete();
            ArrayList<Integer> ans;
            ans = obj.array(a, b, n);
            for(int i: ans)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        ArrayList<Integer> al =new ArrayList<>();
        int sum=0;
        for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(i==j)
                {
                    sum+=a[i][j];
                }
            }
        }
        al.add(sum);
        
        int max=b[0];
        for(int k=0;k<b.length;k++)
        {
            if(b[k]>max)
            {
                max=b[k];
            }
        }
        al.add(max);
        
        return al;
    }
}
