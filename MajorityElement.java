class Solution {
    //Hash Table
//     public int majorityElement(int[] nums) {
//         int result = 0;
        
//         HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//             if (map.get(num) > nums.length/2) {
//                 result = num;
//                 break;
//             }
//         }
//         return result;
//     }
    
    //Moore voting
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;
        for (int num : nums) {
            if (count == 0) 
                result = num;
            if (num != result)
                count--;
            else 
                count++;
        }
        return result;
    }
}
