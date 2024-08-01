package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID222CountCompleteTreeNodes{
	public static void main(String[] args) {
		Solution solution = new ID222CountCompleteTreeNodes().new Solution();
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
    public int countNodes(TreeNode root) {
		if(root == null) return 0;
		TreeNode left = root.left;
		TreeNode right = root.right;
		int leftDepth = 0, rightDepth = 0;
		while(left!=null){
			leftDepth++;
			left = left.left;
		}
		while(right!=null){
			rightDepth++;
			right = right.right;
		}
		if(leftDepth == rightDepth){
			return (2 << leftDepth) - 1;
		}
		return countNodes(root.left)+countNodes(root.right)+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
