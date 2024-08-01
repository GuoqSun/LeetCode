package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID435NonOverlappingIntervals{
	public static void main(String[] args) {
		Solution solution = new ID435NonOverlappingIntervals().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
		int ans = 0;
		Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
		for(int i=1;i<intervals.length;i++){
			if(intervals[i][0]<intervals[i-1][1]){
				ans++;
				intervals[i][1] = Math.min(intervals[i][1],intervals[i-1][1]);
			}
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
