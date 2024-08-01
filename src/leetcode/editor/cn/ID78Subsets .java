package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

class ID78Subsets {
    public static void main(String[] args) {
        Solution solution = new ID78Subsets().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {


        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res=new ArrayList<>();
            List<Integer> initSub=new ArrayList<>();
            res.add(initSub);
            for (int i = 0; i < nums.length; i++) {
                int num=nums[i];
                int time=res.size();
                for (int j = 0; j < time; j++) {
                    List<Integer> list=res.get(j);
                    List<Integer> sub=new ArrayList<>(list);
                    sub.add(num);
                    res.add(sub);
                }
            }
            return res;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
