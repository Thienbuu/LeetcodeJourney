class Solution {
    //Amortize O(n)
    //Explanation: https://leetcode.com/problems/next-greater-element-i/discuss/97595/Java-10-lines-linear-time-complexity-O(n)-with-explanation
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> greater = new Stack<Integer>();
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            while (!greater.empty() && greater.peek() < num) {
                int top = greater.pop();
                map.put(top, num);
            }
            greater.push(num);
        }
        
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }
        
    //O(n^2)
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         int[] result = new int[nums1.length];
//         for (int i = 0; i < nums2.length; i++) {
//             map.put(nums2[i], -1);
//             for (int j = i + 1; j < nums2.length; j++) {
//                 if (nums2[j] > nums2[i]) {
//                     map.put(nums2[i], nums2[j]);
//                     break;
//                 }
//             }
//         }
        
//         for (int i = 0; i < nums1.length; i++) {
//             result[i] = map.get(nums1[i]);
//         }
//         return result;
//     }
}
