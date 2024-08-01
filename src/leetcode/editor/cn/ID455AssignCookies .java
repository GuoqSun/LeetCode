package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID455AssignCookies{
	public static void main(String[] args) {
		Solution solution = new ID455AssignCookies().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findContentChildren(int[] g, int[] s) {
		if(s.length == 0) return 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int ans = 0;
		int index = s.length-1;
		for(int i=g.length-1;i>=0;i--){
			if(g[i]<=s[index]) {
				ans++;
				index--;
			}
			if(index < 0) break;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
