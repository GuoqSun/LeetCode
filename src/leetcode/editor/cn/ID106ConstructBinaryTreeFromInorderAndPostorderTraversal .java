package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID106ConstructBinaryTreeFromInorderAndPostorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID106ConstructBinaryTreeFromInorderAndPostorderTraversal().new Solution();
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
		if(postorder.length == 0) return null;
		TreeNode node = new TreeNode();
		node.val = postorder[postorder.length-1];
		if(postorder.length == 1) return node;
		int index = 0;
		for(int i=0;i<inorder.length;i++){
			if(inorder[i] == node.val){
				index = i;
			}
		}
		int[] leftIn = Arrays.copyOfRange(inorder,0,index);
		int[] rightIn = Arrays.copyOfRange(inorder,index+1,inorder.length);
		int[] leftPost = Arrays.copyOfRange(postorder,0,index);
		int[] rightPost = Arrays.copyOfRange(postorder,index,postorder.length-1);
		node.left = buildTree(leftIn,leftPost);
		node.right = buildTree(rightIn,rightPost);
		return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
