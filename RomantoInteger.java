class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        if (s.length() == 0) {
            return 0;
        }
        
        int idx = s.length() - 2;
        int result = map.get(s.charAt(idx + 1));
        while (idx >= 0) {
            int prev = map.get(s.charAt(idx + 1));
            int curr = map.get(s.charAt(idx));
            if (prev > curr) {
                result -= curr;
            }
            else {
                result += curr;
            }
            
            idx--;
        }
        
        return result;
    }
}
