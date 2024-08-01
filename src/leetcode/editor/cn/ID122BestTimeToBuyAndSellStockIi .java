package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID122BestTimeToBuyAndSellStockIi{
	public static void main(String[] args) {
		Solution solution = new ID122BestTimeToBuyAndSellStockIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
		int ans = 0;
		for(int i=1;i<prices.length;i++){
			if(prices[i]>prices[i-1]) ans+=(prices[i]-prices[i-1]);
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
