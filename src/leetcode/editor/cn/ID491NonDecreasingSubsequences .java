package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID491NonDecreasingSubsequences {
    public static void main(String[] args) {
        Solution solution = new ID491NonDecreasingSubsequences().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
        int[] test = new int[]{4,4,3,2,1};
        List<List<Integer>> subsequences = solution.findSubsequences(test);
        System.out.println(subsequences);
        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> findSubsequences(int[] nums) {
            dfs(nums,0);
            return ans;
        }

        public void dfs(int[] nums,int startIndex){
            if(path.size()>=2){
                ans.add(new ArrayList<>(path));
            }
            if(startIndex>=nums.length) return;
            Set<Integer> set = new HashSet<>();
            for(int i=startIndex;i<nums.length;i++){
                if((!path.isEmpty() && nums[i] < path.getLast()) || set.contains(nums[i])) continue;
                set.add(nums[i]);
                path.add(nums[i]);
                dfs(nums,i+1);
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
