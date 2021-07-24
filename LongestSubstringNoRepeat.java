class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        StringBuilder currStr = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            currStr = currStr.delete(0, currStr.toString().indexOf(c) + 1);
            currStr.append(c);
            
            max = Math.max(max, currStr.length());
        }
        return max;
    }
    
    //Using Hashmap
    public int lengthOfLongestSubstring1(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> indices = new HashMap<Character, Integer>();
        
        int firstIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (indices.containsKey(c) && indices.get(c) >= firstIdx) {
                firstIdx = indices.get(c) + 1;
            }
            
            indices.put(c, i);
            maxLength = Math.max(maxLength,  i - firstIdx + 1);
        }
        return maxLength;
    }
}
