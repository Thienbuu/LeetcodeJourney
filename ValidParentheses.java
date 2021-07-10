class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> opening = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // if closing bracket
            if (c == ')' || c == ']' || c == '}') {
                // if stack empty then this string invalid
                if (opening.empty()) {
                    return false;
                }
                // if current opening bracket does not match closing bracket then string invalid
                if (map.get(s.charAt(i)) != opening.peek()) {
                    return false;
                }
                // if match bracket, pop opening bracket
                opening.pop();
            }
            else {
                // add new opening bracket to stack
                opening.push(c);
            }
        }
        
        return opening.empty() == true;
    }
}
