class Solution{
    public List<List<Integer>> leverlOrder(TreeNode root){
        List<List<Integer>> lst=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root.val);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> lst=new ArrayList<>();
            for(int i=0;i<size;i++){
                  TreeNode node=q.poll();
                  lst.add(node.val);
                  if(node.left!=null){
                    q.offer(node.left);
                  }
                  if(node.right!=null){
                    q.offer(node.right);
                  }
            }
            ans.add(lst);
        }
        return ans;

    }
}