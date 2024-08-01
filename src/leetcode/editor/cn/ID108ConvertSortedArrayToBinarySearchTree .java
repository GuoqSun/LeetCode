package leetcode.editor.cn;

import java.security.Key;
import java.util.*;
import leetcode.editor.util.*;

class ID108ConvertSortedArrayToBinarySearchTree{
	public static void main(String[] args) {
		Solution solution = new ID108ConvertSortedArrayToBinarySearchTree().new Solution();
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
    public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) return null;
		int mid = nums.length/2;
		TreeNode node = new TreeNode(nums[mid]);
		int[] left = Arrays.copyOfRange(nums,0,mid);
		int[] right = Arrays.copyOfRange(nums,mid+1,nums.length);
		node.left = sortedArrayToBST(left);
		node.right = sortedArrayToBST(right);
		return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
