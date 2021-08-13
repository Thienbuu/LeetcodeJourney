class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder result = new StringBuilder();
        for (int temp = Math.abs(num); temp != 0; temp /= 7) {
            result.append(temp%7);
        }
        if (num < 0) result.append('-');
        return result.reverse().toString();
    }
}
