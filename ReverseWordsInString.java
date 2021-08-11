class Solution {
    public String reverseWords(String s)  {
        StringBuilder words = new StringBuilder();
        char[] sArr = s.toCharArray();
        int firstIdx = 0;
        for (int i = 0; i < sArr.length; i++) {
            char c = sArr[i];
            if (c == ' ') {
                reverse(sArr, firstIdx, i-1);
                firstIdx = i + 1;
            }
        }
        reverse(sArr, firstIdx, sArr.length - 1);
        return new String(sArr);
    }
    
    public void reverse(char[] sArr, int firstIdx, int lastIdx) {
        while (firstIdx < lastIdx) {
            char temp = sArr[firstIdx];
            sArr[firstIdx++] = sArr[lastIdx];
            sArr[lastIdx--] = temp;
        }
    }
    
    
//     public String reverseWords(String s) {
//         Stack<String> reverseWords = new Stack<String>();
//         StringBuilder words = new StringBuilder();
//         for (int i = s.length()-1; i >= 0; i--) {
//             char c = s.charAt(i);
//             if (c == ' ') {
//                 reverseWords.push(words.toString());
//                 words.setLength(0);
//             }
//             else words.append(c);
//         }
        
//         while (!reverseWords.empty()) {
//             words.append(" ").append(reverseWords.pop());
//         }
//         return words.toString();
//     }
    
    // public String reverseWords(String s) {
    //     String[] words = s.split(" ");
    //     StringBuilder reversedStr = new StringBuilder();
    //     for (int i = 0; i < words.length; i++) {
    //         StringBuilder word = new StringBuilder(words[i]);
    //         if (i != 0) reversedStr.append(" ");
    //         reversedStr.append(word.reverse());
    //     }
    //     return reversedStr.toString();
    // }
    
    // public String reverseWords(String s) {
    //     char[] sArr = s.toCharArray();
    //     StringBuilder reversedStr = new StringBuilder();
    //     StringBuilder reversedWord = new StringBuilder();
    //     for (int i = 0; i < sArr.length; i++) {
    //         char c = sArr[i];
    //         if (c == ' ') {
    //             reversedStr.append(reversedWord.reverse()).append(' ');
    //             reversedWord.setLength(0);
    //         }
    //         else 
    //             reversedWord.append(c);
    //     }
    //     reversedStr.append(reversedWord.reverse());
    //     return reversedStr.toString();
    // }
}
