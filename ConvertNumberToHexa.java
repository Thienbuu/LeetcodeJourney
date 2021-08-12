class Solution {
    //Unsigned Right Shift
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int byteSum = (num&15);
            result.append(hexa[byteSum]); 
            num >>>= 4;
        }
        return result.reverse().toString();
    }
    
    //Signed Right Shift
//     public String toHex(int num) {
//         if (num == 0) return "0";
//         char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
//         StringBuilder result = new StringBuilder();
//         int i = 0;
//         while (i++ < 8 && num != 0) {
//             int byteSum = (num&0xf);
//             result.append(hexa[byteSum]); 
//             num >>= 4;
//         }
//         return result.reverse().toString();
//     }
    
//     public String toHex(int num) {
//         if (num == 0) return "0";
//         char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
//         StringBuilder result = new StringBuilder();
//         int i = 0;
//         int byteSum = 0;
//         int level = 0;
//         while (i < 32 && num != 0) {
//             byteSum += (num&1) * Math.pow(2,level++);
//             num >>= 1;
//             if (level == 4 || num == 0) {
//                 result.append(hexa[byteSum]); 
//                 byteSum = 0;
//                 level = 0;
//             }
//             i++;
//         }
//         return result.reverse().toString();
//     }
}
