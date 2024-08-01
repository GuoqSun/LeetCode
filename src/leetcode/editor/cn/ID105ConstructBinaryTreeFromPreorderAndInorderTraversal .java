package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID105ConstructBinaryTreeFromPreorderAndInorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID105ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder.length == 0) return null;
		TreeNode node = new TreeNode(preorder[0]);
		int index = 0;
		for(int i=0;i< inorder.length;i++){
			if(inorder[i] == node.val){
				index = i;
			}
		}
		int[] leftPre = Arrays.copyOfRange(preorder,1,index+1);
		int[] rightPre = Arrays.copyOfRange(preorder,index+1,preorder.length);
		int[] leftIn = Arrays.copyOfRange(inorder, 0,index);
		int[] rightIn = Arrays.copyOfRange(inorder,index+1,inorder.length);
		node.left = buildTree(leftPre,leftIn);
		node.right = buildTree(rightPre,rightIn);
		return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
