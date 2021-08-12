class Solution {
    //One time pass
    //O(n)
    public int longestPalindrome(String s) {
        boolean[] chars = new boolean[256];
        char[] sArr = s.toCharArray();
        
        int result = 0;
        for (char c: sArr) {
            chars[c] = !chars[c];
            //if after flip, value back to false, meaning character appears 2 times
            if (!chars[c]) result += 2; 
        }
        //if result and s are not equal, there are characters appear odd times
        if (result < sArr.length) result++;
        return result;
    }
    
    //Two time pass
    //O(n)
//     public int longestPalindrome(String s) {
//         int[] chars = new int[256];
        
//         char[] sArr = s.toCharArray();
//         for (char c : sArr) {
//             chars[c]++;
//         }
        
//         int result = 0;
//         boolean hasOneTimeExistChar = false;
//         for (int val : chars) {
//             if (val != 0 && val%2 == 0) result += val;
//             else if (val%2 != 0 && val > 2) result += val - 1;
            
//             if (val%2 != 0) hasOneTimeExistChar = true;
//         }
//         return hasOneTimeExistChar == true ? result + 1 : result;
//     }
    
    
//     public int longestPalindrome(String s) {
//         int[] chars = new int[52];
//         HashSet<Character> unique = new HashSet<Character>();
        
//         char[] sArr = s.toCharArray();
//         for (char c : sArr) {
//             int idx = c >= 'a' && c <= 'z' ? c - 'a' : c - 'A' + 26;
//             chars[idx]++;
//             if (!unique.contains(c)) unique.add(c);
//         }
        
//         int result = 0;
//         boolean odd = false;
//         for (char c : unique) {
//             int idx = c >= 'a' && c <= 'z' ? c - 'a' : c - 'A' + 26;
//             if (chars[idx]%2 == 0) result += chars[idx];
//             if (chars[idx]%2 != 0 && chars[idx] > 2) result += chars[idx] - 1;
//             if (chars[idx]%2 != 0) odd = true;
//         }
//         return odd == true ? result + 1 : result;
//     }
}
