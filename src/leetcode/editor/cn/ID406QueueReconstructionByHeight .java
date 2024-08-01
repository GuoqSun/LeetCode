package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID406QueueReconstructionByHeight{
	public static void main(String[] args) {
		Solution solution = new ID406QueueReconstructionByHeight().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a,b)->{
			if(a[0]==b[0]) return a[1]-b[1];
			else return b[0]-a[0];
		});
		List<int[]> que = new LinkedList<>();
		for(int[] e:people){
			que.add(e[1],e);
		}
		return que.toArray(new int[people.length][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
