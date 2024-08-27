// number of components

class Solution {
    public void dfs(int v,ArrayList<ArrayList<Integer>> lst,int[] vis){
        vis[v]=1;
        for(int i:lst.get(v)){
            if(vis[i] != 1){
                dfs(i,lst,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int m = isConnected.length;
        int n =isConnected[0].length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<m;i++){
             adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == j) continue;
                if(isConnected[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }
        int[] vis=new int[m];
        int cnt=0;
        for(int i=0;i<m;i++){
            if(vis[i] != 1){
                cnt++;
                dfs(i,adj,vis);
            }
        }
        return cnt;
        
    }
}