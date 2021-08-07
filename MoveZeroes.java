class Solution {    
    public void moveZeroes(int[] nums) {
        int idx = 0;
        //Move all non-zero values to head of list
        //because i always run faster than idx, then no need to replace values at index i to 0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[idx++] = nums[i];
        }

        //Fill the rest of list with 0
        for (int i = idx; i < nums.length; i++) {
            nums[i] = 0; 
        }
        
    }
    
    
    // public void moveZeroes(int[] nums) {
    //    for (int i = 0; i < nums.length; i++) {
    //        if (nums[i] == 0) {
    //            int j = i + 1;
    //            while (j < nums.length) {
    //                if (nums[j] != 0) {
    //                    nums[i] = nums[j];
    //                    nums[j] = 0;
    //                    break;
    //                }
    //                j++;
    //            }
    //            if (j >= nums.length - 1) break;
    //        }
    //    }
    // }
    
    
    //Naive solution
    // public void moveZeroes(int[] nums) {
    //     int idx = 1;
    //     int zeroIdx = 0;
    //     while (idx < nums.length) {
    //         int zeroNum = nums[zeroIdx];
    //         if (zeroNum == 0 && nums[idx] != 0) {
    //             nums[zeroIdx++] = nums[idx];
    //             nums[idx] = 0;
    //             idx = zeroIdx;
    //         }
    //         else if (zeroNum != 0) zeroIdx++;
    //         idx++;
    //     }  
    // }
}
