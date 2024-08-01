package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID51NQueens {
    public static void main(String[] args) {
        Solution solution = new ID51NQueens().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<String>> ans = new ArrayList<>();

        public List<List<String>> solveNQueens(int n) {
            char[][] chessBoard = new char[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(chessBoard[i], '.');
            }
            dfs(n,chessBoard,0);
            return ans;
        }

        public void dfs(int n, char[][] board, int row) {
            if (row == n) {
                ans.add(array2list(board));
                return;
            }
            for (int col = 0; col < n; col++) {
                if(isValid(row,col,n,board)){
                    board[row][col] = 'Q';
                    dfs(n,board,row+1);
                    board[row][col] = '.';
                }
            }
        }

        public List<String> array2list(char[][] board) {
            List<String> res = new ArrayList<>();
            for (char[] chars : board) {
                res.add(String.copyValueOf(chars));
            }
            return res;
        }

        public boolean isValid(int row, int col, int n, char[][] board) {
            for (int i = 0; i < row; i++) {
                if (board[i][col] == 'Q') return false;
            }
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') return false;
            }
            for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
                if (board[i][j] == 'Q') return false;
            }
            return true;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
