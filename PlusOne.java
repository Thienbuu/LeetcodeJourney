class Solution {
    public int[] plusOne(int[] digits) {
        int remain = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + remain) % 10;
        
            if (digits[i] != 0) {
                remain = 0;
                break;
            }
            else {
                remain = 1;
            }
        }
        
        //use only for 999 case
        if (remain == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                result[i+1] = digits[i];
            }
            return result;
        } 
        
        
        return digits;
    }
}
