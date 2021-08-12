class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gIdx = 0;
        int sIdx = 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (gIdx < g.length && sIdx < s.length) {
            int childSize = g[gIdx];
            int cookieSize = s[sIdx];
            if (cookieSize >= childSize) {
                count++;
                gIdx++;
                sIdx++;
            }
            else sIdx++;
        }
        return count;
    }
}
