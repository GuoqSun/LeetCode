package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID501FindModeInBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ID501FindModeInBinarySearchTree().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        List<Integer> ans = new ArrayList<>();
        TreeNode pre = null;
        int count = 0;
        int maxCount = 0;

        public int[] findMode(TreeNode root) {
            dfs(root);
            int[] res = new int[ans.size()];
            for (int i = 0; i < ans.size(); i++) {
                res[i] = ans.get(i);
            }
            return res;
        }

        public void dfs(TreeNode root) {
            if (root == null) return;
            dfs(root.left);
            if (pre == null) count = 1;
            else if (root.val == pre.val) {
                count++;
            } else count = 1;
            pre = root;

            if (count == maxCount) {
                ans.add(root.val);
            } else if (count > maxCount) {
                maxCount = count;
                ans.clear();
                ans.add(root.val);
            }

            dfs(root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
