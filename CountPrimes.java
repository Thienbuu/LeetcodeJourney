class Solution {
    //Use Sieve of Eratosthenes algorithm with optimization
    //Theory: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
    public int countPrimes(int n) {
        if (n < 3) return 0;
        boolean[] prime = new boolean[n];
        //even number is not prime, therefore maximum prime number is n/2
        int count = n/2;
        //iterate only odd number until root square of n to find all composite number
        for (int i = 3; i < Math.sqrt(n) ; i+=2) {
            //if current number was checked as not prime, ignore
            if (prime[i]) continue;
            //use algorithm to find composite number
            //square of a odd number is odd number
            //we ignore even number, therefore we add 2*i every cycle to ignore even number
            //because odd number + even number = odd number
            for (int j = i*i; j < n; j += 2*i) {
                //avoid duplicate composite
                //ex: 75 
                if (!prime[j]) {
                    prime[j] = true;
                    //reduce the maximum of prime
                    count--;
                }
            }
        }
        
        return count;
    }
}
