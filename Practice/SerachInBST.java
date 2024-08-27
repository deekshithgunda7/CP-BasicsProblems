class TreeNode{
    int val;
    TreenNode left;
    TreeNode right;
    TreeNode(int v){
        val = v;
    }
}
class Solution{
   public TreeNode SerachTree(TreeNode root,int val){
             
            while(root != null && root.val != val){
                root = root.val < val ? root.right:root.left;
             }
             return root;
   }
}