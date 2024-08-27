class Pair{
    int first;
    int last;
    Pair(int first,int last){
        this.first=first;
        this.last=last;
    }
}
public void bfs(char[][] grid,int ro,int col,int[][] vis ){
       vis[ro][col]=1;
       Queue<Pair> q=new LinkedList<>();
       int n= grid.length;
       int m= grid[0].length;
       q.offer(new Pair(ro,col));
       while(!q.isEmpty()){
        int row = q.peek().first;
        int col = q.peek().last;
        q.poll();
        int[] dx={1,-1,0,0};
        int[] dy={0,0,1,-1};
        for(int j=0;j<4;j++){
            int nrow=row+dx[j];
            int ncol=col+dy[j];
            if(nrow>=0 && nrow<n  && ncol >=0 && ncol <m  && grid[nrow][ncol] == 1 && vis[nrow][ncol] == 0){
                vis[nrow][ncol] = 1;
                q.offer(new Pair(nrow,ncol));
            }
        }
       }
}
public int numIslands(char[][] grid){
    int n=grid.length;
    int m=grid[0].length;

    int[][] vis =new int[n][m]; 
    int cnt=0;
    for(int row=0;row<n;row++){
        for(int col=0;col<m;col++){
            if(vis[row][col]!=1 && grid[row][col] == '1'){
                cnt++;
                bfs(grid,row,col,vis);
            }
        }
    }
    return cnt;
}