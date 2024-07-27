package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID242ValidAnagram{
	public static void main(String[] args) {
		Solution solution = new ID242ValidAnagram().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
		Map<Character,Integer> map = new HashMap<>();
		for(char c:s.toCharArray()){
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for(char c:t.toCharArray()){
			map.put(c,map.getOrDefault(c,0)-1);
		}
		for(int num:map.values()){
			if(num!=0){
				return false;
			}
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
