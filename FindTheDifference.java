class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int i = 0;
        while (i < sChars.length) {
            result ^= sChars[i]^tChars[i];
            i++;
        }
        result ^= tChars[i];
        return result;
    }
    
//     public char findTheDifference(String s, String t) {
//         int[] chars = new int[256];
        
//         char[] sChars = s.toCharArray();
//         char[] tChars = t.toCharArray();
//         for (char c : sChars) {
//             chars[c]++;
//         }
        
//         char result = 'a';
//         for (char c : tChars) {
//             if (--chars[c] == -1) {
//                 result = c;
//                 break;
//             };
//         }
        
//         return result;
//     }
    

}
