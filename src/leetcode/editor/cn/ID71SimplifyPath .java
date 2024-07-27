package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

class ID71SimplifyPath{
	public static void main(String[] args) {
		Solution solution = new ID71SimplifyPath().new Solution();

		//执行测试
		String res = solution.simplifyPath("/.../a/../b/c/../d/./");
		System.out.println(res);
	}
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
		String[] dirs = path.split("/");
		int index = 0;
		for(String dir:dirs){
			if(dir.equals(".") || dir.isEmpty()){
				continue;
			}
			if(dir.equals("..")){
				index = Math.max(0,index-1);
			}else{
				dirs[index++] = dir;
			}
		}
		if(index == 0) return "/";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<index;i++){
			sb.append("/").append(dirs[i]);
		}
		return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
