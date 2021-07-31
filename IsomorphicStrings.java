class Solution {
    //Use lookup table to reduce time complexity compare to HashMap
    //containsKey take O(n) time to find element
    //with lookup table we only need constant time
    //Time complexity: O(n)
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        //create 8-bit ASCII lookup table
        char[] sLookup = new char[256];
        char[] tLookup = new char[256];
                
        for (int i = 0; i < s.length(); i++) {
            char sC = sArr[i];
            char tC = tArr[i];
            
            //if current char is not set in lookup table, set it
            if (sLookup[sC] == 0)  sLookup[sC] = tC;
            if (tLookup[tC] == 0) tLookup[tC] = sC;
                           
            if (sLookup[sC] != tC || tLookup[tC] != sC) return false;

        }
        return true;
    }
    
//     //HashMap
//     //Time complexity: O(n^2) 
//     public boolean isIsomorphic(String s, String t) {
//         if (s.length() != t.length()) return false;
        
//         HashMap<Character, Character> map = new HashMap<Character, Character>();
//         for (int i = 0; i < s.length(); i++) {
//             char sC = s.charAt(i);
//             char tC = t.charAt(i);
            
//             if (!map.containsKey(sC) && !map.containsValue(tC)) {
//                 map.put(sC, tC);
//             }
//             else if (!map.containsKey(sC) || map.get(sC) != tC) {
//                 return false;
//             }
//         }
//         return true;
//     }    
}
