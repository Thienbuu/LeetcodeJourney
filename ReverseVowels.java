class Solution {    
    public String reverseVowels(String s) {
        if (s.isEmpty()) return null;
        
        char[] arr = s.toCharArray();
        int low = 0;
        int high = arr.length - 1;
                
        while (high > low) {
            char lowC = arr[low];
            char highC = arr[high];
            
            if (!isVowel(lowC)) low++;
            if (!isVowel(highC)) high--;
            
            if (isVowel(lowC) && isVowel(highC)) {
                if (lowC != highC) {
                    arr[low] = highC;
                    arr[high] = lowC;
                } 
                low++;
                high--;
            }
        }
        
        StringBuilder str = new StringBuilder();
        for (char c : arr) {
            str.append(c);
        }
        
        return str.toString();
    }
    
    public boolean isVowel(char c) {
        //c is lower case
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        //c is upper case
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return true;
        return false;
    }
}
