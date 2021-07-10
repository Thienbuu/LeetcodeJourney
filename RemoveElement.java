class Solution {
    public int removeElement(int[] nums, int val) {     
        int lastIdx = nums.length - 1;
        for (int i = 0; i <= lastIdx; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[lastIdx--];
            }
        }
        return lastIdx + 1;

    }
}
