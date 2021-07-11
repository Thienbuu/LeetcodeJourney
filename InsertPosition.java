class Solution {
    public int searchInsert(int[] nums, int target) {
        // because there are cases that index higher than last index, therefore high is length
        int high = nums.length;
        int low = 0;
        
        while (high > low) {
            int mid = (high - low) / 2 + low;
            
            if (nums[mid] == target) 
                return mid;
            if (nums[mid] > target) 
                high = mid;
            else 
                low = mid + 1;
            
        }
        
        return low;
    }
}
