class Solution {    
    //Trivial solution
    public String[] findWords(String[] words) {
        int[] alphabet = createKeyboard();
        ArrayList<String> result = new ArrayList<String>();
        outter: for (String word : words) {
            char[] chars = word.toCharArray();
            int row = alphabet[chars[0]];
            //Check if all character are same row 
            for(char c : chars) {
                if (row != alphabet[c]) continue outter;
            }
            //If same row add to list
            result.add(word);
        }
        return result.toArray(new String[0]);
    }
    
    //Set row number for each character
    public int[] createKeyboard() {
        int[] alphabet = new int[128];
        char c = 'a';
        while (c <= 'z') {
            switch (c) {
                case 'a','s','d','f','g','h','j','k','l': alphabet[c] = 2;  alphabet[c-32] = 2; break;
                case 'z','x','c','v','b','n','m': alphabet[c] = 3; alphabet[c-32] = 3; break;
                default: alphabet[c] = 1; alphabet[c-32] = 1;
            }
            c++;
        }
        return alphabet;
    }
}
