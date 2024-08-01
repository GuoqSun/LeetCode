package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID3111MinimumRectanglesToCoverPoints{
	public static void main(String[] args) {
		Solution solution = new ID3111MinimumRectanglesToCoverPoints().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
		Arrays.sort(points,(a,b)->a[0]-b[0]);
		int ans = 0;
		int bound = -1;
        for (int[] point : points) {
            if (point[0] > bound) {
                ans++;
                bound = point[0] + w;
            }
        }
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
