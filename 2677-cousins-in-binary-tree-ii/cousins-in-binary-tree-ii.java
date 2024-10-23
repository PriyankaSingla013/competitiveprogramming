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
    int depth=0;
    int[] level;
    public TreeNode replaceValueInTree(TreeNode root) {
        depth=dep(root);
        level=new int[depth];
        dfs(root,0);
        dfs2(root,0,root.val);
        return root;
    }
    void dfs2(TreeNode root,int l,int val){
        if(root==null){
            return;
        }
        root.val=level[l]-val;
        int x=0;
        if(root.left!=null){
            x+=root.left.val;
        }
        if(root.right!=null){
            x+=root.right.val;
        }
        dfs2(root.left,l+1,x);
        dfs2(root.right,l+1,x);
        
    }
    int dep(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(dep(root.left),dep(root.right))+1;
        
    }
    void dfs(TreeNode root,int n){
        if(root==null){
            return;
        }
        level[n]+=root.val;
        dfs(root.left,n+1);
        dfs(root.right,n+1);
    }
}