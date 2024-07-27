package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID2740FindTheValueOfThePartition{
	public static void main(String[] args) {
		Solution solution = new ID2740FindTheValueOfThePartition().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findValueOfPartition(int[] nums) {
		Arrays.sort(nums);
		int ans = Integer.MAX_VALUE;
		for(int i=1;i<nums.length;i++){
			ans = Math.min(ans,nums[i]-nums[i-1]);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
