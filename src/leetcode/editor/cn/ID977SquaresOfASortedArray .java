package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID977SquaresOfASortedArray{
	public static void main(String[] args) {
		Solution solution = new ID977SquaresOfASortedArray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];
		int index = nums.length-1;
		int i=0;
		int j=nums.length-1;
		while(i<=j){
			if(Math.abs(nums[i])>Math.abs(nums[j])){
				result[index--] = nums[i]*nums[i];
				i++;
			}else{
				result[index--] = nums[j]*nums[j];
				j--;
			}
		}
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
