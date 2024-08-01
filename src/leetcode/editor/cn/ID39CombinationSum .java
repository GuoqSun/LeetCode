package leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.*;

import leetcode.editor.util.*;

class ID39CombinationSum {
    public static void main(String[] args) {
        Solution solution = new ID39CombinationSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            dfs(candidates,target,0,0);
            return ans;
        }

        public void dfs(int[] candidates, int target, int startIndex, int curSum){
            if(curSum > target) return;
            if(curSum == target){
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=startIndex;i<candidates.length && curSum+candidates[i]<=target;i++){
                path.add(candidates[i]);
                curSum+=candidates[i];
                dfs(candidates,target,i,curSum);
                curSum-=candidates[i];
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
