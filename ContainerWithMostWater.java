class Solution {
    public int maxArea(int[] height) {
        if (height.length == 0) return 0;
        int area = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            int lowHeight = height[low];
            int highHeight = height[high];
            int currArea = lowHeight > highHeight ? highHeight*(high-low) : lowHeight*(high-low);
            area = currArea > area ? currArea : area;
            if (lowHeight <= highHeight) low++;
            else high--;
        }
        return area;
    }
}
