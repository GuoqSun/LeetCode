package leetcode.editor.cn;

import java.util.*;

import com.sun.security.auth.NTNumericCredential;
import leetcode.editor.util.*;

class ID376WiggleSubsequence{
	public static void main(String[] args) {
		Solution solution = new ID376WiggleSubsequence().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int wiggleMaxLength(int[] nums) {
		if(nums.length < 2) return nums.length;
		int ans = 1;
		int dir = 0;
		for(int i=1;i<nums.length;i++){
			if(nums[i] == nums[i-1]) continue;
			if(nums[i]>nums[i-1]){
				if(dir == 1) continue;
				else{
					dir = 1;
					ans++;
				}
			}else{
				if(dir == -1) continue;
				else{
					dir = -1;
					ans++;
				}
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
