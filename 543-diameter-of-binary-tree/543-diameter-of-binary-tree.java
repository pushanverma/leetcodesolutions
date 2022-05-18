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
//     class Pair
//     {
//         int height;
//         int diameter;
        
//         Pair()
//         {
            
//         }
//         Pair(int height, int diameter)
//         {
//             this.height =height;
//             this.diameter=diameter;
//         }
            
//     }
    
    public int[] diameter(TreeNode node)
    {
        if(node==null)
        {
            return new int[]{-1,0};
        }
            
        //0th position is -height 
        //1st position is diameter
        int[] leftans =diameter(node.left);
        int[] rightans =diameter(node.right);
        
        int []mypair =new int[2];
        
        
        mypair[0]=Math.max(leftans[0],rightans[0])+1;
        int acrossNode =leftans[0]+rightans[0]+2;
         mypair[1]=Math.max(acrossNode,Math.max(leftans[1],rightans[1]));
        
        return mypair;
    }
    
    
    public int diameterOfBinaryTree(TreeNode root) 
    {
        int []ans =diameter(root);
        return ans[1];
        
    }
}