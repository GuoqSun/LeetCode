package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID530MinimumAbsoluteDifferenceInBst{
	public static void main(String[] args) {
		Solution solution = new ID530MinimumAbsoluteDifferenceInBst().new Solution();
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
	int ans = Integer.MAX_VALUE;
	TreeNode pre = null;
    public int getMinimumDifference(TreeNode root) {
		dfs(root);
		return ans;
    }
	public void dfs(TreeNode root){
		if(root == null) return;
		dfs(root.left);
		if(pre!=null){
			ans = Math.min(ans,root.val-pre.val);
		}
		pre = root;
		dfs(root.right);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
