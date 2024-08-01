package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID738MonotoneIncreasingDigits{
	public static void main(String[] args) {
		Solution solution = new ID738MonotoneIncreasingDigits().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int monotoneIncreasingDigits(int n) {
		String s = String.valueOf(n);
		char[] c = s.toCharArray();
		int index = s.length();
		for(int i=c.length-2;i>=0;i--){
			if(c[i]> c[i+1]){
				c[i]--;
				index = i+1;
			}
		}
		for(int i=index;i<c.length;i++){
			c[i] = '9';
		}
		return Integer.parseInt(String.valueOf(c));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
