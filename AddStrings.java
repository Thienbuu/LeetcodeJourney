class Solution {    
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        
        char[] num1Arr = num1.toCharArray();
        char[] num2Arr = num2.toCharArray();
        
        int idx1 = num1Arr.length - 1;
        int idx2 = num2Arr.length - 1;
        int carry = 0;
        while (idx1 >= 0 || idx2 >= 0) {
            int sum = carry;
            sum += idx1 >= 0 ? num1Arr[idx1--] - '0' : 0;
            sum += idx2 >= 0 ? num2Arr[idx2--] - '0' : 0;
            
            carry = sum >= 10 ? 1 : 0;
            result.append(sum >= 10 ? sum - 10 : sum);
        }
        if (carry == 1) result.append(carry);
        return result.reverse().toString();
    }
}
