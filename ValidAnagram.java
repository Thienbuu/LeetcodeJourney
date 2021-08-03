class Solution {   
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] lookup = new int[65535];
        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int count = 0;
        for (char c : sChars) {
            lookup[c]++;
            count++;
        }
        
        for (char c : tChars) {
            if (lookup[c] == 0) return false;
            lookup[c]--;
            count--;
        }
    
        return count == 0;
    }
}
