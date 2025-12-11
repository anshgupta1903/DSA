class Node{
    int row;
    int col;
    int time;
    public Node(int r, int c, int t){
        this.row = r;
        this.col = c;
        this.time = t;
    }
}
class Solution {
    int[][] directions = {
        {1,0},
        {-1, 0},
        {0, 1},
        {0, -1}};
    public int orangesRotting(int[][] grid) {
        Queue<Node> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 2){
                    q.offer(new Node(i, j, 0));
                }
                else if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        int minTime = 0;
        while(!q.isEmpty()){
            Node curr = q.poll();
            for(int[] dir: directions){
                int r = curr.row + dir[0];
                int c = curr.col + dir[1];
            if(r>=0 && r<rows && c>=0 && c<cols && grid[r][c] == 1){
                grid[r][c] = 2;
                count--;
                minTime = curr.time+1;
                q.offer(new Node(r, c, curr.time+1));
            }

            
        }
        }
        if(count!=0) return -1;
        return minTime;
    }
}