class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] row = new Integer[rowIndex + 1];
        Arrays.fill(row, 0);
        row[0] = 1;
    
        for (int idx = 1; idx <= rowIndex; idx++) {
            for (int i = idx; i > 0; i--) {
                row[i] = row[i] + row[i - 1];
            }
        }
        return Arrays.asList(row);
    }
}
