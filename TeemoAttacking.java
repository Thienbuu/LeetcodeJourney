class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0 || duration == 0) return 0;
        int count = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int curr = timeSeries[i];
            int next = timeSeries[i+1];
            if (next - curr >= duration) count += duration;
            else count += next-curr;
        }
        //Last attack
        count += duration;
        return count;
    }
}
