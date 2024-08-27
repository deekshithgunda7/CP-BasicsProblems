class Node{
    int first;
    int second;
    int third;
    public Node(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        
        Queue<Node> q=new LinkedList<>();
        int[][] dist = new int[n][m];
        int[][] vis = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    vis[i][j]=1;
                    q.offer(new Node(i,j,0));
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int[] dx={1,-1,0,0};
        int[] dy={0,0,-1,1};
        
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int steps=q.peek().third;
            q.poll();
            dist[row][col]=steps;
            for(int i=0;i<4;i++){
                int nrow=row+dx[i];
                int ncol=col+dy[i];
                
                if(nrow >=0 && ncol >=0 && nrow<n && ncol <m && vis[nrow][ncol] == 0){
                     vis[nrow][ncol]=1;
                     q.offer(new Node(nrow,ncol,steps+1));
                }

            }
        }
        return dist;
    }
}