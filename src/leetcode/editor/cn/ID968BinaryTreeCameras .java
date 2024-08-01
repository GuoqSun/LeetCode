package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID968BinaryTreeCameras{
	public static void main(String[] args) {
		Solution solution = new ID968BinaryTreeCameras().new Solution();
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
	int ans = 0;
    public int minCameraCover(TreeNode root) {
		if(dfs(root) == 0){
			ans++;
		}
		return ans;
    }
	public int dfs(TreeNode root){
		if(root == null) return 2;
		int left = dfs(root.left);
		int right = dfs(root.right);
		if(left == 2 && right ==2) return 0;
		else if(left == 0 || right == 0){
			ans++;
			return 1;
		}else{
			return 2;
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
