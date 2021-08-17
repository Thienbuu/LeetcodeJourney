class Solution {    
        public String intToRoman(int num) {
        char[] map = new char[1001];
        map[1] = "I";
        map[4] = "IV";
        map[5]  = "V";
        map[9] = "IX";
        map[10] = "X";
        map[40]= "XL";
        map[50] = "L";
        map[90] = "XC";
        map[100] = "C";
        map[400] = "CD";
        map[500] = "D";
        map[900] = "CM";
        map[1000] = "M";
        
        int powerLevel = 0;
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int digit = num%10;
            int level = (int)Math.pow(10, powerLevel++);
            num /= 10;
            boolean isBiggerThan5 = false;
            if (digit == 4 || digit == 9 || digit == 1 || digit == 5) {
                result.append(map[digit*level]);
                continue;
            }
            
            if (digit > 5) {
                isBiggerThan5 = true;
                digit -= 5;
            }
            
            for (int i = digit; i > 0; i--) {
                result.append(map[level]);
            } 
            
            if (isBiggerThan5) result.append(map[5*level]);

            
        }
        return result.reverse().toString();
    }
    
//     public String intToRoman(int num) {
//         String[] map = new String[1001];
//         map[1] = "I";
//         map[4] = "IV";
//         map[5]  = "V";
//         map[9] = "IX";
//         map[10] = "X";
//         map[40]= "XL";
//         map[50] = "L";
//         map[90] = "XC";
//         map[100] = "C";
//         map[400] = "CD";
//         map[500] = "D";
//         map[900] = "CM";
//         map[1000] = "M";
        
//         int temp = num;
//         int divider = 1;
//         StringBuilder result = new StringBuilder();
//         while (temp >= 10) {
//             divider  *= 10;
//             temp /= 10;
//         }
        
//         while (num > 0) {
//             int digit = num/divider;
//             int preDivider = divider;
//             num %=divider;
//             divider /= 10;
//             if (digit == 4 || digit == 9 || digit == 1 || digit == 5) {
//                 result.append(map[digit*preDivider]);
//                 continue;
//             }
            
//             if (digit > 5) {
//                 result.append(map[5*preDivider]);
//                 digit -= 5; 
//             }
//             for (int i = 0; i < digit; i++) {
//                 result.append(map[preDivider]);
//             }
            
//         }
//         return result.toString();
//     }
}
