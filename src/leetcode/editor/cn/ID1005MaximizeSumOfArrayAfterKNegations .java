package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID1005MaximizeSumOfArrayAfterKNegations{
	public static void main(String[] args) {
		Solution solution = new ID1005MaximizeSumOfArrayAfterKNegations().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
		Integer[] nums2 = new Integer[nums.length];
		for(int i=0;i<nums.length;i++){
			nums2[i] = nums[i];
		}
		Arrays.sort(nums2,(a,b)-> Math.abs(b)-Math.abs(a));
		for(int i=0;i<nums.length;i++){
			if(nums2[i]<0 && k>0){
				nums2[i] = -nums2[i];
				k--;
			}
		}
		if(k%2==1){
			nums2[nums.length-1] = -nums2[nums.length-1];
		}
		int ans = 0;
		for(int num:nums2){
			ans+=num;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
