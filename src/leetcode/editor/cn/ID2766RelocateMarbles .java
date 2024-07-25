package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID2766RelocateMarbles{
	public static void main(String[] args) {
		Solution solution = new ID2766RelocateMarbles().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
		Map<Integer,Integer> map = new TreeMap<>();
        for(int loc:nums){
			map.put(loc,map.getOrDefault(loc,0)+1);
		}
		for(int i=0;i<moveFrom.length;i++){
			if(moveFrom[i]!=moveTo[i]){
				map.put(moveTo[i],map.get(moveFrom[i]));
				map.remove(moveFrom[i]);
			}
		}
        List<Integer> ans = new ArrayList<>(map.keySet());
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
