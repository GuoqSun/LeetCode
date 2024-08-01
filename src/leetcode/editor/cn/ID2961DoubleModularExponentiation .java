package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID2961DoubleModularExponentiation{
	public static void main(String[] args) {
		Solution solution = new ID2961DoubleModularExponentiation().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<variables.length;i++){
			if(pow(pow(variables[i][0],variables[i][1],10),variables[i][2],variables[i][3]) == target){
				ans.add(i);
			}
		}
		return ans;
    }

	public int pow(int x, int n, int mod){
		int res = 1;
		while(n>0){
			if((n&1) ==1) res = res * x % mod;
			x = x*x % mod;
			n >>= 1;
		}
		return res;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
