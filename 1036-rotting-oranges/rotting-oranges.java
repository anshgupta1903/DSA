class Node{
    int row, col, time;
    Node(int i, int j, int t){
        row = i;
        col = j;
        time = t;
    }
}


class Solution {

    int[][] directions = new int[][]{
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
    public boolean isValid(int i, int j, int rows, int cols){
        return (i>=0 && j>=0 && i<rows && j<cols);
    }
    public int orangesRotting(int[][] grid) {
        Queue<Node> q = new ArrayDeque<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        for(int i = 0; i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.offer(new Node(i, j, 0));
                }
                else if(grid[i][j] == 1){
                    fresh+=1;
                }
            }
        }
        int minTime = 0;
        while(!q.isEmpty()){
            Node curr = q.poll();
            for(int[] dir:directions)
            {
                int newRow = curr.row + dir[0];
                int newCol = curr.col + dir[1];
                if(isValid(newRow, newCol, rows, cols) && grid[newRow][newCol]==1)
                {
                    q.offer(new Node(newRow, newCol, curr.time+1));
                    grid[newRow][newCol] = 2;
                    minTime = curr.time + 1;
                    fresh--;
                }
            }

        }

        if(fresh == 0) return minTime;
        return -1;
    }
}