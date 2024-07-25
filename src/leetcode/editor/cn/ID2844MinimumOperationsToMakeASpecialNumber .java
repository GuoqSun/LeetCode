package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID2844MinimumOperationsToMakeASpecialNumber{
	public static void main(String[] args) {
		Solution solution = new ID2844MinimumOperationsToMakeASpecialNumber().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		int i = solution.minimumOperations("2245047");
		System.out.println(i);
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumOperations(String num) {
		int ans = Integer.MAX_VALUE;
		int five_pos = -1;
		int zero_pos = -1;
		boolean fiveFlag = false;
		boolean zeroFlag = false;
		for(int i=num.length()-1;i>=0;i--){
			if(five_pos == -1 && num.charAt(i) == '5'){
				five_pos = i;
				fiveFlag = true;
			}
			if(zero_pos == -1 && num.charAt(i) == '0'){
				zero_pos = i;
				zeroFlag = true;
			}
			if(!zeroFlag && zero_pos!=-1 && (num.charAt(i) == '0' || num.charAt(i) == '5') ){
				ans = Math.min(ans,num.length()-i-2);
			}
			if(!fiveFlag && five_pos!=-1 && (num.charAt(i) == '2' || num.charAt(i) == '7')){
				ans = Math.min(ans,num.length()-i-2);
			}
			fiveFlag = false;
			zeroFlag = false;
		}
		if(ans == Integer.MAX_VALUE && zero_pos!=-1) return num.length()-1;
		else if(ans == Integer.MAX_VALUE) return num.length();
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
