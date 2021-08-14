class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i< chars.length; i++) {
            char c = chars[i];
            if (c == 'A') absent++;
            if (absent >= 2) return false;
            
            if (c == 'L' && i-1 >= 0  && chars[i-1] == 'L') late++;
            if (c != 'L' && late < 2) late = 0;
            if (late >= 2) return false;
        }

        return true;
    }
}
