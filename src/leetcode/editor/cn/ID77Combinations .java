package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID77Combinations {
    public static void main(String[] args) {
        Solution solution = new ID77Combinations().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
		List<List<Integer>> combine = solution.combine(4, 2);
		System.out.println(combine);

		System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> path = new ArrayList<>();
        public List<List<Integer>> combine(int n, int k) {
			dfs(n,k,1);
			return ans;
        }
		public void dfs(int n,int k, int cur){
			if(path.size() == k){
				ans.add(new ArrayList<>(path));
				return;
			}
			for(int i=cur;i<=n-(k-path.size())+1;i++){
				path.add(i);
				dfs(n,k,i+1);
				path.removeLast();
			}
		}
    }
//leetcode submit region end(Prohibit modification and deletion)

}
