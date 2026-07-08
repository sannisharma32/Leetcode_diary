class Solution {

    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();

        // Store non-zero digits and their original positions
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> digits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d != 0) {
                pos.add(i);
                digits.add(d);
            }
        }

        int m = digits.size();

        // prefix digit sum
        long[] prefixSum = new long[m + 1];

        // prefix concatenated number (mod MOD)
        long[] prefixNum = new long[m + 1];

        // powers of 10
        long[] pow10 = new long[m + 1];
        pow10[0] = 1;

        for (int i = 0; i < m; i++) {
            prefixSum[i + 1] = prefixSum[i] + digits.get(i);
            prefixNum[i + 1] = (prefixNum[i] * 10 + digits.get(i)) % MOD;
            pow10[i + 1] = (pow10[i] * 10) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = queries[i][0];
            int right = queries[i][1];

            int l = lowerBound(pos, left);
            int r = upperBound(pos, right) - 1;

            if (l > r) {
                ans[i] = 0;
                continue;
            }

            long digitSum = prefixSum[r + 1] - prefixSum[l];

            int len = r - l + 1;

            long value =
                    (prefixNum[r + 1]
                    - prefixNum[l] * pow10[len] % MOD
                    + MOD) % MOD;

            ans[i] = (int) ((value * digitSum) % MOD);
        }

        return ans;
    }

    // first index >= target
    private int lowerBound(ArrayList<Integer> list, int target) {

        int low = 0;
        int high = list.size();

        while (low < high) {

            int mid = (low + high) / 2;

            if (list.get(mid) < target)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }

    // first index > target
    private int upperBound(ArrayList<Integer> list, int target) {

        int low = 0;
        int high = list.size();

        while (low < high) {

            int mid = (low + high) / 2;

            if (list.get(mid) <= target)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
}