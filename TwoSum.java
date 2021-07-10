class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create hashmap to store index and value of array
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            //Get remain of sub 
            int remain = target - nums[i];
            //If hashmap contain remain, return value
            if (map.containsKey(remain)) {
                return new int[] {map.get(remain), i};
            }
            //Put value and index of current number into hashmap
            else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1};
    }
}
