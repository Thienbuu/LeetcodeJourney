class Solution {
    //Explanation: https://leetcode.com/problems/counting-bits/discuss/270693/Intermediate-processsolution-for-the-most-voted-solution-i.e.-no-simplificationtrick-hidden
    //We have this pattern:
    // For even number
    //  Ex:   10: 1010
    //        5:  101
    //        
    //        14: 1110
    //        7 : 111
    //     We see that 10,5 and 14,7 have the same number of 1's in binary representation. Also 5 = 10>>1, 7 = 14>>1
    //     Therefore with even number we can find out the number of 1's is same as its shifted right 1 bit number
    // For odd number: the number 1's is always have more 1's than its (n-1)
    //  Ex:  5: 101   
    //       4: 100
    //       
    //       9: 1001
    //       8: 1000
    //     Therefore we can count number of 1's of number n is equal to its (n-1)'s 1's plus 1
    // In general, we have this logic:
    //     If number is even: 1's of num = 1's of (num>>1)
    //     If number is odd:  1's of num = 1's of (num - 1) + 1
    // Or for shorter, we have: 1's of (num>>1) + (num&1)
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if ((i&1) == 0) 
                ans[i] = ans[i>>1];
            else 
                ans[i] = ans[i-1] + 1;
            // ans[i] = ans[i>>1] + (i&1);
        }
        return ans;
    }
}
