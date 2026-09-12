class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;  // positions with 5 choices: 0,2,4,6,8
        long odd = n / 2;         // positions with 4 choices: 2,3,5,7

        long ans = (power(5, even) * power(4, odd)) % MOD;

        return (int) ans;
    }

    public long power(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp = exp / 2;
        }

        return result;
    }
}