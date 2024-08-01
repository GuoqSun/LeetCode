package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID50PowxN{
	public static void main(String[] args) {
		Solution solution = new ID50PowxN().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double myPow(double x, int n) {
		if(x == 0.0d) return 0.0d;
		long b = n;
		double res = 1.0;
		if(n<0){
			x = 1/x;
			b = -b;
		}
		while (b>0){
			if((b&1) == 1) res*=x;
			x*=x;
			b >>= 1;
		}
		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
