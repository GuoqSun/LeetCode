package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID134GasStation{
	public static void main(String[] args) {
		Solution solution = new ID134GasStation().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
		int ans = 0;
		int totalSum = 0;
		int curSum = 0;
		for(int i=0;i<gas.length;i++){
			curSum += gas[i]-cost[i];
			totalSum += gas[i]-cost[i];
			if(curSum<0){
				ans = i+1;
				curSum = 0;
			}
		}
		if(totalSum<0) return -1;
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
