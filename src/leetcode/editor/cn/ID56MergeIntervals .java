package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID56MergeIntervals{
	public static void main(String[] args) {
		Solution solution = new ID56MergeIntervals().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
		if(intervals.length == 1) return intervals;
		Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
		List<int[]> ans = new ArrayList<>();
		int left = intervals[0][0];
		int cover = intervals[0][1];
		for(int i=1;i< intervals.length;i++){
			if(intervals[i][0]>cover){
				ans.add(new int[]{left,cover});
				left = intervals[i][0];
				cover = intervals[i][1];
			}else{
				cover = Math.max(cover,intervals[i][1]);
			}
		}
		ans.add(new int[]{left,cover});
		return ans.toArray(new int[ans.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
