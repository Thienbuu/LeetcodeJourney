class Solution {
    public int firstUniqChar(String s) {
        int[] charAppearances = new int[26];
        
        char[] sChars = s.toCharArray();
        
        for (char c : sChars) {
            charAppearances[c-'a']++;
        }
        
        for (int i = 0; i < sChars.length; i++) {
            char c = sChars[i];
            if (charAppearances[c-'a'] == 1) return i;
        }
        return -1;
    }
    
    
//     public int firstUniqChar(String s) {
//         int[] charFirstIdx = new int[256];
//         Arrays.fill(charFirstIdx, -1);
//         HashSet<Character> uniqueChars = new HashSet<Character>();
        
//         char[] sChars = s.toCharArray();
        
//         for (int i = 0; i < sChars.length; i++) {
//             char c = sChars[i];
//             if (charFirstIdx[c + 0] != -1) {
//                 uniqueChars.remove(c);
//             }
//             else {
//                 uniqueChars.add(c);
//                 charFirstIdx[c + 0] = i;
//             }
//         }
        
//         int firstIdx = -1;
//         for(char c : uniqueChars) 
//         {
//             if (firstIdx == -1 || firstIdx > charFirstIdx[c]) firstIdx = charFirstIdx[c];
//         }
//         return firstIdx;
//     }
}
