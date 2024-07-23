package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID69Sqrtx{
	public static void main(String[] args) {
		Solution solution = new ID69Sqrtx().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
		int l = 0;
		int r = x;
		while(l<=r){
			int m = (l+r)/2;
			if((long)m*m>x){
				r = m-1;
			}else{
				l = m+1;
			}
		}
		return r;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
