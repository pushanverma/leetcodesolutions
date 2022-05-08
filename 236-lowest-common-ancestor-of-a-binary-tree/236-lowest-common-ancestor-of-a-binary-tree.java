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
    
    public ArrayList<TreeNode> n2rpath(TreeNode node ,int data)
    {
        if(node ==null)
        {
            return new ArrayList<>();
        }
        if(node.val==data)
        {
            ArrayList<TreeNode>base =new ArrayList<>();
            base.add(node);
            return base;
        }
        ArrayList<TreeNode>leftans=n2rpath(node.left,data);
        if(leftans.size()>0)
        {
            leftans.add(node);
            return leftans;
        }
        ArrayList<TreeNode>rightans=n2rpath(node.right,data);
        if(rightans.size()>0)
        {
            rightans.add(node);
            return rightans;
        }
    return new ArrayList<>();
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
     ArrayList<TreeNode>pn2rpath=n2rpath(root,p.val);
     ArrayList<TreeNode>qn2rpath=n2rpath(root,q.val);
        
        int i=pn2rpath.size()-1;
        int j=qn2rpath.size()-1;
        TreeNode lca =null;
        while(i>=0 && j>=0)
        {
            if(pn2rpath.get(i).val != qn2rpath.get(j).val)
            {
                break;
            }
            lca=pn2rpath.get(i);
            i--;
            j--;
            
        }
        return lca;
    }
}