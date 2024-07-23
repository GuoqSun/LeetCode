package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID26RemoveDuplicatesFromSortedArray{
	public static void main(String[] args) {
		Solution solution = new ID26RemoveDuplicatesFromSortedArray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
		int slow = 0;
		for(int fast = 0;fast<nums.length;fast++){
			while (fast<nums.length-1 && nums[fast] == nums[fast+1]){
				fast++;
			}
			nums[slow++] = nums[fast];
		}
		return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
