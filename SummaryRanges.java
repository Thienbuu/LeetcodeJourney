class Solution {
    public List<String> summaryRanges(int[] nums) {
        LinkedList<String> result = new LinkedList<String>();
        if (nums.length == 0) return result;
        
        int first = nums[0];
        int pre = nums[0];
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < nums.length; i++) {
            //get all ranges existing 
            int val = nums[i];
            if (pre + 1 != val) {
                result.add(helper(first, pre));
                first = val;
            }
            pre = val;
        }
        
        //the last range from i index to length - 1    
        result.add(helper(first, pre));
        
        return result;
    }
    
    //Create range string helper
    public String helper(int first, int last) {
        StringBuilder str = new StringBuilder();
        if (first == last) {
            str.append(first);
        }
        else {
            str.append(first).append("->").append(last);
        }
        return str.toString();
    }
}
