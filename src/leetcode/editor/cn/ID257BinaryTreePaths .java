package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID257BinaryTreePaths{
	public static void main(String[] args) {
		Solution solution = new ID257BinaryTreePaths().new Solution();
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
	List<String> ans = new ArrayList<>();
	List<Integer> path = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
		dfs(root);
		return ans;
    }
	public void dfs(TreeNode root){
		path.add(root.val);
		if(root.left == null && root.right == null){
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<path.size()-1;i++){
				sb.append(path.get(i)).append("->");
			}
			sb.append(path.getLast());
			ans.add(sb.toString());
			return;
		}
		if(root.left!=null){
			dfs(root.left);
			path.removeLast();
		}
		if(root.right!=null){
			dfs(root.right);
			path.removeLast();
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
