class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int[] map = new int[256];
        Arrays.fill(map, -1);
        int firstIdx = 0;
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map[c] >= firstIdx) {
                max = Math.max(max, i - firstIdx);
                firstIdx = map[c] + 1;
            }
            map[c] = i;
        }
        max = Math.max(max, chars.length - firstIdx);
        return max;
    }
    
//     public int lengthOfLongestSubstring(String s) {
//         int max = 0;
//         StringBuilder currStr = new StringBuilder();
        
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             currStr = currStr.delete(0, currStr.toString().indexOf(c) + 1);
//             currStr.append(c);
            
//             max = Math.max(max, currStr.length());
//         }
//         return max;
//     }
    
    //Using Hashmap
//     public int lengthOfLongestSubstring(String s) {
//         int maxLength = 0;
//         HashMap<Character, Integer> indices = new HashMap<Character, Integer>();
        
//         int firstIdx = 0;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (indices.containsKey(c) && indices.get(c) >= firstIdx) {
//                 firstIdx = indices.get(c) + 1;
//             }
            
//             indices.put(c, i);
//             maxLength = Math.max(maxLength,  i - firstIdx + 1);
//         }
//         return maxLength;
//     }
}
