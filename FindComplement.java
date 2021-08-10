class Solution {
    //Bit manipulation
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num)<<1) - 1;
        return num^mask;
        // return (num^((Integer.highestOneBit(num)<<1) - 1));
    }
    
    //sum of num and number complement = 111...111
    // public int findComplement(int num) {
    //     int sum = 0;
    //     int level = 0;
    //     while (sum < num) {
    //         sum += Math.pow(2,level++);
    //     }
    //     return sum - num;
    // }
    
    //Trivial solution
//     public int findComplement(int num) {
//         int result = 0;
//         int level = 0;
//         while (num != 0) {
//             int flipDigit = (num&1) == 1 ? 0 : 1;
//             if (flipDigit == 1)
//                 result += Math.pow(2, level);
//             level++;
//             num >>= 1;
//         }
        
        
//         return result;
//     }
}
