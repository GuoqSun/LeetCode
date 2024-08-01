package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID538ConvertBstToGreaterTree{
	public static void main(String[] args) {
		Solution solution = new ID538ConvertBstToGreaterTree().new Solution();
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
	int curSum = 0;
    public TreeNode convertBST(TreeNode root) {
		if(root == null) return null;
		convertBST(root.right);
		curSum += root.val;
		root.val = curSum;
		convertBST(root.left);
		return root;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
