class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public void  postOrder(TreeNode  root,List<Integer> lst){
    if(root == null) return ;
    postOrder(root.left,lst);
    postOrder(root.right,lst);
    lst.add(root.val);
}
public List<Integer> postOrderTraversal(TreeNode node){
    List<Integer> lst=new ArrayList<>();
    postOrder(node,lst);
    return lst;
}