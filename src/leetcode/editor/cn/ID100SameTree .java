package leetcode.editor.cn;

import java.util.*;

import com.sun.source.tree.Tree;
import leetcode.editor.util.*;

class ID100SameTree{
	public static void main(String[] args) {
		Solution solution = new ID100SameTree().new Solution();
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) return true;
		else if(p == null && q != null) return false;
		else if(p != null && q == null) return false;
		else if(p.val != q.val) return false;
		else{
			boolean res1 = isSameTree(p.left,q.left);
			boolean res2 = isSameTree(p.right,q.right);
			return res1 && res2;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
