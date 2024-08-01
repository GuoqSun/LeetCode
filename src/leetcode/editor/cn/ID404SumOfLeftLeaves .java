package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID404SumOfLeftLeaves{
	public static void main(String[] args) {
		Solution solution = new ID404SumOfLeftLeaves().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
		dfs(root);
		return ans;
    }

	public void dfs(TreeNode root){
		if(root == null) return;
		if(root.left!=null && root.left.left == null && root.left.right == null){
			ans+=root.left.val;
		}
		dfs(root.left);
		dfs(root.right);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
