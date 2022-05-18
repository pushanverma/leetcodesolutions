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
    
    public int Height(TreeNode node)
    {
        if(node==null)
        {
            return -1;
        }
        int lh=Height(node.left);
        int rh=Height(node.right);
        int myH=Math.max(lh,rh)+1;
        return myH;
    }
    
    //Minimum Height is -1 and Minimun diameter is 0 , therefore 
    //base condition mei wahi likha hai 
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
    
        int ld=diameterOfBinaryTree(root.left); //acroos only left side
        int rd=diameterOfBinaryTree(root.right); //across only right side
        
        int lh=Height(root.left);
        int rh=Height(root.right);
        
        int acrossNode =lh+rh+2; //across node 
        
        // since diameter can be pn any side (i.e across node / left/right , so comparing )
        
        int myDia =Math.max(acrossNode,Math.max(ld,rd));
        
        return myDia;
    }
}