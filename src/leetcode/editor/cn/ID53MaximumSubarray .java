package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID53MaximumSubarray{
	public static void main(String[] args) {
		Solution solution = new ID53MaximumSubarray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int num:nums){
			sum+=num;
			ans = Math.max(ans,sum);
			if(sum<0) sum = 0;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
