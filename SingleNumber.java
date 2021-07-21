class Solution {
   
    public int singleNumber(int[] nums) {
        int result = 0;
        //Using exclusive or to find repeated value
        //exclusive or: 2 same value will return 0, otherwise 1
        //ex: 4^2^4 = 4^4^2 = 0100 ^ 0100 ^ 0010 = 0010
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
