/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public static TreeNode createBST(int []nums,int i,int j)
    {
        if(i>j)
        {
            return null;
        }
        int mid =(i+j)/2;
        TreeNode node =new TreeNode(nums[mid]);
        node.left =createBST(nums,i,mid-1);
        node.right=createBST(nums,mid+1,j);
        
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        if(nums.length==0)
        {
            return null;
        }
        
        return createBST(nums,0,nums.length-1);
        
    }
}