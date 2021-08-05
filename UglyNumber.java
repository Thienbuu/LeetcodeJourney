class Solution {
    public boolean isUgly(int n) {
        int[] nums = new int[]{2,3,5};
        if (n <= 0) return false;
        int prevN = 0;
        //if prevN = N means N is not divisible by 2 3 5
        while (prevN != n) {
            prevN = n;
            for (int num : nums) {
                if (n%num == 0) n = n/num;
            } 
        }
        
        //1 has no prime factors, therefore all of its prime factors are limited to 2 3 5
        return n == 1 ? true : false;
    }
}
