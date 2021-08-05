class Solution {
    
    //the idea is to find to number that is not repeated in range length * 2
    //Ex: 
    //  [3,0,1], length = 3, meaning the expectation values are [0,1,2,3]
    //  therefore we will find number that is not repeated in array [3,0,1,0,1,2,3]
    //  with this problem we use XOR since the same value will return 0 and different will return 1
    //  result will be: 3^0^1^0^1^2^3 = 0^0^1^1^2^3^3 = 0^0^2^0 = 0^2^0 = 2^0 = 2
    public int missingNumber(int[] nums) {
        int result = nums.length;        
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }
}
