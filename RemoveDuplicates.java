class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int n : nums) {
            if (idx == 0 || n > nums[idx - 1]) {
                nums[idx++] = n;
            }
        }
        return idx;
    }
}
