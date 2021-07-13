class Solution {
    public String addBinary(String a, String b) {
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while (aIdx >= 0 || bIdx >= 0 || carry > 0) {
            int sum = carry;
            if (aIdx >= 0) {
                sum += a.charAt(aIdx) - '0';
                aIdx--;
            }
            
            if (bIdx >= 0) {
                sum += b.charAt(bIdx) - '0';
                bIdx--;
            }
            carry = sum/2;
            result.append(sum%2);
        }
        
        return result.reverse().toString();
    }
}
