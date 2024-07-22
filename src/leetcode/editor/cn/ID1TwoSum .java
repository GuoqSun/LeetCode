package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID1TwoSum{
	public static void main(String[] args) {
		Solution solution = new ID1TwoSum().new Solution();
		StringBuilder sb = new StringBuilder();

		//执行测试
		int[] nums = new int[]{2,7,11,15};
		System.out.println(Arrays.toString(solution.twoSum(nums, 9)));
		System.out.println(sb);
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else{
                map.put(nums[i],i);
            }
		}
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
