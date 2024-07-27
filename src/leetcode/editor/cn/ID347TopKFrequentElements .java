package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID347TopKFrequentElements{
	public static void main(String[] args) {
		Solution solution = new ID347TopKFrequentElements().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int num:nums){
			map.put(num,map.getOrDefault(num,0)+1);
		}
		PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[1]-b[1]);
		for(int key:map.keySet()){
			int[] data = new int[]{key,map.get(key)};
			if(queue.size()<k){
				queue.offer(data);
			}else{
				if(data[1]>queue.peek()[1]){
					queue.poll();
					queue.offer(data);
				}
			}
		}
		int[] ans = new int[k];
		for(int i=k-1;i>=0;i--){
			ans[i] = queue.poll()[0];
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
