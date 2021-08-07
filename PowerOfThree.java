class Solution {
    //Cheating if we know that 3^19 is the bigger power of 3 in Integer
    //O(1)
    // public boolean isPowerOfThree(int n) {
    //     int maxPowerOf3 = 1162261467;
    //     return n <= 0 ? false: maxPowerOf3%n == 0;
    // }
    
    //Find the largest power of 3 in Integer
    //O(1)
    public boolean isPowerOfThree(int n) {
        int maxPowerOf3 = (int)Math.pow(3, (int)(Math.log(Integer.MAX_VALUE)/Math.log(3)));
        return n <= 0 ? false: maxPowerOf3%n == 0;
    }
    
    //Loop
    // public boolean isPowerOfThree(int n) {
    //     if (n <= 0) return false;
    //     while (n > 1) {
    //         if (n%3 != 0) return false;
    //         n /=3;
    //     }
    //     return true;
    // }
    
    //Recursion
    // public boolean isPowerOfThree(int n) {
    //     if (n <= 0) return false;
    //     if (n == 1) return true;
    //     if (n%3 != 0) return false;
    //     return isPowerOfThree(n/3);
    // }
}
