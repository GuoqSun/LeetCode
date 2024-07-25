package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID209MinimumSizeSubarraySum{
	public static void main(String[] args) {
		Solution solution = new ID209MinimumSizeSubarraySum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试

		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
		int ans = Integer.MAX_VALUE;
		int sum = 0;
		int left = 0;
		for(int right = 0;right<nums.length;right++){
			sum+=nums[right];
			while(sum>=target){
				ans = Math.min(ans,right-left+1);
				sum-=nums[left++];
			}
		}
		return ans==Integer.MAX_VALUE?0:ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
