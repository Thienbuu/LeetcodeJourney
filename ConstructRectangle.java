class Solution {
    //Neater version
    public int[] constructRectangle(int area) {
        int[] size = new int[2];
        int i = (int)Math.sqrt(area);
        while (area%i != 0 && i-- != 0 ) {}
        size[0] = area/i;
        size[1] = i;
        return size;
    }
    
    // Solution
    // public int[] constructRectangle(int area) {
    //     int[] size = new int[2];
    //     int sqrt = (int)Math.sqrt(area);
    //     for (int i = sqrt; i >= 1; i--) {
    //         if (area%i == 0) {
    //             size[0] = area/i;
    //             size[1] = i;
    //             break;
    //         }
    //     }
    //     return size;
    // }
}
