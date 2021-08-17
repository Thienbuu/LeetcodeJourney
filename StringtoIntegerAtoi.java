class Solution {
    public int myAtoi(String s) {
        //1. Empty string
        if (s.length() == 0) return 0;
        char[] chars = s.toCharArray();
        boolean isNegative = false;
        int result = 0, length = chars.length, idx = 0;
        
        //2.Ignore all leading space
        while (idx < length && chars[idx] == ' ') idx++;
        
        //3. End of string, string only contains space
        if (idx == length) return 0;
        
        //4. Handle signs
        if (chars[idx] == '-' || chars[idx] == '+') {
            isNegative = chars[idx] == '-' ? true : false;
            idx++;
        }
        
        //5. Convert to number
        while (idx < length) {
            char c = chars[idx++];
            //If character is not-digit
            if (c < '0' || c > '9') break;
            //Check if bigger max value
            if ((Integer.MAX_VALUE - (c - '0'))/10 < result) return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            //Add new digit
            result = result*10 + (c - '0');
        }
        
        return isNegative ? -1*result : result;
    }
}
