package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID860LemonadeChange{
	public static void main(String[] args) {
		Solution solution = new ID860LemonadeChange().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean lemonadeChange(int[] bills) {
		int five = 0;
		int ten = 0;
        for (int bill : bills) {
            if (bill == 5) five++;
            else if (bill == 10) {
                ten++;
                if (five == 0) return false;
                five--;
            } else if (bill == 20) {
                if (five == 0) return false;
                else if (five < 3 && ten == 0) return false;
                else if (ten != 0) {
                    ten--;
                    five--;
                } else {
                    five = five - 3;
                }
            }
        }
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
