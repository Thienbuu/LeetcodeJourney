class Solution {
    //If the number of remaining stone if smaller than 4
    //the return will always true, because we always have at least 1 way to win game by remove 3 stones
    //we have the cycle is 1 2 3 4 = win win win lose
    //then with 5 6 7 8 = (4+1) (4+2) (4+3) (4+4) is also = win win win lose
    //with this cycle we can have the formular f(4x+1) f(4x+2) f(4x+3) f(4x) = win win win lose 
    //f(4x) = n means n is divisible by 4
    //therefore if n is divisible by 4, then we always lose
    //-> to win this game, the number of stone will not be divisible by 4
    public boolean canWinNim(int n) {
        return n%4 != 0;
    }
}
