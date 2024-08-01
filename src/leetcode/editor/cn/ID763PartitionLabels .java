package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID763PartitionLabels{
	public static void main(String[] args) {
		Solution solution = new ID763PartitionLabels().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> partitionLabels(String s) {
		List<Integer> ans = new ArrayList<>();
		int[] letters = new int[26];
		for(int i=0;i<s.length();i++){
			letters[s.charAt(i)-'a'] = i;
		}
		int left = 0;
		int right = 0;
		for(int i=0;i<s.length();i++){
			right = Math.max(right,letters[s.charAt(i)-'a']);
			if(i == right){
				ans.add(right-left+1);
				left = i+1;
			}
		}
		return ans;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
