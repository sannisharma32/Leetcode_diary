class Solution {

    private int[][]dir={
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
    public boolean exist(char[][] board, String word) {

            int m= board.length;
            int n=board[0].length;

            for(int row=0;row<m ;row++ ){
                for(int col=0;col<n;col++){
                    if(dfs(board, word,row, col,0)){
                        return true;
                    }
                }
            }
            return false;
    }

    public boolean dfs(char[][]board,String words, int row, int col, int index){

            if(row<0 || row>= board.length || col<0 || col>=board[0].length){
                return false;
            }

            if(board[row][col]!= words.charAt(index)){
                return false;
            }

            if(index == words.length()-1){
                return true;
            }


            char temp= board[row][col];
            board[row][col]='#';

            for(int []d:dir){
                int nr= row+d[0];
                int nc=col+d[1];


                if(dfs(board, words,nr, nc,index+1)){
                    board[row][col]=temp;
                    return true;
                }

            }
             board[row][col]=temp;
             
             return false;


        

    }
}