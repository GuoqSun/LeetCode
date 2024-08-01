package leetcode.editor.cn;

import java.security.spec.NamedParameterSpec;
import java.util.*;

import leetcode.editor.util.*;

class ID47PermutationsIi {
    public static void main(String[] args) {
        Solution solution = new ID47PermutationsIi().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            boolean[] used = new boolean[nums.length];
            dfs(nums,0,used);
            return ans;
        }

        public void dfs(int[] nums, int startIndex ,boolean[] used){
            if(path.size() >= nums.length){
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
                if(!used[i]){
                    used[i] = true;
                    path.add(nums[i]);
                    dfs(nums,i+1,used);
                    path.removeLast();
                    used[i] = false;
                }

            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
