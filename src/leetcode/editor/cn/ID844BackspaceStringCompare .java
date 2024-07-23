package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID844BackspaceStringCompare{
	public static void main(String[] args) {
		Solution solution = new ID844BackspaceStringCompare().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String s, String t) {
		int sNum = 0;
		int tNum = 0;
		int i=s.length()-1;
		int j=t.length()-1;
		while(true){
			while (i>=0){
				if(s.charAt(i)=='#') sNum++;
				else{
					if(sNum>0) sNum--;
					else break;
				}
				i--;
			}
			while(j>=0){
				if(t.charAt(j)=='#') tNum++;
				else{
					if(tNum>0) tNum--;
					else break;
				}
				j--;
			}
			if(i<0 || j<0) break;
			if(s.charAt(i)!=t.charAt(j)) return false;
			i--;j--;
		}
        return i == -1 && j == -1;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
