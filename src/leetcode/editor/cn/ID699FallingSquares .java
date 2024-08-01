package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID699FallingSquares{
	public static void main(String[] args) {
		Solution solution = new ID699FallingSquares().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> fallingSquares(int[][] positions) {
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<positions.length;i++){
			int left1 = positions[i][0];
			int right1 = positions[i][0]+positions[i][1]-1;
			int height = positions[i][1];
			for(int j=0;j<i;j++){
				int left2 = positions[j][0];
				int right2 = positions[j][0]+positions[j][1]-1;
				if(left2<=right1 && left1 <= right2){
					height = Math.max(height,ans.get(j)+positions[i][1]);
				}
			}
			ans.add(height);
		}
		for(int i=1;i<positions.length;i++){
			ans.set(i,Math.max(ans.get(i),ans.get(i-1)));
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
