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
    public long kthLargestLevelSum(TreeNode root, int k) {
        int level=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        PriorityQueue<Long> pQueue= new PriorityQueue<Long>(Collections.reverseOrder());
        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++){
                root=q.poll();
                sum+=root.val;
                if(root.left!=null){
                    q.add(root.left);
                }
                if(root.right!=null){
                    q.add(root.right);
                }
            }
            pQueue.add(sum);
            level++;
        }
        if(level<k){
            return -1;
        }
        for(int i=1;i<k;i++){
            pQueue.poll();
        }
        return pQueue.peek();
    }
}