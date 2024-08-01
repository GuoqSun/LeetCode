package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID46Permutations {
    public static void main(String[] args) {
        Solution solution = new ID46Permutations().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            dfs(nums,0);
            return ans;
        }
        public void dfs(int[] nums, int startIndex){
            if(path.size() >= nums.length){
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(path.contains(nums[i])) continue;
                path.add(nums[i]);
                dfs(nums,i+1);
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
