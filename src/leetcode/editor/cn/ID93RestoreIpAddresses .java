package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID93RestoreIpAddresses {
    public static void main(String[] args) {
        Solution solution = new ID93RestoreIpAddresses().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        public List<String> restoreIpAddresses(String s) {
            dfs(s,0);
            return ans;
        }
        public void dfs(String s, int startIndex){
            if(path.size() == 4 && startIndex>=s.length()){
                ans.add(String.join(".",path));
                return;
            }
            for(int i=startIndex;i<s.length();i++){
                String sub = s.substring(startIndex,i+1);
                if(sub.length()>1 && sub.charAt(0) == '0') continue;
                if(sub.length() > 3 || Integer.parseInt(sub)>255) continue;
                path.add(sub);
                dfs(s,i+1);
                path.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
