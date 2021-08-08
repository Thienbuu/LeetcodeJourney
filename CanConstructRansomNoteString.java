class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charAppearTimes = new int[26];

        //count appearance times of each character in magazine string
        for (int i = 0; i < magazine.length(); i++) {
            int cIdx = magazine.charAt(i) - 'a';
            charAppearTimes[cIdx] += 1; 
        }
        
        //check if every character in ransomNote has appearance times smaller than magazine
        for (int i = 0; i < ransomNote.length(); i++) {
            int cIdx = ransomNote.charAt(i) - 'a';
            if (--charAppearTimes[cIdx] < 0) return false;
        }
        return true;
    }
}
