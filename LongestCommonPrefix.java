class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        
        if (strs.length == 1) {
            return strs[0];
        }
        
        //Find shortest String
        String shortestStr = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < shortestStr.length()) {
                shortestStr = strs[i];
            }
        }

        //Find the most common prefix by chopping the last character
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(shortestStr) != 0) {
               shortestStr = shortestStr.substring(0, shortestStr.length()-1);
            }
        }
        return shortestStr;

    }
    
}
