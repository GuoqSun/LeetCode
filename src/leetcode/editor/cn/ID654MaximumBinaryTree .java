package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID654MaximumBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID654MaximumBinaryTree().new Solution();
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
		if(nums.length == 0) return null;
		int index = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>nums[index]){
				index = i;
			}
		}
		TreeNode node = new TreeNode(nums[index]);
		int[] left = Arrays.copyOfRange(nums,0,index);
		int[] right = Arrays.copyOfRange(nums,index+1,nums.length);
		node.left = constructMaximumBinaryTree(left);
		node.right = constructMaximumBinaryTree(right);
		return node;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
