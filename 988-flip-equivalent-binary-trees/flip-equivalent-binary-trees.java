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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        bak(root1);
        bak(root2);
        return bfs(root1,root2);
    }
    boolean bfs(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val !=root2.val){
            return false;
        }
        return bfs(root1.left,root2.left) && bfs(root1.right,root2.right);
    }
    void bak(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null){
            root.left=root.right;
            root.right=null;
        }
        bak(root.left);
        if(root.right==null){
            return;
        }
        bak(root.right);
        if(root.left.val>root.right.val){
            TreeNode t=root.left;
            root.left=root.right;
            root.right=t;
        }
        
    }
    
}