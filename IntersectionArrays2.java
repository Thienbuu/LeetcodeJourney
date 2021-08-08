class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            if (map1.containsKey(num)) {
                map1.put(num, map1.get(num) + 1);
            }
            else map1.put(num, 1);
        } 
        
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int num : nums2) {
            if (map1.containsKey(num) && map1.get(num) > 0) {
                l.add(num);
                map1.put(num, map1.get(num) - 1);
            }
        }
        int[] result = new int[l.size()];
        for (int i = 0; i< l.size(); i++) {
            result[i] = l.get(i);
        }
        return result;
    }
    
    //Follow up 1: arrays are sorted
//     public int[] intersect(int[] nums1, int[] nums2) {
//         ArrayList<Integer> intersects = new ArrayList<Integer>();
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
        
//         int idx1 = 0;
//         int idx2 = 0;
        
//         while (idx1 < nums1.length && idx2 < nums2.length) {
//             int num1 = nums1[idx1];
//             int num2 = nums2[idx2];
            
//             if (num1 < num2) idx1++;
//             if (num1 > num2) idx2++;
//             if (num1 == num2) {
//                 intersects.add(num1);
//                 idx1++;
//                 idx2++;
//             }
//         }
        
    
//         int[] result = new int[intersects.size()];
//         for (int i = 0; i< intersects.size(); i++) {
//             result[i] = intersects.get(i);
//         }
//         return result;
//     }
    
    //Follow up 2: num1's size is smaller than nums2's size
//     public int[] intersect(int[] nums1, int[] nums2) {
//         ArrayList<Integer> intersects = new ArrayList<Integer>();
//         //always set nums1 is small array
//         if (nums1.length > nums2.length) {
//             int[] temp = nums1;
//             nums1 = nums2;
//             nums2 = temp;
//         }
        
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
        
//         int idx1 = 0;
//         int idx2 = 0;
        
//         while (idx1 < nums1.length) {
//             int num1 = nums1[idx1];
//             int num2 = nums2[idx2];
            
//             if (num1 < num2) idx1++;
//             if (num1 > num2) idx2++;
//             if (num1 == num2) {
//                 intersects.add(num1);
//                 idx1++;
//                 idx2++;
//             }
//         }
        
    
//         int[] result = new int[intersects.size()];
//         for (int i = 0; i< intersects.size(); i++) {
//             result[i] = intersects.get(i);
//         }
//         return result;
//     }
}
