class Solution {  
    //O(logn) time complexity without using built-in function
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (high > low) {
            char cLow = s.charAt(low);
            char cHigh = s.charAt(high);
            if (!isValidChar(cLow)) {
                low++;
                continue;
            }
            
            if (!isValidChar(cHigh)) {
                high--;
                continue;
            }
            
            if (getLowerCase(cLow) != getLowerCase(cHigh)) return false;
            high--;
            low++;
        }
        return true;

    }
    
    public boolean isValidChar(char c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        if (c >= '0' && c <= '9') return true;
        return false;
    }
    
    public char getLowerCase(char c) {
        return (c >= 'A' && c <= 'Z') ? (char)(c+32) : c;
    }
    
    //O(logn) time complexity with built-in function
//     public boolean isPalindrome(String s) {
//         int low = 0;
//         int high = s.length() - 1;
//         while (high > low) {
//             char cLow = s.charAt(low);
//             char cHigh = s.charAt(high);
//             if (!Character.isLetterOrDigit(cLow)) {
//                 low++;
//                 continue;
//             }
//             if (!Character.isLetterOrDigit(cHigh)) {
//                 high--;
//                 continue;
//             }
//             if (Character.toLowerCase(cLow) != Character.toLowerCase(cHigh)) return false;
            
//             high--;
//             low++;
//         }
//         return true;

//     }
  
      //O(n) time complexity
//     public boolean isPalindrome(String s) {
        
//         StringBuilder str = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) str.append(c);
//             else if (c >= 'A' && c <= 'Z') {
//                 //convert upper-case character to lower-case character
//                 str.append((char)(c+32));
//             }
//         }
                
//         for (int i = 0, j = str.length() - 1; i < j; i++, j--) 
//         {
//             if (str.charAt(i) != str.charAt(j)) return false;
//         }
//         return true;
//     }
    
}
