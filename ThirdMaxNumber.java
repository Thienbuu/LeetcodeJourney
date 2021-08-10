class Solution {
    public int thirdMax(int[] nums) {
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];
        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num < first && (num > second || second == first)) {
                third = second;
                second = num;
            }
            else if (num < second && (num > third || third == second || third == first)) {
                third = num;
            }
        }
        return third == second ? first : third;     
    }
    
    // public int thirdMax(int[] nums) {
    //     Integer first = null;
    //     Integer second = null;
    //     Integer third = null;
    //     for (int num : nums) {
    //         if (first == null) first = num;
    //         else if (num > first) {
    //             third = second;
    //             second = first;
    //             first = num;
    //         }
    //         else if (num < first && (second == null || num > second)) {
    //             third = second;
    //             second = num;
    //         }
    //         else if (second != null && num < second && (third == null || num > third)) {
    //             third = num;
    //         }
    //     }
    //     return third == null ? first : third;     
    // }
    
//     public int thirdMax(int[] nums) {
//         int first = nums[0];
//         int second = nums[0];
//         //Find first and second maximum number
//         for (int num : nums) {
//             if (num > first) {
//                 second = first;
//                 first = num;
//             }
//             else if (num < first && (num > second || second == first)) {
//                 second = num;
//             }
//         }
        
//         //Find third maximum number
//         int third = second;
//         for (int num : nums) {
//             if (num < second && (num > third || third == second)) {
//                 third = num;
//             }
//         }
//         return third == second ? first : third;     
//     }
    
    // public int thirdMax(int[] nums) {
    //     HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
    //     int numberOfMax = 0;
    //     for (int num : nums) {
    //         if (values.isEmpty()) {
    //             values.put(1, num);
    //         }
    //         else if (values.get(1) < num) {
    //             Integer preFirst = values.put(1, num);
    //             Integer preSecond = values.put(2, preFirst);
    //             if (preSecond != null)
    //                 values.put(3, preSecond);
    //         }
    //         else if (values.get(1) > num && (!values.containsKey(2) || values.get(2) < num)) {
    //             Integer preSecond = values.put(2, num);
    //             if (preSecond != null)
    //                 values.put(3, preSecond);
    //         }
    //         else if (values.containsKey(2) && values.get(2) > num && (!values.containsKey(3) || values.get(3) < num)) {
    //             values.put(3, num);
    //         }
    //     }
    //     return values.size() == 3 ? values.get(3) : values.get(1);
    // }
}
