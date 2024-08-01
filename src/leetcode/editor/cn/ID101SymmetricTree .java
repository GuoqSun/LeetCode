package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID101SymmetricTree{
	public static void main(String[] args) {
		Solution solution = new ID101SymmetricTree().new Solution();
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
    public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return compare(root.left,root.right);
    }

	public boolean compare(TreeNode left,TreeNode right){
		if(left == null && right!=null) return false;
		else if(left != null && right == null) return false;
		else if(left == null && right == null) return true;
		else if(left.val != right.val) return false;
		return compare(left.left,right.right) && compare(left.right,right.left);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
