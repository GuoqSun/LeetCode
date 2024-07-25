package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID59SpiralMatrixIi {
    public static void main(String[] args) {
        Solution solution = new ID59SpiralMatrixIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] generateMatrix(int n) {
            int l = 0, r = n - 1, t = 0, b = n - 1;
			int[][] res = new int[n][n];
			int sum = n*n;
			int index = 1;
			while(index<=sum){
				for(int i=l;i<=r;i++) res[t][i] = index++;
				t++;
				for(int i=t;i<=b;i++) res[i][r] = index++;
				r--;
				for(int i=r;i>=l;i--) res[b][i] = index++;
				b--;
				for(int i=b;i>=t;i--) res[i][l] = index++;
				l++;
			}
			return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
