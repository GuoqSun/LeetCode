package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID144BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        Solution solution = new ID144BinaryTreePreorderTraversal().new Solution();
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if (root == null) return ans;
            Stack<TreeNode> stack = new Stack<>();
            if (root != null) stack.push(root);
            while (!stack.empty()) {
                TreeNode node = stack.peek();
                if (node != null) {
                    stack.pop();
                    if (node.right != null) stack.push(node.right);
                    if (node.left != null) stack.push(node.left);
                    stack.push(node);
                    stack.push(null);
                } else {
                    stack.pop();
                    node = stack.pop();
                    ans.add(node.val);
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
