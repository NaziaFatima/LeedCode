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
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        if(root.left== null && root.right ==null) return 1;
          else 
          {     
              if(root.left != null && root.right!=null)
              return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
              else 
              {
                  if(root.left!=null) 
                  {
                      return maxDepth(root.left)+1;
                  }
                  else //if(root.right!=null) 
                  {
                      return maxDepth(root.right)+1;
                  }
              }
          }
  }
}
