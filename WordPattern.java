class Solution { 
    //Using 1 HashMap and 1 HashSet
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] pArr = pattern.toCharArray();    
        
        if (words.length != pArr.length) return false;
        
        HashSet<Character> existedChar = new HashSet<Character>();
        HashMap<String, Character> pairs = new HashMap<String, Character>();
        for (int i = 0; i < words.length; i++) {
            String sWord = words[i];
            Character pChar = pArr[i];
            
            boolean isAddedToSet = existedChar.add(pChar);
            Character preVal = pairs.put(sWord, pChar);
            //if same word but different pattern character are put into hashmap
            //hashset won't add and hashmap put method will return null 
            if (!isAddedToSet && (preVal == null || preVal != pChar)) {
                return false;
            }
            
            //if different word but the same pattern character are put into hashmap
            //hashset will add value and hashmap will return the previous value
            if (isAddedToSet && preVal != null && preVal != pChar) {
                return false;
            }
        }
        return true;
    }
    
        
    //Using 2 HashMap
//     public boolean wordPattern(String pattern, String s) {
//         String[] words = s.split(" ");
//         char[] pArr = pattern.toCharArray();    
        
//         if (words.length != pArr.length) return false;
        
//         Map<String, Character> wordMap = new HashMap<String, Character>();
//         Map<Character, String> charMap = new HashMap<Character, String>();
//         for (int i = 0; i < words.length; i++) {
//             String sWord = words[i];
//             char pChar = pArr[i];
            
            
            
//             if (!wordMap.containsKey(sWord) && !charMap.containsKey(pChar)) {
//                 wordMap.put(sWord, pChar);
//                 charMap.put(pChar, sWord);
//                 continue;
//             }

//             if (!wordMap.containsKey(sWord) || !charMap.containsKey(pChar)) return false;
//             if (wordMap.get(sWord) != pChar) return false;
//         }
//         return true;
//     }
    
    
    //Using 3 HashSet
//     public boolean wordPattern(String pattern, String s) {
//         String[] words = s.split(" ");
//         char[] pArr = pattern.toCharArray();    
        
//         if (words.length != pArr.length) return false;
        
//         HashSet<String> wordSet = new HashSet<String>();
//         HashSet<Character> charSet = new HashSet<Character>();
//         HashSet<String> mixSet = new HashSet<String>();
//         for (int i = 0; i < words.length; i++) {
//             String sWord = words[i];
//             char pChar = pArr[i];
//             String mixWord = sWord + pChar;
//             if (mixSet.add(mixWord)) {
//                 if (!wordSet.add(sWord) || !charSet.add(pChar)) 
//                     return false;
//             }
//         }
//         return true;
//     }
}
