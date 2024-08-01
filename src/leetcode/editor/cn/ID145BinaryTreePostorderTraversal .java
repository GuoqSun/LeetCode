package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID145BinaryTreePostorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID145BinaryTreePostorderTraversal().new Solution();
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
    public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ans = new ArrayList<>();
		if(root == null) return ans;
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		while(!st.isEmpty()){
			TreeNode node = st.peek();
			if(node!=null){
				st.pop();
				st.push(node);
				st.push(null);
				if(node.right!=null) st.push(node.right);
				if(node.left!=null) st.push(node.left);
			}else{
				st.pop();
				ans.add(st.pop().val);
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
