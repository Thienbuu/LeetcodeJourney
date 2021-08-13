class Solution {
    public String[] findRelativeRanks(int[] scores) {
        HashMap<Integer, Integer> indices = new HashMap<Integer, Integer>();
        for (int i = 0; i < scores.length; i++) {
            indices.put(scores[i], i);
        }
        
        Arrays.sort(scores);
        
        String[] places = new String[scores.length];
        for (int i = scores.length - 1, place = 1; i >= 0; i--, place++) {
            int idx = indices.get(scores[i]);
            if (place == 1) places[idx] = "Gold Medal";
            else if (place == 2) places[idx] = "Silver Medal";
            else if (place == 3) places[idx] = "Bronze Medal";
            else places[idx] = Integer.toString(place);
        }
        return places;
    }
}
