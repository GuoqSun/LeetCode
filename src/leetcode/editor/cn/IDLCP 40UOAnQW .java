package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class IDLCP40UOAnQW{
	public static void main(String[] args) {
		Solution solution = new IDLCP40UOAnQW().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		int[] nums = new int[]{1,2,8,9};
		int score = solution.maxmiumScore(nums, 3);
		System.out.println(score);
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxmiumScore(int[] cards, int cnt) {
		int ans = 0;
		Arrays.sort(cards);
		int odd = -1; // 奇
		int even = -1; // 偶
		int tmp = 0;
		for(int i=cards.length-1;i>=cards.length-cnt;i--){
			tmp+=cards[i];
			if(cards[i]% 2 == 1) odd = i;
			else even = i;
		}
		if(tmp%2 == 0) return tmp;
		for(int i=cards.length-cnt-1;i>=0;i--){
			if(odd!=-1 && cards[i]%2 == 0){
				ans = Math.max(ans,tmp-cards[odd]+cards[i]);
				break;
			}
		}
		for(int i=cards.length-cnt-1;i>=0;i--){
			if(even!=-1 && cards[i]%2==1){
				ans = Math.max(ans,tmp-cards[even]+cards[i]);
				break;
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
