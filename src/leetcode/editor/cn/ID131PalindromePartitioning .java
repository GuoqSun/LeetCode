package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID131PalindromePartitioning {
    public static void main(String[] args) {
        Solution solution = new ID131PalindromePartitioning().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        public List<List<String>> partition(String s) {
            dfs(s,0);
            return ans;
        }

        public void dfs(String s, int startIndex){
            if(startIndex>=s.length()){
                ans.add(new ArrayList<>(path));
                return;
            }
            for(int i=startIndex;i<s.length();i++){
                if(isP(s,startIndex,i)){
                    String sub = s.substring(startIndex,i+1);
                    path.add(sub);
                }else continue;
                dfs(s,i+1);
                path.removeLast();
            }

        }

        public boolean isP(String s, int start, int end){
            for(int i=start,j=end;i<j;i++,j--){
                if(s.charAt(i)!=s.charAt(j)) return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
