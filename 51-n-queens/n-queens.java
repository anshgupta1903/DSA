class Solution {



    public boolean isSafe(char[][]arr,int row,int col,int n){
        // boolean result = true;
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q') return false;
        }

        for(int r=row-1,c=col-1; r>=0 && c>= 0; r--,c--){
           if(arr[r][c]=='Q') return false; 
        }

        for(int r=row-1,c=col+1; r>=0 && c<n;r--,c++){
            if(arr[r][c] == 'Q') return false;
        }
        return true;
    }


    public void backtrack(char[][] arr,int row, int n, List<List<String>> res){
        if(row==n){
            
            List<String> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb = new StringBuilder("");

                for(int j=0;j<n;j++){
                    if(arr[i][j] !='Q') arr[i][j] = '.';
                    sb.append(arr[i][j]);
                    
                }
                list.add(sb.toString().trim());
            }
            res.add(list);
            return;
        }
    
        
        for(int c=0;c<n;c++){
                if(isSafe(arr, row, c, n)){
                    arr[row][c] = 'Q';
                    backtrack(arr, row+1, n, res);
                    arr[row][c] = '.';

                }
            }
        
        // return found;

    }
 
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        backtrack(new char[n][n], 0, n, res);
        return res;
        
        // return new ArrayList<>();
    }
}