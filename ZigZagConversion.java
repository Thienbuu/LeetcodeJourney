class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int stepBack = 0;
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            stepBack = row > 0 && row < numRows - 1 ? 2*row : 0;
            for (int idx = row; idx < chars.length || idx - stepBack < chars.length; idx+=numRows*2-2) {
                if (idx > numRows && stepBack != 0) {
                    // System.out.printf("%s ", chars[idx-stepBack]);
                    result.append(chars[idx-stepBack]);
                }
                if (idx < chars.length) {
                    result.append(chars[idx]);
                    // System.out.printf("%s ", chars[idx]);
                }
            }
            // System.out.println();
        }
        return result.toString();
    }
}
