class Solution {
    //Using bitwise operator: N&(N-1)
    //Time complexity: O(1);
    //2ms
    //every power of two has this pattern: 0, 10, 100, 10..0
    //and its subtract 1 number has this pattern: 1, 11, 111, 11...1
    //therefore a number is power of 2 only when N AND (N-1) = 0
    //Ex: 
    //   True case: 8 = 1000 = 2^3, 7 = 0111 -> 8&7 = 1000 & 0111 = 0
    //   False case: 10: 1010, 9 = 0111 -> 10&9 = 1010 & 0111 = 0010 
    // public boolean isPowerOfTwo(int n) {
    //     if (n <= 0) return false;
    //     return (n&(n-1)) == 0;
    // }
    
    //Using bitwise operator: N&-N
    //Time complexity: O(1)
    public boolean isPowerOfTwo(int n) {
        if(n<=0)    return false;
        n-=(n&-n);
        return n==0;
    }
    
    //Recursion
    //Time complexity: O(log(n))
    // public boolean isPowerOfTwo(int n) {
    //     if (n <= 0) return false;
    //     if (n == 1) return true;
    //     if (n%2==1) return false;
    //     if (n==2) return true;
    //     return isPowerOfTwo(n/2);
    // }
    
    //Recursion with bitwise
    //O(log(n))
    // public boolean isPowerOfTwo(int n) {
    //     if (n <= 0) return false;
    //     if (n == 1) return true;
    //     if ((n&1)==1) return false;
    //     if (n==2) return true;
    //     return isPowerOfTwo(n>>1);
    // }

    //Iteration
    //Time complexity: O(log(n))
//     public boolean isPowerOfTwo(int n) {
//         if (n <= 0) return false;
//         if (n == 1) return true;
        
//         while (n >= 2) {
//             if (n==2) return true;
//             if (n%2==1) return false;
//             n /= 2;
//         }
//         return false;
//     }
}
