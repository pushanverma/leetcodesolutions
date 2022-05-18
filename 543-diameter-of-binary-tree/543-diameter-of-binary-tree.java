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
    class Pair
    {
        int height;
        int diameter;
        
        Pair()
        {
            
        }
        Pair(int height, int diameter)
        {
            this.height =height;
            this.diameter=diameter;
        }
            
    }
    
    public Pair diameter(TreeNode node)
    {
        if(node==null)
        {
            return new Pair(-1,0);
        }
        
        Pair leftans =diameter(node.left);
        Pair rightans =diameter(node.right);
        
        Pair mypair=new Pair();
        
        mypair.height=Math.max(leftans.height,rightans.height)+1;
        int acrossNode =leftans.height+rightans.height+2;
         mypair.diameter=Math.max(acrossNode,Math.max(leftans.diameter,rightans.diameter));
        
        return mypair;
    }
    
    
    public int diameterOfBinaryTree(TreeNode root) 
    {
        Pair ans =diameter(root);
        return ans.diameter;
        
        
    }
}