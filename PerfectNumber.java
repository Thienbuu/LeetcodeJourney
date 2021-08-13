class Solution {
    //A perfect number is a number which satisfy below formula
    // num = 2^(i-1)*(2^i - 1)
    // Where: 
    //       - i: prime
    //       - 2^i - 1: prime
    public boolean checkPerfectNumber(int num) {
        if (num <= 0 | num%2 != 0) return false;
        boolean flag = true;
        int i = 2;
        while (flag) {
            if (isPrime(i) && isPrime((int)Math.pow(2,i) -1)) {
                int left = (int)Math.pow(2,i-1);
                int right = (int)Math.pow(2,i) - 1;
                if (left > num/right) flag = false;
                if (left*right == num) return true;
            }
            i++;
        }
        return false;
    }
    
    public boolean isPrime(int n) {
        if (n!=2 && n%2 == 0) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
    
     // public boolean checkPerfectNumber(int num) {
    //     if (num <= 0 | num%2 != 0) return false;
    //     int sum = 1;
    //     for (int i = 2; i <= Math.sqrt(num); i++) {
    //         if (num%i == 0) {
    //             sum+= i;
    //             if (i != num/i) sum+= num/i;
    //         }
    //     }
    //     return sum == num;
    // }
}
