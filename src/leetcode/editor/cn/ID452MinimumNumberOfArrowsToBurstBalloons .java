package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID452MinimumNumberOfArrowsToBurstBalloons{
	public static void main(String[] args) {
		Solution solution = new ID452MinimumNumberOfArrowsToBurstBalloons().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinArrowShots(int[][] points) {
		int ans = 1;
		Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
		for(int i=1;i<points.length;i++){
			if(points[i][0] <= points[i-1][1]){
				points[i][1] = Math.min(points[i][1], points[i-1][1]);
			}else {
				ans++;
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
