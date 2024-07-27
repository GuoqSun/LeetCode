package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID19RemoveNthNodeFromEndOfList{
	public static void main(String[] args) {
		Solution solution = new ID19RemoveNthNodeFromEndOfList().new Solution();
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
	int count = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) return null;
		head.next = removeNthFromEnd(head.next,n);
		count++;
		if(count == n){
			return head.next;
		}else{
			return head;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
