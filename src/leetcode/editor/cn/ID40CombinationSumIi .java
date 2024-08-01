package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID40CombinationSumIi {
    public static void main(String[] args) {
        Solution solution = new ID40CombinationSumIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            dfs(candidates,target,0,0);
            return ans;
        }
        public void dfs(int[] candidates, int target, int curSum, int startIndex){
            if(curSum>target) return;
            if(curSum == target){
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=startIndex;i<candidates.length;i++){
                if(i>startIndex && candidates[i] == candidates[i-1]) continue;
                path.add(candidates[i]);
                curSum+=candidates[i];
                dfs(candidates,target,curSum,i+1);
                curSum-=candidates[i];
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
