class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> intersect = new HashSet<Integer>();
        
        for (int num : nums1) set.add(num);
        for (int num : nums2) {
            if (set.contains(num))  intersect.add(num); 
        }

        int[] result = new int[intersect.size()];
        int idx = 0;
        for (int num : intersect) {
            result[idx++] = num;
        }
        
        return result;
    }
}
