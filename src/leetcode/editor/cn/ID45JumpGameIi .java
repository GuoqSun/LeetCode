package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID45JumpGameIi{
	public static void main(String[] args) {
		Solution solution = new ID45JumpGameIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
		if(nums.length == 1) return 0;
		int ans = 0;
		int curDis = 0;
		int nextDis = 0;
		for(int i=0;i<nums.length;i++){
			nextDis = Math.max(nextDis,nums[i]+i);
			if(i == curDis){
				ans++;
				curDis = nextDis;
				if(curDis >= nums.length-1) return ans;
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
