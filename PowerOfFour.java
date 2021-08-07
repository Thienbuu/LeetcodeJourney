class Solution {
    //Idea:
    // - n is power of 2
    // - the number of 0 bit is even, or we can say that position of 1 bit is odd
    //Example:
    //   4: 100
    //   8: 1000 -> because number of 0 bits is odd, therefore 8 is not power of 4
    //Solution:
    // - n is power of 2: n&(n-1) == 0
    //   Ex: 
    //      4&3 = 100 & 011 = 0
    //      3&2 = 11  & 10 = 10 = 2
    // - to check if position of 1 bit is odd we use 0xAAAAAAA to check the result of AND operator is 0
    //   Ex: 4&0xAAAAAAA = 
    //       0000 0000 0000 0000 0000 0000 0000 0100 & 1010 1010 1010 1010 1010 1010 1010 1010 1010 1010 = 0
    //   with 0xAAAAAAAA, position of 1 bits are even, therefore if n has any 1 bit at even position the result will not be 0
    //   Ex: 2x0xAAAAAAAA = 0010 & 1010 = 0010 = 2 != 0
    //O(1)
    public boolean isPowerOfFour(int n) {
        boolean isPowerOf2 = (n&(n-1)) == 0;
        boolean is1BitAtOddPos = (n&(0xAAAAAAAA)) == 0;
        
        return n > 0 && isPowerOf2 && is1BitAtOddPos;
    }
    
    //Loop
    // public boolean isPowerOfFour(int n) {
    //     while (n > 1) {
    //         if (n%4 != 0) return false;
    //         n /= 4;
    //     }
    //     return n > 0;
    // }
    
    //Recursion
    // public boolean isPowerOfFour(int n) {
    //     if (n <= 0) return false;
    //     if (n == 1) return true;
    //     if (n%4 != 0) return false;
    //     return isPowerOfFour(n/4);
    // }
}
