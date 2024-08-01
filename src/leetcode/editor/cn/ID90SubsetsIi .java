package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID90SubsetsIi {
    public static void main(String[] args) {
        Solution solution = new ID90SubsetsIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            dfs(nums,0);
            return ans;
        }

        public void dfs(int[] nums, int startIndex){
            ans.add(new ArrayList<>(path));
            if(startIndex >= nums.length) return;
            for(int i=startIndex;i<nums.length;i++){
                if(i>startIndex && nums[i] == nums[i-1]) continue;
                path.add(nums[i]);
                dfs(nums,i+1);
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
