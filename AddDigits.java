class Solution {
    
    //Using formula in this article
    //https://en.wikipedia.org/wiki/Digital_root
    //We have
    //       |- 0       if n = 0
    //dr(n) =|- b-1     if n%(b-1) = 0
    //       |- n%(b-1) if n%(b-1) != 0
    //With b (mean base) is 10 we can get this
    //       |- 0       if n = 0
    //dr(n) =|- 9     if n%9 = 0
    //       |- n%9 if n% != 0
    public int addDigits(int num) {
        if (num == 0) return 0;
        return num%9 == 0 ? 9 : num%9;
    }
    
    //Naive solution
//     public int addDigits(int num) {
//         int temp = 0;

//         int origin = num;
//         int test = origin%9;
//         while (num != 0) {
//             temp += num%10;
//             num /= 10;

//             if (num == 0 && temp < 10) {
//                 System.out.printf("Digital root of %d: %d, %d mod 9 = %d\n", origin, temp, origin, origin%9);
                
//                 return temp;
//             }
//             if (num == 0) {
//                 num = temp;
//                 temp = 0;
//             }
//         }
//         return 0;
//     }
}
