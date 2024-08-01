package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID682BaseballGame{
	public static void main(String[] args) {
		Solution solution = new ID682BaseballGame().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int calPoints(String[] operations) {
		Stack<Integer> st = new Stack<>();
		for(String o:operations){
            switch (o) {
                case "C" -> st.pop();
                case "D" -> st.push(st.peek() * 2);
                case "+" -> {
                    int num1 = st.peek();
                    st.pop();
                    int num2 = st.peek();
                    st.push(num1);
                    st.push(num1 + num2);
                }
                default -> st.push(Integer.valueOf(o));
            }
		}
		int ans = 0;
		while (!st.empty()){
			ans+=st.pop();
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
