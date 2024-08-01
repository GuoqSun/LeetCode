package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID216CombinationSumIii {
    public static void main(String[] args) {
        Solution solution = new ID216CombinationSumIii().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combinationSum3(int k, int n) {
            dfs(k, n, 1, 0);
            return ans;
        }

        public void dfs(int k, int n, int start, int curSum) {
            if(path.size() == k){
                if(curSum == n) ans.add(new ArrayList<>(path));
                return;
            }
            for (int i = start; i <= 9; i++) {
                curSum += i;
                path.add(i);
                dfs(k, n, i + 1, curSum);
                path.removeLast();
                curSum -= i;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
