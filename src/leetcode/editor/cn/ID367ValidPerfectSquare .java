package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID367ValidPerfectSquare{
	public static void main(String[] args) {
		Solution solution = new ID367ValidPerfectSquare().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare(int num) {
		int l = 0;
		int r = num;
		while(l<=r){
			int m = (l+r)/2;
			if((long)m*m<num){
				l = m+1;
			}else if((long)m*m>num){
				r = m-1;
			}else{
				return true;
			}
		}
		return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
