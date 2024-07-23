package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID283MoveZeroes{
	public static void main(String[] args) {
		Solution solution = new ID283MoveZeroes().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
		int slow = 0;
		int count = 0;
		for(int fast = 0;fast<nums.length;fast++){
			if(nums[fast]!=0){
				nums[slow++] = nums[fast];
			}else{
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			nums[slow++] = 0;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
