package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID20ValidParentheses{
	public static void main(String[] args) {
		Solution solution = new ID20ValidParentheses().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<>();
		for(char c:s.toCharArray()){
			if(c=='('){
				stack.push(')');
			}else if(c=='['){
				stack.push(']');
			}else if(c=='{'){
				stack.push('}');
			}else if(c==')' || c==']' || c=='}'){
				if(!stack.isEmpty() && c == stack.peek()){
					stack.pop();
				}else{
					return false;
				}
			}
		}
		return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
