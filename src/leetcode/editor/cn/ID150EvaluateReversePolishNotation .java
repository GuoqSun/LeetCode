package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID150EvaluateReversePolishNotation{
	public static void main(String[] args) {
		Solution solution = new ID150EvaluateReversePolishNotation().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
		Deque<Integer> stack = new ArrayDeque<>();
		for(String s:tokens){
			if(s.equals("+") || s.equals("-") || s.equals("*") ||s.equals("/")){
				int value1 = stack.pop();
				int value2 = stack.pop();
                switch (s) {
                    case "+" -> stack.push(value2 + value1);
                    case "-" -> stack.push(value2 - value1);
                    case "*" -> stack.push(value2 * value1);
                    default -> stack.push(value2 / value1);
                }
			}else{
				stack.push(Integer.valueOf(s));
			}
		}
		return stack.peek();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
