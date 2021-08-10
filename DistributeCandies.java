class Solution {
    public int distributeCandies(int[] candyType) {
        int maxCandy = candyType.length/2;
        HashSet<Integer> uniques = new HashSet<Integer>(maxCandy);
        for (int type : candyType) {
            uniques.add(type);
            if (uniques.size() == maxCandy) return maxCandy;
        }
        return uniques.size();
    }
    
    // public int distributeCandies(int[] candyType) {
    //     int maxCandyEat = candyType.length/2;
    //     int numberOfTypes = 0;
    //     HashSet<Integer> uniques = new HashSet<Integer>();
    //     for (int type : candyType) {
    //         if (uniques.add(type)) {
    //             if (++numberOfTypes == maxCandyEat) return maxCandyEat;
    //         }
    //     }
    //     return numberOfTypes;
    // }
}
