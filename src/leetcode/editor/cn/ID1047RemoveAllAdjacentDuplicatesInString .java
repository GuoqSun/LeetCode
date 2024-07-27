package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID1047RemoveAllAdjacentDuplicatesInString{
	public static void main(String[] args) {
		Solution solution = new ID1047RemoveAllAdjacentDuplicatesInString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
		Deque<Character> stack = new ArrayDeque<>();
		for(char c:s.toCharArray()){
			if(!stack.isEmpty() && c==stack.peek()){
				stack.pop();
			}else{
				stack.push(c);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char c:stack){
			sb.append(c);
		}
		return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
