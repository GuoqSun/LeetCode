package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID55JumpGame{
	public static void main(String[] args) {
		Solution solution = new ID55JumpGame().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
		int cover = 0;
		for(int i=0;i<nums.length;i++){
			if(i>cover) return false;
			cover = Math.max(cover,nums[i]+i);
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
