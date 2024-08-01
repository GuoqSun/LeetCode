package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID102BinaryTreeLevelOrderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID102BinaryTreeLevelOrderTraversal().new Solution();
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
    public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if(root == null) return ans;
		Deque<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		while (!queue.isEmpty()){
			int size = queue.size();
			List<Integer> tmp = new ArrayList<>();
			for(int i=0;i<size;i++){
				TreeNode node = queue.pop();
				tmp.add(node.val);
				if(node.left!=null) queue.offer(node.left);
				if(node.right!=null) queue.offer(node.right);
			}
			ans.add(new ArrayList<>(tmp));
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
