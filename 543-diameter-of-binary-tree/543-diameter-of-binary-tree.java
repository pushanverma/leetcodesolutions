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
    
    // -(int)1e9 is reffered to -infinity and (int)1e9 referred to as +infinity 
     static int ans =-(int)1e9;
    
    
    public int diameter(TreeNode node)
    {
        if(node==null)
        {
            return -1;
        }
            
        //0th position is -height 
        //1st position is diameter
        int leftHeight =diameter(node.left);
        int rightHeight=diameter(node.right);
        
        ans =Math.max(ans,leftHeight+rightHeight+2);
        // int mypair =new int[2];
        int myHeight =Math.max(leftHeight,rightHeight)+1;
        
        // mypair[0]=Math.max(leftans[0],rightans[0])+1;
        // int acrossNode =leftans[0]+rightans[0]+2;
        //  mypair[1]=Math.max(acrossNode,Math.max(leftans[1],rightans[1]));
        
        return myHeight;
    }
    
    
    public int diameterOfBinaryTree(TreeNode root) 
    {
        ans =-(int)1e9;
        diameter(root);
        return ans;
        
    }
}