package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID135Candy{
	public static void main(String[] args) {
		Solution solution = new ID135Candy().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int candy(int[] ratings) {
		int[] candy = new int[ratings.length];
		Arrays.fill(candy,1);
		for(int i=1;i<ratings.length;i++){
			if(ratings[i] > ratings[i-1]){
				candy[i] = candy[i-1]+1;
			}
		}
		for(int i=ratings.length-2;i>=0;i--){
			if(ratings[i] > ratings[i+1]){
				candy[i] = Math.max(candy[i], candy[i+1]+1);
			}
		}
		int ans = 0;
		for(int num:candy){
			ans+=num;
		}
		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
