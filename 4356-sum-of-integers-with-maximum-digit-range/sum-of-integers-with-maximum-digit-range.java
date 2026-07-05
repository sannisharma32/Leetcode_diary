class Solution {
    public int maxDigitRange(int[] nums) {
        
        int sum=0;

        int maxrange=-1;
        
        for(int num:nums){
            maxrange=Math.max(maxrange,findrange(num));
        }
        

        for(int num:nums){
            if(maxrange== findrange(num)){
                sum+=num;

            }
        }

        return sum;
        
    }


    int findrange(int num){
        int maxDigit = 0;
        int minDigit = 9;

        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            minDigit = Math.min(minDigit, digit);
            num /= 10;
        }

        return maxDigit - minDigit;

       
    }
}