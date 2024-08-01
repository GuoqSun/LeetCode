package leetcode.editor.cn;

import java.util.*;

import com.sun.source.tree.Tree;
import leetcode.editor.util.*;

class ID94BinaryTreeInorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID94BinaryTreeInorderTraversal().new Solution();
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
    public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		if(root == null) return ans;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node = stack.peek();
			if(node!=null){
				stack.pop();
				if(node.right!=null) stack.push(node.right);
				stack.push(node);
				stack.push(null);
				if(node.left!=null) stack.push(node.left);
			}else{
				stack.pop();
				ans.add(stack.pop().val);
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
