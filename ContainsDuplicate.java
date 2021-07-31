class Solution {
    //Using Hashset
    //If value already store in hashset, add method will return false
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) return false;
        
        HashSet<Integer> unique = new HashSet<Integer>();
        for (int num : nums) {
            if (!unique.add(num)) return true;
        }
        return false;
    }
}
