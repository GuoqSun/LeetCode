package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID203RemoveLinkedListElements{
	public static void main(String[] args) {
		Solution solution = new ID203RemoveLinkedListElements().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
		if(head == null) return null;
		head.next = removeElements(head.next,val);
		if(head.val == val) return head.next;
		else return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
