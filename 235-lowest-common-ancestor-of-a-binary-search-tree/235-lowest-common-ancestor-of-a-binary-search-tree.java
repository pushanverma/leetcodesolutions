/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
    TreeNode curr =root;
        while(curr!=null)
        {
        if(p.val<curr.val && q.val<curr.val)
        {
            // left region
            curr=curr.left;
        }
        else if(p.val>curr.val && q.val>curr.val)
        {
            // right region
            curr=curr.right;
        }
        else
        {
            // divergent 
            return curr;
        }

            
        }
        return null;
    }
}