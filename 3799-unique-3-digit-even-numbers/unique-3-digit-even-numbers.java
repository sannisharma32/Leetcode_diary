class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        // Count frequency of each digit
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Check every 3-digit number
        for (int num = 100; num <= 999; num++) {

            // Number must be even
            if (num % 2 != 0) {
                continue;
            }

            int temp = num;
            int[] needed = new int[10];

            // Extract digits
            for (int i = 0; i < 3; i++) {
                needed[temp % 10]++;
                temp /= 10;
            }

            // Check if available digits are enough
            boolean possible = true;

            for (int d = 0; d <= 9; d++) {
                if (needed[d] > freq[d]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                count++;
            }
        }

        return count;
    }
}