package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID239SlidingWindowMaximum{
	public static void main(String[] args) {
		Solution solution = new ID239SlidingWindowMaximum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums.length ==0 || k==0) return new int[0];
		int[] ans = new int[nums.length-k+1];
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=1-k,j=0;j<nums.length;i++,j++){
			if(i>0 && deque.peekFirst() == nums[i-1]){
				deque.removeFirst();
			}
			while(!deque.isEmpty() && deque.peekLast() < nums[j]){
				deque.removeLast();
			}
			deque.addLast(nums[j]);
			if(i>=0){
				ans[i] = deque.peekFirst();
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
