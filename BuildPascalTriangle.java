class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        for (int idx = 0; idx < numRows; idx++) {
            //If not first row then get previous row to build current row
            List<Integer> preRow = idx > 0 ? result.get(idx - 1) : new LinkedList();
            List<Integer> row = new LinkedList<Integer>();
            //Build current row
            for (int i = 0; i <= idx; i++) {
                if (i == 0 || i == idx) row.add(1);
                else row.add(preRow.get(i - 1) + preRow.get(i));
            }
            result.add(row);
        }
        return result;
    }
}
