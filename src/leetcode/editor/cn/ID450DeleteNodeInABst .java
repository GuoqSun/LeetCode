package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID450DeleteNodeInABst{
	public static void main(String[] args) {
		Solution solution = new ID450DeleteNodeInABst().new Solution();
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
    public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null) return root;
		if(root.val == key){
			if(root.left == null && root.right == null) return null;
			else if(root.left == null ) return root.right;
			else if(root.right == null) return root.left;
			else {
				TreeNode cur = root.right;
				while (cur.left!=null){
					cur = cur.left;
				}
				cur.left = root.left;
				root = root.right;
			}
		}
		if(root.val > key) root.left = deleteNode(root.left,key);
		if(root.val <key) root.right = deleteNode(root.right,key);
		return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
