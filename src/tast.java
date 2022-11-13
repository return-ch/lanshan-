/*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。*/
public class tast {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 8, 6, 2, 9};
        Solution s1 = new Solution();
        s1.setTarget(8);
        s1.Sum(nums, s1.target);
    }

    static class Solution {
        int target;
        public void Sum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        System.out.print(i+1 + "号" + "和");
                        System.out.print(j+1 + "号");
                        System.out.println();
                    }
                }
            }
        }
        public void setTarget(int target){
            this.target = target;
        }
    }
}
