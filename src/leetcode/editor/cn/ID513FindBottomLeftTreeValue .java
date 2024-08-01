package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID513FindBottomLeftTreeValue{
	public static void main(String[] args) {
		Solution solution = new ID513FindBottomLeftTreeValue().new Solution();
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
	int maxDepth = Integer.MIN_VALUE;
	int ans = 0;
    public int findBottomLeftValue(TreeNode root) {
		dfs(root,0);
		return ans;
    }

	public void dfs(TreeNode root,int deep){
		if(root.left == null && root.right == null){
			if(deep>maxDepth){
				maxDepth = deep;
				ans = root.val;
			}
			return;
		}
		if(root.left!=null) {
			dfs(root.left, deep+1);
		}
		if(root.right!=null){
			dfs(root.right,deep+1);
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
